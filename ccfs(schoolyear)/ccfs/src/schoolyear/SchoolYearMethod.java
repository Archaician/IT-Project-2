/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package schoolyear;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author Lenovo
 */
public class SchoolYearMethod {
    
    private static Connection con;
    
    public static void connection() throws  Exception {
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ccfs?"
                + "user=root&password=");
        //connect to database but this will be merge on system integration
    }
    
//    public static void createSchoolYear() throws Exception {
//        PreparedStatement prepedSt = con. prepareStatement("INSERT INTO `schoolyear`(`yearid`, `yearstart`, `yearend`, `totalAtt`, `atteID`, `feeID`, `Status`) VALUES('2','2020','2021','2','2','2','2')");
////        prepedSt.setString(1,cYear.sYear[0]);
////        prepedSt.setString(2,cYear.sYear[1]);
//        prepedSt.executeUpdate();
//    }
    
    public static void addSchoolYear(SchoolYear schoolYear) throws Exception {
        PreparedStatement prepedSt = con.prepareStatement("INSERT INTO "
                + "`schoolyear`(`yearstart`, `yearend`, `totalAtt`, "
                + "`atteID`, `feeID`, `Status`) VALUES (?,?,?,?,?,?)");
        prepedSt.setInt(1,Integer.parseInt(schoolYear.sYear[0]));
        prepedSt.setString(2,schoolYear.sYear[1]);
        prepedSt.setString(3,schoolYear.sYear[2]);
        prepedSt.setInt(4,Integer.parseInt(schoolYear.sYear[3]));
        prepedSt.setInt(5,Integer.parseInt(schoolYear.sYear[4]));        
        prepedSt.setInt(6,Integer.parseInt(schoolYear.sYear[5])); 
        prepedSt.execute();
    }
    
    
    
    
    
}

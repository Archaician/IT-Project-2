/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Fees;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author @Imran
 * @version 1.0
 */
public class FeesMethod {
    
    private static Connection con;
    //private static Statement st;
    //private static ResultSet rs;
    
    public static void connection() throws  Exception {
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ccfs?"
                + "user=root&password=");
        //connect to database but this will be merge on system integration
    }
    
    public static void insertFees(Fees fees) throws Exception {
//        ResultSet rs;
//        Statement st = null;
//        String idnum = "SELECT IDno FROM enstudent WHERE enid = 2";
//        rs = st.executeQuery(idnum);
//        if (rs.next()) {
//            String id = rs.getString("IDno");

        PreparedStatement prepedSt = con.prepareStatement("INSERT INTO fees"
                + "(feeid, totalfee, feegrade, feepre, IDno) VALUES('?', '?', '?', '?', '?')");
        prepedSt.setString(1, fees.feeInfo[0]);
        prepedSt.setString(2, fees.feeInfo[1]);
        prepedSt.setString(3, fees.feeInfo[2]);
        prepedSt.setString(4, fees.feeInfo[3]);
        prepedSt.setString(5, fees.feeInfo[4]);
        prepedSt.executeUpdate();
        }
    }
    


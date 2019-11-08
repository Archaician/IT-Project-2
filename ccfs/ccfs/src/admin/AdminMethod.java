package admin;
/**
 *
 * @author Adam
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class AdminMethod {
    
    private static Connection con;
    
    public static void connection() throws Exception {
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ccfs?"
                + "user=root&password=");
        //connect to database
    }
    
    public static void closeCon() throws Exception{
        con.close();
    }
    
    public static void createSchoolYear(Admin admin) throws Exception {
        PreparedStatement prepedSt = con.prepareStatement("INSERT INTO "
                + "`schoolyear`(`yearid`, `yearstart`, `yearend`, `totalAtt`, "
                + "`atteID`, `feeID`, `Status`) VALUES (?,?,?,?,?,?,?)");
        prepedSt.setString(1,admin.acc[0]);
        prepedSt.setString(2,admin.acc[1]);
        prepedSt.setString(3,admin.acc[2]);
        prepedSt.setString(4,admin.acc[3]);
        prepedSt.setString(5,admin.acc[4]);
        prepedSt.setString(6,admin.acc[5]);
        prepedSt.setString(7,admin.acc[6]);
        prepedSt.execute();
    }
    
    public static void addAccounts(Admin admin) throws Exception {
        PreparedStatement prepedSt = con.prepareStatement("INSERT INTO "
                + "`accounts` (`empid`, `username`, `password`, `fname`, "
                + "`lname`, `type`) VALUES "
                + "(?, ?, ?, ?, ?, ?);");
        prepedSt.setString(1, admin.acc[0]);
        prepedSt.setString(2, admin.acc[1]);
        prepedSt.setString(3, admin.acc[2]);
        prepedSt.setString(4, admin.acc[3]);
        prepedSt.setString(5, admin.acc[4]);
        prepedSt.setString(6, admin.acc[5]);
        prepedSt.execute();
    }
    
    public static boolean checkAccount(Admin admin) throws Exception {
        PreparedStatement prepedSt = con.prepareStatement("SELECT `accid`, "
            + "`empid`, `username`, `password`, `fname`, `lname`, `type`, "
            + "`accstatus` FROM `accounts` WHERE PASSWORD = ? And "
            + "username = ?;");
        prepedSt.setString(1, admin.acc[0]);
        prepedSt.setString(2, admin.acc[1]);
        ResultSet rs = prepedSt.executeQuery();
        return rs.next() != false;
    }
    
    public static String viewAcc() throws Exception {
        PreparedStatement prepedSt = con.prepareStatement("SELECT * FROM "
                + "`accounts`;");
        ResultSet rs = prepedSt.executeQuery();
        return rs.getString(1);
    }
    
    public static void addSchoolYear(Admin admin) throws Exception {
        PreparedStatement prepedSt = con.prepareStatement("INSERT INTO "
                + "`schoolyear`(`yearstart`, `yearend`, `totalAtt`, "
                + "`atteID`, `feeID`, `Status`) VALUES (?,?,?,?,?,?)");
        prepedSt.setInt(1,Integer.parseInt(admin.acc[0]));
        prepedSt.setString(2,admin.acc[1]);
        prepedSt.setString(3,admin.acc[2]);
        prepedSt.setInt(4,Integer.parseInt(admin.acc[3]));
        prepedSt.setInt(5,Integer.parseInt(admin.acc[4]));        
        prepedSt.setInt(6,Integer.parseInt(admin.acc[5])); 
        prepedSt.execute();
    }
    public static String viewStudSpon(Admin admin) throws Exception {
        PreparedStatement prepedSt = con.prepareStatement("SELECT sponsor,IDno "
                + "FROM `enstudent` WHERE 1;");
        ResultSet rs = prepedSt.executeQuery();
        return rs.getString(1);
    }
    
    public static void upSpon(Admin admin) throws Exception {
        PreparedStatement prepedSt = con.prepareStatement("UPDATE `enstudent` "
                + "SET sponsor=? where idNo = ?");
        prepedSt.setString(1,admin.acc[1]);
        prepedSt.setString(2,admin.acc[0]);
        prepedSt.execute();
    }
    
    public static String searchStud(Admin admin) throws Exception {
        PreparedStatement prepedSt = con.prepareStatement("SELECT IDno, "
                + "GivenName, MiddleName, SurName, gradelvl,sponsor FROM "
                + "`enstudent` where IDno=?");
        prepedSt.setString(1,admin.acc[1]);
        ResultSet rs = prepedSt.executeQuery();
        return rs.getString(0);
    }
    
    public static String viewGrade() throws Exception {
        PreparedStatement prepedSt = con.prepareStatement("Select * from "
                + "`grades`;");
        ResultSet rs = prepedSt.executeQuery();
        return rs.getString(0);
    }
}
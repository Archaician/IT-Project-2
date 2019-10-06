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
    
    public static void createAccount(Admin admin) throws Exception {
        //create account for accounting
        PreparedStatement prepedSt = con.prepareStatement("INSERT INTO "
                + "`accounts`(`accid`, `empid`, `username`, `password`, "
                + "`fname`, `lname`, `address`, `contact`, `type`, `accstatus`)"
                + " VALUES (?,?,?,?,?,?,?,?,?,?)");
        prepedSt.setString(1,admin.acc[0]);
        prepedSt.setString(2,admin.acc[1]);
        prepedSt.setString(3,admin.acc[2]);
        prepedSt.setString(4,admin.acc[3]);
        prepedSt.setString(5,admin.acc[4]);
        prepedSt.setString(6,admin.acc[5]);
        prepedSt.setString(7,admin.acc[6]);
        prepedSt.setString(8,admin.acc[7]);
        prepedSt.setString(9,admin.acc[8]);
        prepedSt.setString(10,admin.acc[9]);
        prepedSt.execute();
    }
}
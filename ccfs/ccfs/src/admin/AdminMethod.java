package admin;

/**
 *
 * @author Adam
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class AdminMethod {
    
    private static Connection con;
    
    public static void connection() throws Exception {
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ccfs?"
                + "user=root&password=");
        //connect to database
    }
    
    public static void closeCon() throws Exception{
        con.close();
        //close the connection
    }
    
    public static void createAccountAc(Admin admin) throws Exception {
        //create account for registrars and accounting
        PreparedStatement prepedSt = con.prepareStatement("INSERT INTO `accounting`(`accUser`, `accPass`, `accFname`, `accLname`) VALUES (?,?,?,?)");
        prepedSt.setString(1,admin.acc[0]);
        prepedSt.setString(2,admin.acc[1]);
        prepedSt.setString(3,admin.acc[2]);
        prepedSt.setString(4,admin.acc[3]);
    }
    
    public static void createAccountRe(Admin admin) throws Exception {
        PreparedStatement prepedSt = con.prepareStatement("INSERT INTO `registrar`(`regFname`, `regLname`, `regUser`, `regPass`) VALUES (?,?,?,?)");
        prepedSt.setString(1,admin.acc[0]);
        prepedSt.setString(2,admin.acc[1]);
        prepedSt.setString(3,admin.acc[2]);
        prepedSt.setString(4,admin.acc[3]);
    }
    
    public static void viewAcc() throws Exception {
        //view accounts
    }
    
    public static void discountAUR() {
        //add, update or remove discout
    }
    
    public static void sponsorAR() {
        //add or remove sponsor
    }
}

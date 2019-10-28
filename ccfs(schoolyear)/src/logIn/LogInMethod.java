package logIn;
/*
@author Adam
*/
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;

public class LogInMethod {
    
    private static Connection con;
    
    public static void connection() throws  Exception {
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ccfs?"
                + "user=root&password=");
        //connect to database but this will be merge on system integration
    }
    //did not include con.close
    public static boolean logIn(LogIn log) throws Exception {
        PreparedStatement prepedSt = con.prepareStatement("Select username,"
                + "password from accounts where username=? And password=?");
        prepedSt.setString(1,log.credent[0]);
        prepedSt.setString(2,log.credent[1]);
        ResultSet rs = prepedSt.executeQuery();  
        if(rs.next() == false) {
            return false;
        }else {
            return true;
        }
    }
    
    public static int logInAccNum(LogIn log) throws Exception {
        PreparedStatement prepedSt = con.prepareStatement("Select accid,"
                + "password from accounts where username=? And password=?");
        prepedSt.setInt(1,log.accNum);
        ResultSet rs = prepedSt.executeQuery();
        int id = ((Number)rs.getObject(1)).intValue();
        return id;
    }
}
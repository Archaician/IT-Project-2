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
    public static void logIn(LogIn log) throws Exception {
        PreparedStatement prepedSt = con.prepareStatement("SELECT * FROM `accounting` where accUser=? AND accPass=? ");
        /*PreparedStatement prepedSt1 = con.prepareStatement("SELECT regUser,regPass FROM `registrar` where regUser = ? regPass = ?");
        PreparedStatement prepedSt2 = con.prepareStatement("SELECT adminUser,adminPassword FROM `accounting` where adminUser = ? adminPassword= ?");*/
        prepedSt.setString(1,log.credent[0]);
        prepedSt.setString(2,log.credent[1]);
        /*prepedSt1.setString(1,log.credent[0]);
        prepedSt1.setString(1,log.credent[1]);
        prepedSt2.setString(1,log.credent[0]);
        prepedSt2.setString(1,log.credent[1]);*/
        ResultSet resultSet = prepedSt.executeQuery();
        //ResultSet resultSet1 = prepedSt1.executeQuery();
        //ResultSet resultSet2 = prepedSt2.executeQuery();
        //refactor
        //to be continue
        //use resultSet.next == false to check if result is empty
        resultSet.next();
        String a = resultSet.getString("accPass");
        
   }
}

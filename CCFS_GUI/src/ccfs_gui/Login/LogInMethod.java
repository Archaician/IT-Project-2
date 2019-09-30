package ccfs_gui.Login;
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
import java.util.logging.Level;
import java.util.logging.Logger;

public class LogInMethod {
    
    private static Connection con;
    
    
    public static Connection connection() {
            try {
                    Class.forName("com.mysql.jdbc.Driver");
                    con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ccfs", "root", "");
                    return con;
            } catch (Exception e) {
                    System.out.println(e);
                    return null;
            }
            
         //   if (con == null) {
          //          System.out.println("Not connected.");
                  //  System.exit(0);
          //  }
      //  con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ccfs?" + "useSSL='false'"
       //         + "user=root&password=");
        //connect to database but this will be merge on system integration
    }
    
  /*  public boolean dbConnected() {
            try {
                    return !con.isClosed();
            } catch (SQLException e) {
                    e.printStackTrace();
                    return false;
            }
            
    } */
    
    //did not include con.close
//    public static void logIn(LogIn log) throws Exception {
//        PreparedStatement prepedSt = con.prepareStatement("SELECT * FROM `accounting` where accUser=? AND accPass=? ");
        /*PreparedStatement prepedSt1 = con.prepareStatement("SELECT regUser,regPass FROM `registrar` where regUser = ? regPass = ?");
        PreparedStatement prepedSt2 = con.prepareStatement("SELECT adminUser,adminPassword FROM `accounting` where adminUser = ? adminPassword= ?");*/
 //       prepedSt.setString(1,log.credent[0]);
 //       prepedSt.setString(2,log.credent[1]);
        /*prepedSt1.setString(1,log.credent[0]);
        prepedSt1.setString(1,log.credent[1]);
        prepedSt2.setString(1,log.credent[0]);
        prepedSt2.setString(1,log.credent[1]);*/
  //      ResultSet resultSet = prepedSt.executeQuery();
        //ResultSet resultSet1 = prepedSt1.executeQuery();
        //ResultSet resultSet2 = prepedSt2.executeQuery();
        //refactor
        //to be continue
        //use resultSet.next == false to check if result is empty
 //       resultSet.next();
 //       String a = resultSet.getString("accPass");
        
 //  }
    public boolean logIn(String uname, String passwd) throws SQLException {
            PreparedStatement ps;
            ResultSet rs;
            try {
                 ps = con.prepareStatement("SELECT * FROM admin WHERE adminUser = ? and adminPassword = ?");  
                 ps.setString(1, uname);
                 ps.setString(2, passwd);
                 
                 rs = ps.executeQuery();
                 if (rs.next()){
                         return true;
                 } else {
                         return false;
                 }
            } catch(Exception e) {
                  return false;  
          //  } finally {
          //          ps.close();
          //          rs.close();
            }
       //     return false;
                       
    }
}

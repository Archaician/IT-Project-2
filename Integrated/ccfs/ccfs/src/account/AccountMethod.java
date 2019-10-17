/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package account;

/**
 *
 * @author Lemuel
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
/*import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList; this will be use for integrating the modules*/

public class AccountMethod {
	
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
    
    public static void displayPayment(Account account) throws Exception {
        // sql statement insert
        // very long try to refactor
        PreparedStatement prepedSt = con.prepareStatement("Select * from accounts");
        //execute the query
    }
}

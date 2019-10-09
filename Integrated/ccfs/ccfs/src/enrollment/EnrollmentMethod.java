package enrollment;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
/*import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList; this will be use for integrating the modules*/

public class EnrollmentMethod {
	
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
    
    public static void addStud(Enrollment enroll) throws Exception {
        // sql statement insert
        // very long try to refactor
        PreparedStatement prepedSt = con.prepareStatement("INSERT INTO "
                + "'enstudent'('enid', 'studIDno', 'GivenName', "
                + "'MiddleName', 'SurName', 'gradelvl', 'birthdate', "
                + "'birthplace', 'gender', 'homeTelnum', 'mobilenum', "
                + "'studaddress', 'prevschoolattended', 'studstat', "
                + "'sponsor', 'faFname', 'falname', 'faAdd', "
                + "'faMobilenum', 'faEmail', 'faoccupation', "
                + "'moFname', 'moLname', 'momobilenum', 'moEmail', "
                + "'mooccupation', 'sibFname', 'sibLname', "
                + "'sibschoolname', 'dateenrolled', 'IDyear', "
                + "'studstatus') VALUES "
                + "(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,"
                + "?,?,?,?,?,?)");
        prepedSt.setString(1,enroll.info[0]);
        prepedSt.setString(2,enroll.info[1]);
        prepedSt.setString(3,enroll.info[2]);
        prepedSt.setString(4,enroll.info[3]);
        prepedSt.setString(5,enroll.info[4]);
        prepedSt.setString(6,enroll.info[5]);
        prepedSt.setString(7,enroll.info[6]);
        prepedSt.setString(8,enroll.info[7]);
        prepedSt.setString(9,enroll.info[8]);
        prepedSt.setString(10,enroll.info[9]);
        prepedSt.setString(11,enroll.info[10]);
        prepedSt.setString(12,enroll.info[11]);
        prepedSt.setString(13,enroll.info[12]);
        prepedSt.setString(14,enroll.info[13]);
        prepedSt.setString(15,enroll.info[14]);
        prepedSt.setString(16,enroll.info[15]);
        prepedSt.setString(17,enroll.info[16]);
        prepedSt.setString(18,enroll.info[17]);
        prepedSt.setString(19,enroll.info[18]);
        prepedSt.setString(20,enroll.info[19]);
        prepedSt.setString(21,enroll.info[20]);
        prepedSt.setString(22,enroll.info[21]);
        prepedSt.setString(23,enroll.info[22]);
        prepedSt.setString(24,enroll.info[23]);
        prepedSt.setString(25,enroll.info[24]);
        prepedSt.setString(26,enroll.info[25]);
        prepedSt.setString(27,enroll.info[26]);
        prepedSt.setString(28,enroll.info[27]);
        prepedSt.setString(29,enroll.info[28]);
        prepedSt.setString(30,enroll.info[29]);
        prepedSt.setString(31,enroll.info[30]);
        prepedSt.setString(32,enroll.info[31]);
        prepedSt.execute();
        //execute the query
    }
}
package enrollment;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
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
    
    public static void addStud() throws Exception {
        PreparedStatement prepedSt = con.prepareStatement("INSERT INTO `enstudent` (`enid`, `IDno`, `GivenName`, `MiddleName`, `SurName`, `gradelvl`, `birthdate`, `birthplace`, `gender`, `homeTelnum`, `mobilenum`, `studaddress`, `prevschoolattended`, `studstat`, `sponsor`, `faFname`, `falname`, `faAdd`, `faMobilenum`, `faEmail`, `faoccupation`, `moFname`, `moLname`, `momobilenum`, `moEmail`, `mooccupation`, `sibFname`, `sibLname`, `sibschoolname`, `dateenrolled`, `yearid`) VALUES (NULL, '7', 'l', 'l', 'l', 'l', '2019-10-09', 'l', 'M', 'l', 'l', 'l', 'l', 'l', 'l', 'l', 'l', 'l', 'l', 'l', 'l', 'l', 'l', 'l', 'l', 'l', 'l', 'l', 'l', '2019-10-25', '1');");
        prepedSt.execute();
    }
    public static void addSchoolYear(Enrollment enroll) throws SQLException {
         
        
        PreparedStatement prepedSt = con.prepareStatement("INSERT INTO 'schoolyear' "
                + "('yearstart', 'yearend', 'totalAtt', 'atteID', "
                + "'feeID', 'Status') VALUES "
                + "(?,?,?,?,?,?);");
        prepedSt.setString(1,enroll.info[0]);
        prepedSt.setString(2,enroll.info[1]);
        prepedSt.setInt(3,Integer.parseInt(enroll.info[2]));
        prepedSt.setInt(4,Integer.parseInt(enroll.info[3]));
        prepedSt.setInt(5,Integer.parseInt(enroll.info[4]));
        prepedSt.setInt(6,Integer.parseInt(enroll.info[5]));
        prepedSt.execute();
    }
}
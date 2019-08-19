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
            PreparedStatement prepedSt = con.prepareStatement("insert into "
                    + "`student`(`studFname`, `studLname`, `gradelvl`, `birthdate`"
                    + ", `birthplace`, `gender`, `homeTelnum`, `mobilenum`, `"
                    + "studaddress`, `sponsorship`, `prevschoolattended`, "
                    + "`studstat`, `faFname`, `falname`, `faAdd`, `faMobilenum`, "
                    + "`faEmail`, `moFname`, `moLname`,`momobilenum`, `moEmail`,"
                    + " `sibFname`, `sibLname`, `sibschoolname`) VALUES(?,?,?,"
                    + "?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
            for(int i = 0; i<24 ;i++) {
                System.out.print(i+" "+(i-1));
            }
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
            //refactor this make a for loop or something
            prepedSt.execute();
            //execute the query
    }
}

package enrollment;


import java.util.Scanner;
import java.util.LinkedList;

//apply GUI on this class
public class App {

    public static void main(String[] args) throws Exception {
            EnrollmentMethod.connection();
            enrollStud();
    }

    public static void enrollStud() {
        try {
            String[] arr = {"4", "m", "m", "m", "m", "2019-11-01", "m", "m", 
                "m", "m", "m", "m", "m", "m", "m", "m", "m", "m", "m", "m", 
                "m", "m", "m", "m", "m", "m", "m", "m", "1", "2019-11-01", 
                "m", "m", "m"};
            Enrollment en = new Enrollment(arr);
            EnrollmentMethod.addStud(en);
        }catch(Exception e) {
        }
    }
}
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
            String[] arr = {"7","q","q","q","q","2020-10-03",
            "q","q","q","q","q","q","q","q","q","q","q","q",
            "q","q","q","q","q","q","q","q","q","q","2020-11-01","1"};
            Enrollment en = new Enrollment(arr);
            EnrollmentMethod.addStud(en);
        }catch(Exception e) {
        }
    }
}
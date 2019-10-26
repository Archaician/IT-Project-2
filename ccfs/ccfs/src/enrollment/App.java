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
            EnrollmentMethod.addStud();
        }catch(Exception e) {
        }
    }
}
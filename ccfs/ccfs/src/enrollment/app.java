package enrollment;


import java.util.Arrays;
import java.util.Scanner;
import java.util.LinkedList;

//apply GUI on this class
public class App {

    public static void main(String[] args) throws Exception {
        EnrollmentMethod.connection();
        getID();
    }
    
    public static void getID() throws Exception {
        System.out.print(Integer.parseInt(EnrollmentMethod.getLastID())+1);
    }
    
    public static void enrollStud() {
        try {
            String[] arr = {"1", "m", "m", "m", "m", "2019-11-01", "m", "m", 
                "m", "m", "m", "m", "m", "m", "m", "m", "m", "m", "m", "m", "m", 
                "m", "m", "m", "m", "m", "m", "m", "m", "1", "2019-11-01", 
                "m", "m", "m"};
            System.out.println(arr.length);
            Enrollment en = new Enrollment(arr);
            EnrollmentMethod.addStud(en);
        }catch(Exception e) {
        }
    }
}
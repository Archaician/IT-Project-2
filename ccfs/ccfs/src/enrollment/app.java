package enrollment;


import admin.Admin;
import admin.AdminMethod;
import java.util.Arrays;
import java.util.Scanner;
import java.util.LinkedList;

//apply GUI on this class
public class App {

    public static void main(String[] args) throws Exception {
        EnrollmentMethod.connection();
//        System.out.print(getLastID());
        System.out.print(getYear());
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
    public static void addAcc() throws Exception {
        String[] arr = {"2","e","e","e","e","R"};
        Admin ad = new Admin(arr);
        AdminMethod.addAccounts(ad);
    }
    public static String getYear() throws Exception {
        return EnrollmentMethod.getSchoolYearId();
    }
    public static String getLastID() throws Exception{
        return EnrollmentMethod.getLastID();
    }
}
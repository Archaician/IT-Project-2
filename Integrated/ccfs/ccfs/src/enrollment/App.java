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
            Scanner kbd = new Scanner(System.in);
            String[] info=new String[24];
            for(int i=0;i<info.length;i++){
                info[i]=kbd.nextLine();
            }
            Enrollment enrmnt = new Enrollment(info);
            EnrollmentMethod.addStud(enrmnt);
        //add error handling here 
        }catch(Exception e) {
        }
    }
}
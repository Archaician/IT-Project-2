package logIn;
//import enrollment.EnrollmentMethod; // do the same thing on LoginMethod

/**
 *
 * @author Adam
 */
public class App {
    
    public static void main(String[] args) throws Exception {
        LogInMethod.connection();
        login();
    }
    
    public static void login() throws Exception {
        String credent[] = {"Paul","Imran"};
        LogIn log = new LogIn(credent);
    }
}
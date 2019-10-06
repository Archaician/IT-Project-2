package ccfs_gui.Login;
//import enrollment.EnrollmentMethod; // do the same thing on LoginMethod

/**
 *
 * @author Adam
 */
public class App {
    
    public void main(String[] args) throws Exception {
        LogInMethod.connection();
        login();
    }
    
    public void login() throws Exception {
        String credent[] = {"dick","head"};
        LogIn log = new LogIn(credent);
      //  LogInMethod.logIn(uname, passwd);
        
    }
}


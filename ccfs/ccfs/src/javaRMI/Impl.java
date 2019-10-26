package javaRMI;

import logIn.*;
import java.util.LinkedList;
import enrollment.*;
/**
 *
 * @author Acer
 */
public class Impl implements InterfaceRMI {
    static LinkedList<Integer> id = new LinkedList<Integer>();
    //check if user and pass are in the data base
    @Override
    public boolean logIn(String user,String pass) throws Exception {
        LogInMethod.connection();
        String[] credent = {user,pass};
        LogIn log = new LogIn(credent);
        return LogInMethod.logIn(log);
    }
    // check if acc is already login
    @Override
    public String retId(String user,String pass) throws Exception {
        LogInMethod.connection();
        String[] credent = {user,pass};
        LogIn log = new LogIn(credent);
        if(!id.contains(LogInMethod.logInAccNum(log))) {
            id.add(LogInMethod.logInAccNum(log));
            return "LogIn";
        }else {
            return "Already LogIn";
        }
    }
    // gets the login type to redirect to the user to the GUI
    @Override
    public String retType(String user,String pass) throws Exception {
        LogInMethod.connection();
        String[] credent = {user,pass};
        LogIn log = new LogIn(credent);
        return LogInMethod.logInType(log);
    }
    // enroll student
    @Override
    public void enStud(String id, String[] studInfo) 
            throws Exception {
        studInfo[0] = id;
        Enrollment enrmnt = new Enrollment(studInfo);
        EnrollmentMethod.addStud();
    }
}
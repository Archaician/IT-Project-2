package javaRMI;

import logIn.*;
import java.util.LinkedList;
import enrollment.*;
import admin.*;
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
    public void enStud(String[] studInfo) throws Exception {
        LogInMethod.connection();
        Enrollment enrmnt = new Enrollment(studInfo);
        EnrollmentMethod.addStud(enrmnt);
    }
    //get Last studentID 
    @Override
    public String getLastID() throws Exception {
        LogInMethod.connection();
        return EnrollmentMethod.getLastID();
    }
    //get Schoolyear (current school year)
    @Override
    public String getSchoolYear() throws Exception {
        LogInMethod.connection();
        return EnrollmentMethod.getSchoolYear();
    }
    //get Year ID 
    @Override
    public String getYearID() throws Exception {
        LogInMethod.connection();
        return EnrollmentMethod.getSchoolYearId();
    }
    // add Account
    @Override
    public void addAcc(String[] info) throws Exception {
        LogInMethod.connection();
        Admin addAc = new Admin(info);
        AdminMethod.addAccounts(addAc);
    }
    //view Accounts
    @Override
    public String viewAcc() throws Exception {
        return AdminMethod.viewAcc();
    }
    //search for student via idnum
    @Override
    public String srchStud(String[] studInfo) throws Exception {
        LogInMethod.connection();
        Admin admin = new Admin(studInfo);
        return AdminMethod.searchStud(admin);
    }
    //logOut an account when close or click the logout
    @Override
    public void logOut(int ID) throws Exception {
        id.remove(ID);
    }
}
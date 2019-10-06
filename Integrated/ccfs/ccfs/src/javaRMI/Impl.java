package javaRMI;

import logIn.*;
import java.util.LinkedList;

/**
 *
 * @author Acer
 */
public class Impl implements InterfaceRMI {
    static LinkedList<Integer> id = new LinkedList<Integer>();
    
    @Override
    public boolean logIn(String user,String pass) throws Exception {
        LogInMethod.connection();
        String[] credent = {user,pass};
        LogIn log = new LogIn(credent);
        return LogInMethod.logIn(log);
    }
    
    // refactor couple with retType
    @Override
    public String retId(String user,String pass) throws Exception {
        LogInMethod.connection();
        String[] credent = {user,pass};
        LogIn log = new LogIn(credent);
        if(!id.contains(LogInMethod.logInAccNum(log))) {
            id.add(LogInMethod.logInAccNum(log));
            return "Login";
        }else {
            return "Account is already login";
        }
    }
    
    @Override
    public String retType(String user,String pass) throws Exception {
        LogInMethod.connection();
        String[] credent = {user,pass};
        LogIn log = new LogIn(credent);
        return LogInMethod.logInType(log);
    }
}

package javaRMI;

import logIn.*;
import java.rmi.server.UnicastRemoteObject;
import java.rmi.RemoteException;
import java.util.LinkedList;



/**
 *
 * @author Acer
 */
public class Impl extends UnicastRemoteObject  implements InterfaceRMI {
    public Impl() throws RemoteException {
    }
    
    @Override
    public boolean logIn(String user,String pass) throws Exception {
        LogInMethod.connection();
        String[] credent = {user,pass};
        LogIn log = new LogIn(credent);
        return LogInMethod.logIn(log);
    } 
}

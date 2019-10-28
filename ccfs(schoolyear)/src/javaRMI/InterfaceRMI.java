package javaRMI;
import java.rmi.Remote;
import java.rmi.RemoteException;
/**
 *
 * @author Acer
 */
public interface InterfaceRMI extends Remote {
    public boolean logIn(String user,String pass) throws Exception;
}

package javaRMI;
import java.rmi.Remote;
/**
 *
 * @author Acer
 */
public interface InterfaceRMI extends Remote {
    public boolean logIn(String user,String pass) throws Exception;
    public String retId(String user,String pass) throws Exception;
    public String retType(String user,String pass) throws Exception;
    public void enStud(String id, String[] studInfo) 
    throws Exception;
    public void addSYear(String[] sYear) throws Exception; 
}

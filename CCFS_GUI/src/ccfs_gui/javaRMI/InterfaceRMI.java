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
    public void enStud(String[] studInfo) throws Exception;
    public String getSchoolYear() throws Exception;
    public void addAcc(String[] info) throws Exception;
    public String viewAcc() throws Exception;
    public String srchStud(String[] studInfo) throws Exception;
}

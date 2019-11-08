package javaRMI;
import java.rmi.Remote;
/**
 *
 * @author Acer
 */
public interface InterfaceRMI extends Remote {
    // logIn mod
    public boolean logIn(String user,String pass) throws Exception;
    public String retId(String user,String pass) throws Exception;
    public String retType(String user,String pass) throws Exception;
    // enrollment
    public void enStud(String[] studInfo) throws Exception;
    public String getSchoolYear() throws Exception;
    public String getLastID() throws Exception;
    public String getYearID() throws Exception;
    public String srchStud(String[] studInfo) throws Exception;
    
    // add Accounts
    public void addAcc(String[] info) throws Exception;
    public String viewAcc() throws Exception;
    
}

package logIn;
/*
@author Adam
*/
public class LogIn {
    
    String credent[];
    int accNum;
    
    public LogIn(String[] credent){
        this.credent = credent;
    }
    
    public  LogIn(int accNum) {
        this.accNum = accNum; 
    }
    
    public int accNo() {
        return this.accNum;
    }
    
    public String[] credent() {
        return this.credent;
    }
}
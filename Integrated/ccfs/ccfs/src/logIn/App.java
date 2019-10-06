/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logIn;

/**
 *
 * @author Acer
 */
public class App {
    
    public static void main(String[] args) throws Exception {
            LogInMethod.connection();
            check();
           
    }
    public static void check() throws Exception{
        String[] ll = {"Paul","Imran"};
        LogIn log = new LogIn(ll);
        System.out.print(LogInMethod.logInAccNum(log));
    }
}

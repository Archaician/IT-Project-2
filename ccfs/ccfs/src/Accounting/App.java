/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Accounting;


/**
 *
 * @author @Imran
 * @version 1.0
 */
public class App {
    
    public static void main(String[] args) throws Exception {
            FeesMethod.connection();
            check();
    }
    
    public static void check() throws Exception{
        String[] arr = {"2", "2000", "2", "2", "02"};
        Fees f = new Fees(arr);
        FeesMethod.insertFees(f);
    }

}

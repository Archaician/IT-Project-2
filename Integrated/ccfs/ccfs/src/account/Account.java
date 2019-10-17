/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package account;

/**
 *
 * @author Lemuel
 */
public class Account {
    
    String info[];

    public Account(String[] info) {
       this.info = info;
    }
    
    public String[] studInfo() {
        return this.info;
    }
}

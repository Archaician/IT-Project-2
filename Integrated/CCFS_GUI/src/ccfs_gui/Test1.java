/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ccfs_gui;
import javaRMI.ClientCon;
/**
 *
 * @author Acer
 */
public class Test1 {
    
    public static void main(String[]args) throws Exception {
        ClientCon.conRMI("192.168.1.5");
        System.out.print(ClientCon.stub.logIn("IM", "P"));
    }
}

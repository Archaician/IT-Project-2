/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaRMI;
import java.rmi.registry.LocateRegistry; 
import java.rmi.registry.Registry; 

/**
 *
 * @author Acer
 */
public class ClientCon {
    public static Registry registry;
    public static InterfaceRMI stub;
    private ClientCon() {}
    public static void conRMI(String ip) {
        try {
            registry = LocateRegistry.getRegistry(ip);
            stub = (InterfaceRMI) registry.lookup("interface");
            System.out.print("Client is Connected");
        }catch(Exception e){
            System.out.print("Not connected" + e);
        }
    }
}

package javaRMI;

import java.rmi.registry.Registry;
import java.rmi.registry.LocateRegistry;
import java.rmi.server.UnicastRemoteObject;
/**
 *
 * @author Adam
 */
public class RmiServer {
    public static void main(String[] args) {
        try {
            Impl obj = new Impl(); 
            InterfaceRMI stub = (InterfaceRMI) UnicastRemoteObject.exportObject(obj, 0);     
            Registry registry = LocateRegistry.getRegistry(); 
            registry.bind("interface", stub);  
            System.err.println("Server ready"); 
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
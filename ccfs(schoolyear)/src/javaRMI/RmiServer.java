package javaRMI;

import java.rmi.registry.Registry;
import java.rmi.registry.LocateRegistry;
/**
 *
 * @author Adam
 */
public class RmiServer {
    public static void main(String[] args) {
        try {
            InterfaceRMI interRMI = new Impl();
            Registry reg = LocateRegistry.createRegistry(1234);
            reg.rebind("interface",interRMI);
            System.out.println("RMI server established...");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

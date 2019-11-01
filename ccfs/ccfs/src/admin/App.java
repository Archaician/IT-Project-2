package admin;

import java.util.Scanner;
/**
 *
 * @author Adam
 *
 */
public class App {

    public static void main(String[] args) throws Exception {
        AdminMethod.connection();
        createAcc();
    }

    public static void createAcc() throws Exception {
        String[] arr = {"4","e","e","e","e","13","e"};
        Admin ad = new Admin(arr);
        AdminMethod.addAccounts(ad);
    }
}
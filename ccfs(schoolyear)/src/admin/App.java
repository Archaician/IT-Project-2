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
        Scanner kbd = new Scanner(System.in);
        int opp = kbd.nextInt();
        // case for option
        switch(opp) {
            case 1:
            createAcc();
            break;
        }
        kbd.close();
    }

    public static void createAcc() throws Exception {
        String[] acc = new String[9];
        Admin adminCreateAcc = new Admin(acc);
        AdminMethod.createAccount(adminCreateAcc);
    }
}
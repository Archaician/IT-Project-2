/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ccfs_gui;

import ccfs_gui.Login.LoginController;
import javaRMI.ClientCon;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.ButtonType;

/**
 *
 * @author @Imran
 * @version 1.0
 */
public class DialogWindows {

    public static void confirmationBox(String title, String message) {
        Alert alert = new Alert(AlertType.CONFIRMATION, message, ButtonType.YES, ButtonType.NO);
        alert.setTitle(title);
        alert.showAndWait();

        if (alert.getResult() == ButtonType.YES) {
            // TODO
        } else {
            alert.close();
        }
    }

    public static void dialogBox(AlertType alerttype, String title, String message, ButtonType... buttontype) {
        Alert alert = new Alert(alerttype, message, buttontype);
        alert.setTitle(title);
        alert.showAndWait();
    }

    public static void confirmExit() throws Exception {
        Alert alert = new Alert(AlertType.CONFIRMATION, "Are you sure you want to exit?", ButtonType.YES, ButtonType.NO);
        alert.setTitle("Exit");
        //alert.setHeaderText("Exit CCFS SIS");
        alert.showAndWait();

        if (alert.getResult() == ButtonType.YES && 
                LoginController.getId.isEmpty()) {
            System.exit(0);
        } else if (alert.getResult() == ButtonType.YES && 
                (LoginController.getId.isEmpty())) {
            ClientCon.stub.logOut(LoginController.getId);
            System.exit(0);
        } else {
            alert.close();
        }
    }

}

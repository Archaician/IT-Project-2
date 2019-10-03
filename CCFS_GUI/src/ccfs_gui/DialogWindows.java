/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ccfs_gui;

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
        
        public static void confirmExit() {
                Alert alert = new Alert(AlertType.CONFIRMATION, "Are you sure you want to exit?", ButtonType.YES, ButtonType.NO);
                alert.setTitle("Exit");
                alert.showAndWait();
                
                if (alert.getResult() == ButtonType.YES) {
                        System.exit(0);
                } else {
                        alert.close();
                }
        }
        
        public static void errorBox(String message) {
                Alert alert = new Alert(AlertType.ERROR, message, ButtonType.OK);
                alert.showAndWait();
        }
        
        public static void warningBox(String message) {
                Alert alert = new Alert(AlertType.WARNING, message, ButtonType.OK);
                alert.showAndWait();
        }
}
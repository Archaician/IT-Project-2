/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ccfs_gui.Admin;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;

/**
 * FXML Controller class
 *
 * @author Acer
 */
public class CreateAccountController implements Initializable {

        @FXML
        private BorderPane innerpane;
        @FXML
        private Label regID;
        @FXML
        private GridPane inner_borderpane;
        @FXML
        private TextField firstname;
        @FXML
        private TextField lastname;
        @FXML
        private TextField username;
        @FXML
        private PasswordField passwd;
        @FXML
        private PasswordField confpasswd;

        /**
         * Initializes the controller class.
         */
        @Override
        public void initialize(URL url, ResourceBundle rb) {
                // TODO
        }        
        
}

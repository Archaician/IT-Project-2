/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ccfs_gui.Admin;

import static ccfs_gui.Admin.AdminOptionsController.sceneval;
import ccfs_gui.DialogWindows;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Imran
 */
public class CreateAccountController implements Initializable {
        
        //public static List<TextField>requiredFields = new ArrayList<TextField>();

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
        @FXML
        private Button back_Btn;
        @FXML
        private Button confirm_Btn;
        
        @FXML
        private void back() throws IOException {
                BackButton bb = new BackButton();

                bb.back(sceneval.get(sceneval.size() - 1));
               // fxmlval.remove(fxmlval.size() - 1);
                sceneval.remove(sceneval.size() - 1);
                
        }
        
        @FXML
        private void backButton(ActionEvent event) throws IOException {
                back();               
        }
        
        @FXML
        private void setRegistrationID() {
                regID.setText("01");
        }
        
        @FXML
        private void confirmButton(ActionEvent event) throws IOException {
              //  requiredFields.add(firstname);
              //  requiredFields.add(lastname);
              //  requiredFields.add(username);
          //      if (requiredFields.add(getText().isEmpty())) {
                        
          //      }
                /*Required textfields validation*/
                if (firstname.getText().isEmpty()) {
                        firstname.setStyle("-fx-border-color: red");
                        firstname.setPromptText("REQUIRED!");
                }
                if (lastname.getText().isEmpty()) {
                        lastname.setStyle("-fx-border-color: red");
                        lastname.setPromptText("REQUIRED!"); 
                }
                if (username.getText().isEmpty()) {
                        username.setStyle("-fx-border-color: red");
                        username.setPromptText("REQUIRED!");
                }
                if (passwd.getText().isEmpty()) {
                        passwd.setStyle("-fx-border-color: red");
                        passwd.setPromptText("REQUIRED!");
                } else if (!passwd.getText().equals(confpasswd.getText())) {
                        confpasswd.clear();
                        passwd.setStyle("-fx-border-color: red");
                        confpasswd.setStyle("-fx-border-color: red");
                        confpasswd.setPromptText("PASSWORD DOES NOT MATCH!");       
                } else {
                        DialogWindows.confirmationBox("Success", "Successfully created account");
                        Pane root = FXMLLoader.load(getClass().getResource("CreateRegistrarAccountFXML.fxml"));
                       // Scene scene = new Scene(root);
                }
        }
        
        /**
         * Initializes the controller class.
         */
        @Override
        public void initialize(URL url, ResourceBundle rb) {
                setRegistrationID();
                // TODO
        }        
        
}

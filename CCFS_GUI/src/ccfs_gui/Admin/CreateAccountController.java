/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ccfs_gui.Admin;

import static ccfs_gui.Admin.AdminOptionsController.sceneval;
import ccfs_gui.DialogWindows;
import ccfs_gui.LayoutProperties;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
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
        
        ObservableList list = FXCollections.observableArrayList();
        
        @FXML
        private BorderPane innerpane;
        @FXML
        private AnchorPane container;
        @FXML
        private Label regID;
        @FXML
        private GridPane inner_borderpane;
        @FXML
        private ChoiceBox<String> acctype;
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
        
        //Show account type choicebox choices
        private void loadAccountType() {
                list.removeAll(list);
                String registrar = "Registrar";
                String accounting = "Accounting";
                list.addAll(registrar, accounting);
                acctype.getItems().addAll(list);
                acctype.setValue(registrar);
        }
        
        @FXML
        private void confirmButton(ActionEvent event) throws IOException {
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
                        DialogWindows.dialogBox(Alert.AlertType.CONFIRMATION, "Create New Account", "Successfully created new account.", ButtonType.OK, null, null);
                        AnchorPane root = FXMLLoader.load(getClass().getResource("AdminOptionsFXML.fxml"));
                        container.getChildren().setAll(root);
                        LayoutProperties.anchorPaneConstraints(root);
                }
        }
        
        /**
         * Initializes the controller class.
         */
        @Override
        public void initialize(URL url, ResourceBundle rb) {
                setRegistrationID();
                loadAccountType();
                // TODO
        }        
        
}

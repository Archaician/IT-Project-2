/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ccfs_gui.Enrollment;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;

/**
 * FXML Controller class
 *
 * @author Imran
 */
public class AddSiblingController implements Initializable {

        @FXML
        private AnchorPane container;
        @FXML
        private BorderPane innerpane;
        @FXML
        private Label studID;
        @FXML
        private TextField surname;
        @FXML
        private TextField givenname;
        @FXML
        private DatePicker birthdate;
        @FXML
        private TextField school;
        @FXML
        private Button sibling_Btn;
        
        @FXML
        private void addSiblingButton(ActionEvent event) throws IOException {
                /*Required textfields validation.*/
                if (surname.getText().isEmpty()) {
                        surname.setStyle("-fx-border-color: red");
                        surname.setPromptText("REQUIRED!");
                }
                if (givenname.getText().isEmpty()) {
                        givenname.setStyle("-fx-border-color: red");
                        givenname.setPromptText("REQUIRED!"); 
                }
                if (birthdate.getValue() == null) {
                        birthdate.setStyle("-fx-border-color: red");
                        birthdate.setPromptText("REQUIRED!");
                }
                if (school.getText().isEmpty()) {
                        school.setStyle("-fx-border-color: red");
                        school.setPromptText("REQUIRED!");
                } else {
                        //TODO
                }
        }
        /**
         * Initializes the controller class.
         */
        @Override
        public void initialize(URL url, ResourceBundle rb) {
                // TODO
        }        
        
}

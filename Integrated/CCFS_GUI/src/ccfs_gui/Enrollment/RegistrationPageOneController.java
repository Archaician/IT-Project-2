/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ccfs_gui.Enrollment;

//import ccfs_gui.PopupWindows;
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
import javafx.scene.control.ChoiceBox;
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
public class RegistrationPageOneController implements Initializable {
        
        ObservableList list = FXCollections.observableArrayList();

        @FXML
        private BorderPane innerpane;
        @FXML
        private Label schYR;
        @FXML
        private Label studID;  
        @FXML
        private TextField surname;
        @FXML
        private TextField givenname;
        @FXML
        private TextField middlename;
        @FXML
        private ChoiceBox<String> gender;
        @FXML
        private DatePicker birthdate;
        @FXML
        private TextField gradelvl;
        @FXML
        private TextField birthplace;
        @FXML
        private TextField address;
        @FXML
        private TextField telephone;
        @FXML
        private TextField mobile;
        @FXML
        private TextField prevschool;
        @FXML
        private AnchorPane container;
        
        private void setStudentID() {
                /*SAMPLE ONLY */
                studID.setText("01");
        }
        
        private void setSchoolYear() {
                /*SAMPLE ONLY */
                schYR.setText("2018-2019");
        }
        
        /*Show gender choicebox choices*/
        private void loadGender() {
                list.removeAll(list);
                String male = "Male";
                String female = "Female";
                list.addAll(male, female);
                gender.getItems().addAll(list);
                gender.setValue(male);
        }
        
        @FXML
        private void nextButton(ActionEvent event) throws IOException {
                /*Required textfields validation.*/
                if (surname.getText().isEmpty()) {
                        surname.setStyle("-fx-border-color: red");
                        surname.setPromptText("REQUIRED!");
                }
                if (givenname.getText().isEmpty()) {
                        givenname.setStyle("-fx-border-color: red");
                        givenname.setPromptText("REQUIRED!"); 
                }
                if (middlename.getText().isEmpty()) {
                        middlename.setStyle("-fx-border-color: red");
                        middlename.setPromptText("REQUIRED!");
                }
                if (birthdate.equals("")) {
                        birthdate.setStyle("-fx-border-color: red");
                        birthdate.setPromptText("REQUIRED!");
                }
                if (gradelvl.getText().isEmpty()) {
                        gradelvl.setStyle("-fx-border-color: red");
                        gradelvl.setPromptText("REQUIRED!");
                }
                if (birthplace.getText().isEmpty()) {
                        birthplace.setStyle("-fx-border-color: red");
                        birthplace.setPromptText("REQUIRED!"); 
                }
                if (address.getText().isEmpty()) {
                        address.setStyle("-fx-border-color: red");
                        address.setPromptText("REQUIRED!");
                }
                if (prevschool.getText().isEmpty()) {
                        prevschool.setStyle("-fx-border-color: red");
                        prevschool.setPromptText("REQUIRED!");
                } else {
                        FXMLLoader loader = new FXMLLoader();
                        AnchorPane root = FXMLLoader.load(getClass().getResource("RegistrationPageTwoFXML.fxml"));
                        RegistrationPageTwoController pageTwo = (RegistrationPageTwoController)loader.getController();
                        
                        /*Pass student ID and school year values to the next page.*/
                      //  pageTwo.getStudentID(studID.getText());
                      //  pageTwo.getSchoolYear(schYR.getText());
                        
                        container.getChildren().setAll(root);
                        LayoutProperties.anchorPaneConstraints(root);
                }
        }
        
        /**
         * Initializes the controller class.
         */
        @Override
        public void initialize(URL url, ResourceBundle rb) {
                setStudentID();
                setSchoolYear();
                loadGender();
                // TODO
        }        
        
}

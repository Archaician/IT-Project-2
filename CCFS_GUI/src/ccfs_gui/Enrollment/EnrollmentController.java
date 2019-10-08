/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ccfs_gui.Enrollment;

//import ccfs_gui.PopupWindows;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;

/**
 * FXML Controller class
 *
 * @author Imran
 */
public class EnrollmentController implements Initializable {
        
        ObservableList list = FXCollections.observableArrayList();

        @FXML
        private BorderPane innerpane;
        @FXML
        private Label schYR;
        @FXML
        private Label studID;
        @FXML
        private ChoiceBox<String> gender;
        
        @FXML
        private AnchorPane nextContainer;
        
        //Show gender choicebox choices
        private void loadGender() {
                list.removeAll(list);
                String male = "Male";
                String female = "Female";
                list.addAll(male, female);
                gender.getItems().addAll(list);
                gender.setValue(male);
        }
        
        private void anchorPaneConstraints(BorderPane root) {
                AnchorPane.setTopAnchor(root, 0.0);
                AnchorPane.setRightAnchor(root, 0.0);
                AnchorPane.setLeftAnchor(root, 0.0);
                AnchorPane.setBottomAnchor(root, 0.0);
        }
        
        @FXML
        private void nextButtonNewStud(ActionEvent event) {
                //PopupWindows.confirmationBox("enroll", "enroll?");
                try {
                    BorderPane root = FXMLLoader.load(getClass().getResource("EnrollmentNew2FXML.fxml"));
                    nextContainer.getChildren().setAll(root);
                    anchorPaneConstraints(root);
            } catch (IOException ex) {
                    Logger.getLogger(EnrollmentController.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        /**
         * Initializes the controller class.
         */
        @Override
        public void initialize(URL url, ResourceBundle rb) {
                loadGender();
                // TODO
        }        
        
}

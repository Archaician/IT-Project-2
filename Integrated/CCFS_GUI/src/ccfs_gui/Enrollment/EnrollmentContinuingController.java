/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ccfs_gui.Enrollment;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;

/**
 * FXML Controller class
 *
 * @author Acer
 */
public class EnrollmentContinuingController implements Initializable {

        @FXML
        private AnchorPane container;
        @FXML
        private BorderPane innerpane;
        @FXML
        private Label studID;
        @FXML
        private Label schYR;
        @FXML
        private TextField searchbar;
        @FXML
        private Label noResultText;
        @FXML
        private Button back_Btn;
        @FXML
        private Button enroll_Btn;
        @FXML
        private TextField idnumber;
        @FXML
        private TextField name;
        @FXML
        private TextField birthdate;
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
        private ChoiceBox<?> newgradelvl;
        @FXML
        private Label lastGradeLvl;

        /**
         * Initializes the controller class.
         */
        @Override
        public void initialize(URL url, ResourceBundle rb) {
                // TODO
        }        
        
}

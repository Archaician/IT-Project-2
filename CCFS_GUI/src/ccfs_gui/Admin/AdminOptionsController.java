/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ccfs_gui.Admin;

import ccfs_gui.LayoutProperties;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;

/**
 *
 * @author Imran
 */
public class AdminOptionsController implements Initializable {
        
        public static List<Scene>sceneval = new ArrayList<Scene>();
    //    public static List<String>fxmlval = new ArrayList<String>();  
        @FXML
        private Button createNewAcc_Btn;
        @FXML
        private Button registerStud_Btn;
        @FXML
        private Button enrollContStud_Btn;
        @FXML
        private Button viewListAcc_Btn;
        @FXML
        private Button studGrades_Btn;
        @FXML
        private Button studDiscount_Btn;
        @FXML
        private Button studSponsorship_Btn;       
        @FXML
        private AnchorPane container;
        
        @FXML
        private void adminOptionsButtons(ActionEvent event) throws IOException {
                AnchorPane root = null;
            
                if (event.getSource() == createNewAcc_Btn) {
                      //  fxmlval.add("AdminOptionsFXML.fxml");
                        root = FXMLLoader.load(getClass().getResource("CreateAccountFXML.fxml")); 
                        Scene scene = new Scene(root);
                       // sceneval.add(scene); 
                } else if (event.getSource() == registerStud_Btn) {
                        root = FXMLLoader.load(getClass().getResource("/ccfs_gui/Enrollment/RegistrationPageOneFXML.fxml")); 
                } else if (event.getSource() == enrollContStud_Btn) {
                        root = FXMLLoader.load(getClass().getResource("/ccfs_gui/Enrollment/EnrollmentContinuingFXML.fxml")); 
                } else if (event.getSource() == viewListAcc_Btn) {
                        root = FXMLLoader.load(getClass().getResource("ListOfAccounts.fxml")); 
                } else if (event.getSource() == studGrades_Btn) {
                        root = FXMLLoader.load(getClass().getResource("/ccfs_gui/Registrar/ViewGrades.fxml"));
                }
            
                container.getChildren().setAll(root);
                LayoutProperties.anchorPaneConstraints(root);
        }
        
    
        /**
        * Initializes the controller class.
        */
        @Override
        public void initialize(URL url, ResourceBundle rb) {
                // TODO
        }  
}

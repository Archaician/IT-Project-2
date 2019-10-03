/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ccfs_gui.Admin;

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
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

/**
 *
 * @author Imran
 */
public class AdminOptionsController implements Initializable {
        
        public static List<Scene>sceneval = new ArrayList<Scene>();
        public static List<String>fxmlval = new ArrayList<String>();  
        
        @FXML
        private Label label;
    
        @FXML
        private Button createRegistrarAcc_Btn;
        @FXML
        private Button createAccountingAcc_Btn;
        @FXML
        private Button enrollNewStud_Btn;
        @FXML
        private Button enrollContStud_Btn;
        @FXML
        private Button viewListAcc_Btn;
        @FXML
        private Button viewGrades_Btn;
        @FXML
        private Button studDiscount_Btn;
        @FXML
        private Button studSponsorship_Btn;
    
        @FXML
        private AnchorPane innerpane;
    
        private void anchorPaneConstraints(BorderPane root) {
                AnchorPane.setTopAnchor(root, 0.0);
                AnchorPane.setRightAnchor(root, 0.0);
                AnchorPane.setLeftAnchor(root, 0.0);
                AnchorPane.setBottomAnchor(root, 0.0);
        }
    
      //  String filename = "../Registrar/ViewGrades.fxml";
    
        @FXML
        private void adminOptionsButtons(ActionEvent event) throws IOException {
                BorderPane root = null;
            
                if (event.getSource() == createRegistrarAcc_Btn) {
                        root = FXMLLoader.load(getClass().getResource("CreateRegistrarAccountFXML.fxml"));
              //     fxmlval.add("AdminOptionsFXML.fxml");                                   
              //  stage = (Stage) validate.getScene().getWindow();
              //  sceneval.add((Scene) delete.getScene().getWindow());
                }
                else if (event.getSource() == createAccountingAcc_Btn) {
                        fxmlval.add("AdminOptionsFXML.fxml");
                        root = FXMLLoader.load(getClass().getResource("CreateAccountingAccountFXML.fxml")); 
                }
                else if (event.getSource() == enrollNewStud_Btn) {
                        root = FXMLLoader.load(getClass().getResource("EnrollmentNew1FXML.fxml")); 
                }
                else if (event.getSource() == enrollContStud_Btn) {
                        root = FXMLLoader.load(getClass().getResource("EnrollmentContinuingFXML.fxml")); 
                }
                else if (event.getSource() == viewListAcc_Btn) {
                        root = FXMLLoader.load(getClass().getResource("ListOfAccounts.fxml")); 
                }
                else if (event.getSource() == viewGrades_Btn) {
                      //  root = FXMLLoader.load(getClass().getResource(filename));
                }
            
                innerpane.getChildren().setAll(root);
                anchorPaneConstraints(root);
        }
        
        @FXML
        private void logoutButton(ActionEvent event) {
                
        }
    
    /*
    @FXML
    private void createAccountingAccButton(ActionEvent event) {
            
            try {
                  //  ((Node)event.getSource()).getScene().getWindow().hide();
                  //  Stage stage = new Stage();
                 //   FXMLLoader loader = new FXMLLoader();

                    BorderPane root = FXMLLoader.load(getClass().getResource("CreateAccountingAccountFXML.fxml"));
                    innerpane.getChildren().setAll(root);
                    anchorPaneConstraints(root);
            } catch (IOException ex) {
                    Logger.getLogger(AdminOptionsController.class.getName()).log(Level.SEVERE, null, ex);
            }

    } */
    
        /**
        * Initializes the controller class.
        */
        @Override
        public void initialize(URL url, ResourceBundle rb) {
                // TODO
        }  
}

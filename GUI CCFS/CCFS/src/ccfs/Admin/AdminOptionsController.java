/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ccfs_gui.Admin;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

/**
 *
 * @author Imran
 */
public class AdminOptionsController implements Initializable {
  
    @FXML
    private Label label;
    
    @FXML
    private Button main_options_buttons1;
    @FXML
    private Button main_options_buttons2;
    @FXML
    private Button main_options_buttons3;
    @FXML
    private Button main_options_buttons4;
    @FXML
    private Button main_options_buttons5;
    @FXML
    private Button main_options_buttons6;
    @FXML
    private Button main_options_buttons7;
    @FXML
    private Button main_options_buttons8;
    
    @FXML
    private AnchorPane innerpane;
    
    private void anchorPaneConstraints(BorderPane root) {
            AnchorPane.setTopAnchor(root, 0.0);
            AnchorPane.setRightAnchor(root, 0.0);
            AnchorPane.setLeftAnchor(root, 0.0);
            AnchorPane.setBottomAnchor(root, 0.0);
    }
    
    @FXML
    private void handleButtonAction(ActionEvent event) {
            
            try {
                  //  ((Node)event.getSource()).getScene().getWindow().hide();
                  //  Stage stage = new Stage();
                 //   FXMLLoader loader = new FXMLLoader();
                 /*   if (main_options_buttons3) {
                            
                    } */
                    BorderPane root = FXMLLoader.load(getClass().getResource("CreateAccountingAccountFXML.fxml"));
                    innerpane.getChildren().setAll(root);
                    anchorPaneConstraints(root);
            } catch (IOException ex) {
                    Logger.getLogger(AdminOptionsController.class.getName()).log(Level.SEVERE, null, ex);
            }

    }
        
    
    @FXML
    private void createRegAccountButton(ActionEvent event) {
            try {
                    BorderPane root = FXMLLoader.load(getClass().getResource("CreateRegistrarAccountFXML.fxml"));
                    innerpane.getChildren().setAll(root);
                    anchorPaneConstraints(root);
            } catch (IOException ex) {
                    Logger.getLogger(AdminOptionsController.class.getName()).log(Level.SEVERE, null, ex);
            }
    }
    
    @FXML
    private void listOfAccButton(ActionEvent event) {
            try {
                    BorderPane root = FXMLLoader.load(getClass().getResource("ListOfAccounts.fxml"));
                    innerpane.getChildren().setAll(root);
                    anchorPaneConstraints(root);
            } catch (IOException ex) {
                    Logger.getLogger(AdminOptionsController.class.getName()).log(Level.SEVERE, null, ex);
            }
    }
    
    @FXML
    private void enrollNewStudButton(ActionEvent Event) {
            try {
                    BorderPane root = FXMLLoader.load(getClass().getResource("EnrollmentNewFXML.fxml"));
                    innerpane.getChildren().setAll(root);
                    anchorPaneConstraints(root);
            } catch (IOException ex) {
                    Logger.getLogger(AdminOptionsController.class.getName()).log(Level.SEVERE, null, ex);
            }
    }
    
    @FXML
    private void enrollContStudButton(ActionEvent Event) {
            try {
                    BorderPane root = FXMLLoader.load(getClass().getResource("EnrollmentNewFXML.fxml"));
                    innerpane.getChildren().setAll(root);
                    anchorPaneConstraints(root);
            } catch (IOException ex) {
                    Logger.getLogger(AdminOptionsController.class.getName()).log(Level.SEVERE, null, ex);
            }
    }
    
    @FXML
    private void studDiscountButton(ActionEvent Event) {
            try {
                    BorderPane root = FXMLLoader.load(getClass().getResource("EnrollmentNewFXML.fxml"));
                    innerpane.getChildren().setAll(root);
                    anchorPaneConstraints(root);
            } catch (IOException ex) {
                    Logger.getLogger(AdminOptionsController.class.getName()).log(Level.SEVERE, null, ex);
            }
    }
    
    @FXML
    private void studSponsorshipButton(ActionEvent Event) {
            try {
                    BorderPane root = FXMLLoader.load(getClass().getResource("EnrollmentNewFXML.fxml"));
                    innerpane.getChildren().setAll(root);
                    anchorPaneConstraints(root);
            } catch (IOException ex) {
                    Logger.getLogger(AdminOptionsController.class.getName()).log(Level.SEVERE, null, ex);
            }
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }   
}

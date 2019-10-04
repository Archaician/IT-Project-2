/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ccfs_gui.Login;

import ccfs_gui.DialogWindows;
import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

/**
 *
 * @author Imran
 */
public class LoginController implements Initializable {
        public LogInMethod loginMethod = new LogInMethod();
        
        @FXML
        private Label validation;
        
        @FXML
        private TextField inputusername;
        
        @FXML
        private TextField inputpassword;
        
        @FXML
        private Button login_Btn;
        
        public void stageProperties(Stage stage) {
            stage.setMaximized(true);
            stage.setMinHeight(500);
            stage.setMinWidth(800);
            stage.setTitle("Cypress Christian Foundation School SIS");
            stage.setOnCloseRequest(c -> {
                        c.consume();
                        DialogWindows.confirmExit();
                        }); 
        }
        
        /* SAMPLE LOGIN ONLY! NO DATABASE VALIDATION. */
        @FXML
        private void loginButtonAction(ActionEvent event) {
                try {
                    
                    if (inputusername.getText().equalsIgnoreCase("Admin")) {
                        ((Node)event.getSource()).getScene().getWindow().hide();
                        Stage stage = new Stage();
                        stageProperties(stage);
                        FXMLLoader loader = new FXMLLoader();
                        Pane root = loader.load(getClass().getResource("/ccfs_gui/Admin/AdminOptionsFXML.fxml").openStream());
                       // AdminOptionsController adminOptionsController = (AdminOptionsController)loader.getController();
                        Scene scene = new Scene(root);
                        stage.setScene(scene);
                        stage.show();
                    } else if (inputusername.getText().equalsIgnoreCase("Registrar")) {
                        ((Node)event.getSource()).getScene().getWindow().hide();
                        Stage stage = new Stage();
                        stageProperties(stage);
                        FXMLLoader loader = new FXMLLoader();
                        Pane root = loader.load(getClass().getResource("/ccfs_gui/Registrar/RegistrarOptionsFXML.fxml").openStream());
                        Scene scene = new Scene(root);
                        stage.setScene(scene);
                        stage.show();
                    } else if (inputusername.getText().equalsIgnoreCase("Accounting")) {
                        ((Node)event.getSource()).getScene().getWindow().hide();
                        Stage stage = new Stage();
                        stageProperties(stage);
                        FXMLLoader loader = new FXMLLoader();
                        Pane root = loader.load(getClass().getResource("/ccfs_gui/Accounting/AccountingOptionsFXML.fxml").openStream());
                        Scene scene = new Scene(root);
                        stage.setScene(scene);
                        stage.show();
                    } else {
                        validation.setText("Username or password not found!");
                    }
                } catch(Exception e) {
                        e.printStackTrace();
                }
        } 
        
        @Override
        public void initialize(URL url, ResourceBundle rb) {
                // TODO
        /*        if (loginMethod.dbConnected()) {
                        label.setText("Connected to database.");
                } else {
                        label.setText("Error connecting to database!");
                } */
        }        
        
    /*    public void login(ActionEvent event) {
                try {
                        if (loginMethod.logIn(inputusername.getText(), inputpassword.getText())){
                                label.setText("Login Successful!");
                        } else {
                                label.setText("Wrong username or password!");
                        }
                } catch (Exception e) {
                        label.setText("Error!");
                     
                        System.out.println(e);
                        e.printStackTrace();
                }
                
        } */
}

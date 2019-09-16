/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ccfs_gui.Login;

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
        private Label label;
        
        @FXML
        private TextField inputusername;
        
        @FXML
        private TextField inputpassword;
        
        @FXML
        private void handleButtonAction(ActionEvent event) {
                try {
                        label.setText("Login Successful!");
                        
                        ((Node)event.getSource()).getScene().getWindow().hide();
                        Stage stage = new Stage();
                        FXMLLoader loader = new FXMLLoader();
                       // String filePath = new File("").getAbsolutePath();
                       // String localDir = System.getProperty("user.dir");
                        Pane root = loader.load(getClass().getResource("../Admin/AdminOptions.fxml").openStream());
                       // AdminOptionsController adminOptionsController = (AdminOptionsController)loader.getController();
                        Scene scene = new Scene(root);
                        stage.setTitle("Cypress Christian Foundation School SIS");
                        stage.setScene(scene);
                        stage.show();
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

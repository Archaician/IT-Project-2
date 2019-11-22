/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ccfs_gui.Login;

import ccfs_gui.DialogWindows;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
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
import javaRMI.ClientCon;

/**
 *
 * @author Imran
 */
public class LoginController implements Initializable {
    
    public static String getId;
    
    public static String id = null;
    @FXML
    public static Label validation;
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
            try {
            DialogWindows.confirmExit();
            } catch (Exception e) {
            
            }
        });
    }

    /* SAMPLE LOGIN ONLY! NO DATABASE VALIDATION. */
    @FXML
    private void loginButtonAction(ActionEvent event) {
        try {
            if (ClientCon.stub.logIn(inputusername.getText(), 
                    inputpassword.getText()) == true && ClientCon.stub.retType
                    (inputusername.getText(), inputpassword.getText()).equals("ADMIN")&&
                    ClientCon.stub.retId(inputusername.getText(), 
                    inputpassword.getText()).equals("LogIn")) {
                getId = ClientCon.stub.getId(inputusername.getText(),inputpassword.getText());
                ((Node)event.getSource()).getScene().getWindow().hide();
                Stage stage = new Stage();
                stageProperties(stage);
                FXMLLoader loader = new FXMLLoader();
                Pane root = loader.load(getClass().getResource("/ccfs_gui/Admin/AdminMainStageFXML.fxml").openStream());
               // AdminOptionsController adminOptionsController = (AdminOptionsController)loader.getController();
                Scene scene = new Scene(root);
                scene.getStylesheets().add(getClass().getResource("/ccfs_gui/style.css").toExternalForm());
                stage.setScene(scene);
                stage.show();
              //  sceneval.add((Scene) delete.getScene().getWindow());
            } else if (ClientCon.stub.logIn(inputusername.getText(), 
                    inputpassword.getText()) == true && ClientCon.stub.retType
                    (inputusername.getText(), inputpassword.getText()).equals("REGISTRAR")&&
                    ClientCon.stub.retId(inputusername.getText(), 
                    inputpassword.getText()).equals("LogIn")) {
                getId = ClientCon.stub.getId(inputusername.getText(),inputpassword.getText());
                ((Node)event.getSource()).getScene().getWindow().hide();
                Stage stage = new Stage();
                stageProperties(stage);
                FXMLLoader loader = new FXMLLoader();
                Pane root = loader.load(getClass().getResource("/ccfs_gui/Registrar"
                        + "/RegistrarMainStageFXML.fxml").openStream());
                Scene scene = new Scene(root);
                scene.getStylesheets().add(getClass().getResource("/ccfs_gui/style.css").toExternalForm());
                stage.setScene(scene);
                stage.show();
            } else if (ClientCon.stub.logIn(inputusername.getText(), 
                    inputpassword.getText()) == true && ClientCon.stub.retType
                    (inputusername.getText(), inputpassword.getText()).equals("ACCOUNTING")
                    && ClientCon.stub.retId(inputusername.getText(),
                    inputpassword.getText()).equals("LogIn")) {
                getId = ClientCon.stub.getId(inputusername.getText(),inputpassword.getText());
                ((Node)event.getSource()).getScene().getWindow().hide();
                Stage stage = new Stage();
                stageProperties(stage);
                FXMLLoader loader = new FXMLLoader();
                Pane root = loader.load(getClass().getResource("/ccfs_gui"
                        + "/Accounting/AccountingMainStageFXML.fxml").openStream());
                Scene scene = new Scene(root);
                scene.getStylesheets().add(getClass().getResource("/ccfs_gui/style.css").toExternalForm());
                stage.setScene(scene);
                stage.show();
            } else if (!ClientCon.stub.logIn(inputusername.getText(), 
                    inputpassword.getText()) == true){
                validation.setText("Username or password not found!");
            } else {
                validation.setText("Account is bieng used");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        ClientCon.conRMI("localhost");

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

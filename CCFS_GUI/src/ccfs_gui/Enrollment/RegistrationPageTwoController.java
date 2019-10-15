/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ccfs_gui.Enrollment;

import ccfs_gui.DialogWindows;
import ccfs_gui.LayoutProperties;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;

/**
 * FXML Controller class
 *
 * @author Imran
 */
public class RegistrationPageTwoController implements Initializable {

    @FXML
    private AnchorPane container;
    @FXML
    private BorderPane innerpane;
    @FXML
    private Label studID;
    @FXML
    private Label schYR;
    @FXML
    private Button sibling_Btn;
    @FXML
    private Button back_Btn;
    @FXML
    private Button enroll_Btn;
    @FXML
    private GridPane innerborderpane;
    @FXML
    private TextField fatherfirstname;
    @FXML
    private TextField fatherlastname;
    @FXML
    private TextField motherfirstname;
    @FXML
    private TextField motherlastname;
    @FXML
    private TextField fatheraddress;
    @FXML
    private TextField fatheroccupation;
    @FXML
    private TextField fatherworknum;
    @FXML
    private TextField fatherhomenum;
    @FXML
    private TextField fathermobile;
    @FXML
    private TextField fatheremail;
    @FXML
    private TextField motheraddress;
    @FXML
    private TextField motheroccupation;
    @FXML
    private TextField motherworknum;
    @FXML
    private TextField motherhomenum;
    @FXML
    private TextField mothermobile;
    @FXML
    private TextField motheremail;
    @FXML
    private TextField guardianname;
    @FXML
    private TextField guardianaddress;
    @FXML
    private TextField guardiannumber;

    public void getStudentID(String text) {
        studID.setText(text);
    }

    public void getSchoolYear(String text) {
        schYR.setText(text);
    }

    @FXML
    private void addSiblingButton(ActionEvent event) throws IOException {
        AnchorPane root = FXMLLoader.load(getClass().getResource("AddSiblingFXML.fxml"));
        container.getChildren().setAll(root);
        LayoutProperties.anchorPaneConstraints(root);
    }

    @FXML
    private void enrollButton(ActionEvent event) throws IOException {
        //TODO
        DialogWindows.dialogBox(Alert.AlertType.INFORMATION, "Register Student", "Successfully registered student.", ButtonType.OK, null, null);
        AnchorPane root = FXMLLoader.load(getClass().getResource("/ccfs_gui/Admin/AdminOptionsFXML.fxml"));
        container.getChildren().setAll(root);
        LayoutProperties.anchorPaneConstraints(root);
    }

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        //getStudentID("");
        //getSchoolYear("");
        // TODO
    }

}

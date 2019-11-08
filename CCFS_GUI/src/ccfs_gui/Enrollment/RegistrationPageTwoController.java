/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ccfs_gui.Enrollment;

import ccfs_gui.DialogWindows;
import ccfs_gui.FieldValidation;
import ccfs_gui.LayoutProperties;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javaRMI.ClientCon;
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
    private TextField fathermobile;
    @FXML
    private TextField fatheremail;
    @FXML
    private TextField motheraddress;
    @FXML
    private TextField motheroccupation;
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

    public void getSurname(String text) {
        fatherlastname.setText(text);
        motherlastname.setText(text);
    }

    @FXML
    private void addSiblingButton(ActionEvent event) throws IOException {
        AnchorPane root = FXMLLoader.load(getClass().getResource("AddSiblingFXML.fxml"));
        container.getChildren().setAll(root);
        LayoutProperties.anchorPaneConstraints(root);
    }

    @FXML
    private void enrollButton(ActionEvent event) throws Exception {
        /*Textfield validation.*/
        
        if (!fatherfirstname.getText().isEmpty()) {
            FieldValidation.requiredTextFieldWarning(fatherlastname, fatheraddress, fathermobile);
        } else if (!motherfirstname.getText().isEmpty()) {
            FieldValidation.requiredTextFieldWarning(motherlastname, motheraddress, mothermobile);
        } else if (!fatherlastname.getText().isEmpty() || !fatheraddress.getText().isEmpty() || !fatheroccupation.getText().isEmpty()
                || !fathermobile.getText().isEmpty() || !fatheremail.getText().isEmpty()) {
            FieldValidation.requiredTextFieldWarning(fatherfirstname);
        } else if (!motherlastname.getText().isEmpty() || !motheraddress.getText().isEmpty() || !motheroccupation.getText().isEmpty()
                || !mothermobile.getText().isEmpty() || !motheremail.getText().isEmpty()) {
            FieldValidation.requiredTextFieldWarning(motherfirstname);
        } else if (fatherfirstname.getText().isEmpty() && motherfirstname.getText().isEmpty()) {
            FieldValidation.requiredTextFieldWarning(guardianname, guardianaddress, guardiannumber);
        } else {
            RegistrationPageOneController.infoStud[13] = fatherfirstname.
                    getText();
            RegistrationPageOneController.infoStud[14] = fatherlastname.
                    getText();
            RegistrationPageOneController.infoStud[15] = 
                    RegistrationPageOneController.infoStud[10];
            RegistrationPageOneController.infoStud[16] = fathermobile.getText();
            RegistrationPageOneController.infoStud[17] = fatheremail.getText();
            RegistrationPageOneController.infoStud[18] = fatheroccupation.
                    getText();
            RegistrationPageOneController.infoStud[19] = motherfirstname.
                    getText();
            RegistrationPageOneController.infoStud[20] = motherlastname.
                    getText();
            RegistrationPageOneController.infoStud[21] = motheraddress.
                    getText();
            RegistrationPageOneController.infoStud[22] = mothermobile.getText();
            RegistrationPageOneController.infoStud[23] = motheremail.getText();
            RegistrationPageOneController.infoStud[24] = motheroccupation.
                    getText();
            RegistrationPageOneController.infoStud[34] = guardiannumber.
                    getText();
            RegistrationPageOneController.infoStud[33] = guardianaddress.
                    getText();
            RegistrationPageOneController.infoStud[32] = guardianname.getText();
            RegistrationPageOneController.infoStud[31] = "2020-1-1";
            RegistrationPageOneController.infoStud[30] = ClientCon.stub.
                    getYearID();
            ClientCon.stub.enStud(RegistrationPageOneController.infoStud);
            //TODO
            Alert alert = new Alert(Alert.AlertType.CONFIRMATION, "Register this student?", ButtonType.YES, ButtonType.NO);
            alert.showAndWait();

            if (alert.getResult() == ButtonType.YES) {
                DialogWindows.dialogBox(Alert.AlertType.INFORMATION, "Registered Student", "Successfully registered student.", ButtonType.OK);
                AnchorPane root = FXMLLoader.load(getClass().getResource("/ccfs_gui/Admin/AdminOptionsFXML.fxml"));
                container.getChildren().setAll(root);
                LayoutProperties.anchorPaneConstraints(root);
            } else {
                alert.close();
            }
        }
    }

    @FXML
    private void backButton(ActionEvent event) throws IOException {
        AnchorPane root = FXMLLoader.load(getClass().getResource("/ccfs_gui/Enrollment/RegistrationPageOneFXML.fxml"));
        container.getChildren().setAll(root);
        LayoutProperties.anchorPaneConstraints(root);
    }

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        FieldValidation.capsLock(fatherfirstname, fatherlastname, motherfirstname, motherlastname, fatheraddress, fatheroccupation,
                fatheremail, motheraddress, motheroccupation, motheremail, guardianname, guardianaddress);
        //getStudentID("");
//        fatheraddress.setText(RegistrationPageOneController.infoStud[10]);
        //getSchoolYear("");
        getSurname("");
        // TODO
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ccfs_gui.Admin;

import static ccfs_gui.Admin.AdminOptionsController.sceneval;
import ccfs_gui.DialogWindows;
import ccfs_gui.FieldValidation;
import ccfs_gui.LayoutProperties;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

/**
 * FXML Controller class
 *
 * @author Imran
 */
public class CreateAccountController implements Initializable {

    ObservableList list = FXCollections.observableArrayList();

    @FXML
    private AnchorPane container;
    @FXML
    private Label accID;
    @FXML
    private TextField empID;
    @FXML
    private ChoiceBox<String> acctype;
    @FXML
    private TextField firstname;
    @FXML
    private TextField lastname;
    @FXML
    private TextField username;
    @FXML
    private PasswordField passwd;
    @FXML
    private PasswordField confpasswd;
    @FXML
    private Button back_Btn;
    @FXML
    private Button create_Btn;

    private void setAccountID() {
        /*SAMPLE ONLY */
        accID.setText("[ID here]");
    }

    /*Show account type choicebox choices.*/
    private void loadAccountType() {
        list.removeAll(list);
        String registrar = "REGISTRAR";
        String accounting = "ACCOUNTING";
        list.addAll(registrar, accounting);
        acctype.getItems().addAll(list);
        acctype.setValue(registrar);
    }

    @FXML
    private void createButton(ActionEvent event) throws IOException {
        String strEmpid = empID.getText();
        String strAcctype = acctype.getValue();
        String strFirstname = firstname.getText();
        String strLastname = lastname.getText();
        String strUsername = username.getText();

        /*Required textfields validation.*/
        if (empID.getText().isEmpty() || firstname.getText().isEmpty() || lastname.getText().isEmpty()
                || username.getText().isEmpty() || passwd.getText().isEmpty()) {
            FieldValidation.requiredTextFieldWarning(empID, firstname, lastname, username, passwd);
        } else if (!passwd.getText().equals(confpasswd.getText())) {
            confpasswd.clear();
            passwd.setStyle("-fx-border-color: red");
            confpasswd.setStyle("-fx-border-color: red");
            confpasswd.setPromptText("PASSWORD DOES NOT MATCH!");
            confpasswd.setOnKeyTyped(e -> {
                passwd.setStyle("-fx-border-color: none");
                confpasswd.setStyle("-fx-border-color: none");
            });
        } else {
            Alert alert = new Alert(Alert.AlertType.CONFIRMATION, "Create an account with the following information?"
                    + "\nEmployee ID: " + strEmpid + "\nAccount Type: " + strAcctype + "\nFirst Name: " + strFirstname
                    + "\nLast Name: " + strLastname + "\nUsername: " + strUsername, ButtonType.YES, ButtonType.NO);
            alert.showAndWait();

            if (alert.getResult() == ButtonType.YES) {
                DialogWindows.dialogBox(Alert.AlertType.INFORMATION, "Created New Account", "Successfully created new account.", ButtonType.OK);
                AnchorPane root = FXMLLoader.load(getClass().getResource("AdminOptionsFXML.fxml"));
                container.getChildren().setAll(root);
                LayoutProperties.anchorPaneConstraints(root);
            } else {
                alert.close();
            }
        }
    }

    @FXML
    private void back() throws IOException {
        BackButton bb = new BackButton();

        bb.back(sceneval.get(sceneval.size() - 1));
        // fxmlval.remove(fxmlval.size() - 1);
        sceneval.remove(sceneval.size() - 1);

    }

    @FXML
    private void backButton(ActionEvent event) throws IOException {
        //back();
        AnchorPane root = FXMLLoader.load(getClass().getResource("AdminOptionsFXML.fxml"));
        container.getChildren().setAll(root);
        LayoutProperties.anchorPaneConstraints(root);
    }

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        FieldValidation.capsLock(empID, firstname, lastname, username);
        setAccountID();
        loadAccountType();
    }

}

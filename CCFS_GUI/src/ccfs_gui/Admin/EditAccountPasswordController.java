/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ccfs_gui.Admin;

import ccfs_gui.DialogWindows;
import ccfs_gui.FieldValidation;
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
import javafx.scene.control.PasswordField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;

/**
 * FXML Controller class
 *
 * @author Imran
 */
public class EditAccountPasswordController implements Initializable {

    @FXML
    private BorderPane innerpane;
    @FXML
    private AnchorPane container;
    @FXML
    private GridPane inner_borderpane;
    @FXML
    private Label name;
    @FXML
    private Label username;
    @FXML
    private PasswordField passwd;
    @FXML
    private PasswordField confpasswd;
    @FXML
    private Button ok_Btn;
    @FXML
    private Button back_Btn;

    @FXML
    private void changePassword(ActionEvent event) throws IOException {
        if (passwd.getText().isEmpty()) {
            FieldValidation.requiredTextFieldWarning(passwd);
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
            DialogWindows.dialogBox(Alert.AlertType.INFORMATION, "Password Changed", "Successfully changed account password.", ButtonType.OK);
            AnchorPane root = FXMLLoader.load(getClass().getResource("EditAccountPopupFXML.fxml"));
            container.getChildren().setAll(root);
            LayoutProperties.anchorPaneConstraints(root);
        }
    }

    @FXML
    private void backButton(ActionEvent event) throws IOException {
        AnchorPane root = FXMLLoader.load(getClass().getResource("EditAccountPopupFXML.fxml"));
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

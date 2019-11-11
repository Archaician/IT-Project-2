/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ccfs_gui.Admin;

import ccfs_gui.DialogWindows;
import ccfs_gui.LayoutProperties;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Imran
 */
public class EditAccountPopupController implements Initializable {

    @FXML
    private BorderPane innerpane;
    @FXML
    private AnchorPane container;
    @FXML
    private GridPane inner_borderpane;
    @FXML
    private Button changePasswd_Btn;
    @FXML
    private Button deleteAcc_Btn;
    @FXML
    private Button cancel_Btn;
    @FXML
    private Label name;
    @FXML
    private Label username;
    @FXML
    private Label acctype;

    @FXML
    private void editAccountButtons(ActionEvent event) throws IOException {
        if (event.getSource() == changePasswd_Btn) {
            AnchorPane root = FXMLLoader.load(getClass().getResource("EditAccountPasswordFXML.fxml"));
            container.getChildren().setAll(root);
            LayoutProperties.anchorPaneConstraints(root);
        } else if (event.getSource() == deleteAcc_Btn) {
            Alert alert = new Alert(Alert.AlertType.CONFIRMATION, "Are you sure you want to delete this account?", ButtonType.YES, ButtonType.NO);
            alert.showAndWait();

            if (alert.getResult() == ButtonType.YES) {
                //TODO
                DialogWindows.dialogBox(Alert.AlertType.INFORMATION, "Account Deleted", "Successfully deleted this account.", ButtonType.OK);
                ((Node) event.getSource()).getScene().getWindow().hide();
            } else {
                alert.close();
            }
        } else if (event.getSource() == cancel_Btn) {
            Stage stage = (Stage) cancel_Btn.getScene().getWindow();
            stage.close();
        }

    }

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

}

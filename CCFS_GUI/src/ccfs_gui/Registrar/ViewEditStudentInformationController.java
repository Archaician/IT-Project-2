/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ccfs_gui.Registrar;

import ccfs_gui.DialogWindows;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Imran
 */
public class ViewEditStudentInformationController implements Initializable {

    @FXML
    private AnchorPane container;
    @FXML
    private BorderPane innerpane;
    @FXML
    private Button save_Btn;
    @FXML
    private Button cancel_Btn;
    @FXML
    private TextField surname;
    @FXML
    private TextField givenname;
    @FXML
    private TextField middlename;
    @FXML
    private TextField birthplace;
    @FXML
    private TextField address;
    @FXML
    private TextField age;
    @FXML
    private TextField telnumber;
    @FXML
    private TextField mobilenumber;
    @FXML
    private TextField fathername;
    @FXML
    private TextField mothername;
    @FXML
    private TextField siblings;
    @FXML
    private DatePicker birthdate;
    @FXML
    private ChoiceBox<?> status;
    @FXML
    private ChoiceBox<?> gender;
    @FXML
    private ChoiceBox<?> gradelvl;
    
    @FXML
    private void saveEdits(ActionEvent event) {
        //TODO
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION, "Are you sure you want to save changes?", ButtonType.YES, ButtonType.NO);
        alert.showAndWait();

        if (alert.getResult() == ButtonType.YES) {
            //TODO
            DialogWindows.dialogBox(Alert.AlertType.INFORMATION, "Saved Changes", "Successfully saved changes to student information.", ButtonType.OK);
            ((Node) event.getSource()).getScene().getWindow().hide();
        } else {
            alert.close();
        }
    }
    
    @FXML
    private void cancelButton(ActionEvent event) {
        Stage stage = (Stage) cancel_Btn.getScene().getWindow();
        stage.close();
    }

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}

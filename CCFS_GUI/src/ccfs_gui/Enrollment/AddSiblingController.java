/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ccfs_gui.Enrollment;

import ccfs_gui.FieldValidation;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;

/**
 * FXML Controller class
 *
 * @author Imran
 */
public class AddSiblingController implements Initializable {

    @FXML
    private AnchorPane container;
    @FXML
    private BorderPane innerpane;
    @FXML
    private Label studID;
    @FXML
    private TextField surname;
    @FXML
    private TextField givenname;
    @FXML
    private DatePicker birthdate;
    @FXML
    private TextField school;
    @FXML
    private Button sibling_Btn;
    @FXML
    private TableView<?> siblingsinfo_Table;
    @FXML
    private TableColumn<?, ?> sibsurname_Col;
    @FXML
    private TableColumn<?, ?> sibgivenname_Col;
    @FXML
    private TableColumn<?, ?> sibbirthdate_Col;
    @FXML
    private TableColumn<?, ?> sibschool_Col;
    @FXML
    private TableColumn<?, ?> action_Col;

    @FXML
    private void addSiblingButton(ActionEvent event) throws IOException {
        /*Required textfields validation.*/
        if (surname.getText().isEmpty() || givenname.getText().isEmpty() || school.getText().isEmpty()) {
            FieldValidation.requiredTextFieldWarning(surname, givenname, school);
        } else if (birthdate.getValue() == null) {
            FieldValidation.requiredDateWarning(birthdate);
        } else {
            //TODO
        }
    }
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        FieldValidation.capsLock(surname, givenname, school);
        surname.setText(RegistrationPageOneController.infoStud[3]);
        school.setText(RegistrationPageOneController.infoStud[11]);
        // TODO
    }

}

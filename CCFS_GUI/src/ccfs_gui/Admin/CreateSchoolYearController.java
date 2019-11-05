/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ccfs_gui.Admin;

import ccfs_gui.DialogWindows;
import ccfs_gui.FieldValidation;
import java.net.URL;
import java.time.LocalDate;
import java.util.Optional;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.DatePicker;
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
public class CreateSchoolYearController implements Initializable {

    @FXML
    private AnchorPane container;
    @FXML
    private BorderPane innerpane;
    @FXML
    private Button cancel_Btn;
    @FXML
    private Button create_Btn;
    @FXML
    private Button viewSchYrList_Btn;
    @FXML
    private GridPane inner_borderpane;
    @FXML
    private DatePicker datestart;
    @FXML
    private DatePicker dateend;
    @FXML
    private Label invalid;
    
    @FXML
    private void createButton(ActionEvent event) {
        LocalDate start = datestart.getValue();
        LocalDate end = dateend.getValue();

        /*Field validation.*/
        if (start == null || end == null) {
            invalid.setText("");
            FieldValidation.requiredDateWarning(datestart, dateend);
        } else if (start.isEqual(end) || start.isAfter(end)) {
            invalid.setText("INVALID SCHOOL YEAR!\nDATE END MUST BE AFTER DATE START.");
        } else {
            String yrStart = Integer.toString(datestart.getValue().getYear());
            String yrEnd = Integer.toString(dateend.getValue().getYear());

            if (yrStart.equals(yrEnd)) {
                invalid.setText("INVALID SCHOOL YEAR!\nYEAR START AND YEAR END ARE THE SAME.");
            } else {
                invalid.setText("");
                Alert alert = new Alert(Alert.AlertType.CONFIRMATION, "Create a new school year with the following information?\n"
                        + "\nSchool Year: " + yrStart + "-" + yrEnd + "\nDate Start: " + start + "\nDate End: " + end, ButtonType.YES, ButtonType.NO);
                alert.showAndWait();

                if (alert.getResult() == ButtonType.YES) {
                    //TODO
                    DialogWindows.dialogBox(Alert.AlertType.INFORMATION, "Created New School Year", "Successfully created school year " + yrStart + "-" + yrEnd + ".", ButtonType.OK);
                    ((Node) event.getSource()).getScene().getWindow().hide();
                } else {
                    alert.close();
                }
            }
        }
    }

    @FXML
    private void otherButtons(ActionEvent event) {
        if (event.getSource() == viewSchYrList_Btn) {
            Stage stage = (Stage) viewSchYrList_Btn.getScene().getWindow();
            stage.close();
            //TODO
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
        /*Set datepicker value to current date.*/
        datestart.setValue(Optional.ofNullable(datestart.getValue()).orElse(LocalDate.now()));
    }

}

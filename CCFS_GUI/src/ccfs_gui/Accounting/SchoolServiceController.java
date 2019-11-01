/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ccfs_gui.Accounting;

import ccfs_gui.DialogWindows;
import ccfs_gui.FieldValidation;
import java.net.URL;
import java.time.LocalDate;
import java.util.Optional;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
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
public class SchoolServiceController implements Initializable {

    @FXML
    private AnchorPane container;
    @FXML
    private BorderPane innerpane;
    @FXML
    private Button cancel_Btn;
    @FXML
    private Button confirm_Btn;
    @FXML
    private GridPane inner_borderpane;
    @FXML
    private Label invalid;
    @FXML
    private DatePicker datestart;
    @FXML
    private DatePicker dateend;
    @FXML
    private Label amount;

    @FXML
    private void confirmButton(ActionEvent event) {
        LocalDate start = datestart.getValue();
        LocalDate end = dateend.getValue();

        /*Field validation.*/
        if (datestart.getValue() == null || dateend.getValue() == null) {
            invalid.setText("");
            FieldValidation.requiredDateWarning(datestart, dateend);
        } else if (start.isAfter(end)) {
            invalid.setText("INVALID DATE!\nDATE END MUST BE SAME AS, OR AFTER DATE START.");
        } else {
            invalid.setText("");
            Alert alert = new Alert(Alert.AlertType.CONFIRMATION, "Add school service fee to this student?\n"
                    + "\nDate Start: " + start + "\nDate End: " + end, ButtonType.YES, ButtonType.NO);
            alert.showAndWait();

            if (alert.getResult() == ButtonType.YES) {
                //TODO
                DialogWindows.dialogBox(Alert.AlertType.INFORMATION, "Added School Service Fee", "Successfully added school service fee.", ButtonType.OK);
                //Stage stage = (Stage) ButtonType.OK.getScene().getWindow();
                //stage.close();
            } else {
                alert.close();
            }
        }
    }

    @FXML
    private void otherButtons(ActionEvent event) {
        Stage stage = (Stage) cancel_Btn.getScene().getWindow();
        stage.close();
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

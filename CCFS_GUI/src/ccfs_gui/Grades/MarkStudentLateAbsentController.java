/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ccfs_gui.Grades;

import ccfs_gui.FieldValidation;
import java.net.URL;
import java.time.LocalDate;
import java.util.Optional;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.DatePicker;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Imran
 */
public class MarkStudentLateAbsentController implements Initializable {

    ObservableList list = FXCollections.observableArrayList();

    @FXML
    private DatePicker attendancedate;
    @FXML
    private ChoiceBox<String> attendancetype;
    @FXML
    private Button cancel_Btn;
    @FXML
    private Button save_Btn;

    /*Show attendance type choicebox choices*/
    private void loadAttendanceType() {
        list.removeAll(list);
        String absent = "ABSENT";
        String tardy = "TARDY";
        list.addAll(absent, tardy);
        attendancetype.getItems().addAll(list);
        attendancetype.setValue(absent);
    }

    @FXML
    private void saveButton(ActionEvent event) {
        /*Field validation.*/
        if (attendancedate.getValue() == null) {
            FieldValidation.requiredDateWarning(attendancedate);
        } else {
            //TODO
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
        /*Set datepicker value to current date.*/
        attendancedate.setValue(Optional.ofNullable(attendancedate.getValue()).orElse(LocalDate.now()));
        
        loadAttendanceType();
    }

}

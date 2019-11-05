/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ccfs_gui.Grades;

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
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Imran
 */
public class EditKinderCompetencyController implements Initializable {

    @FXML
    private Button cancel_Btn;
    @FXML
    private Button save_Btn;
    @FXML
    private TableView<?> editmarks_Table;
    @FXML
    private TableColumn<?, ?> firstquarter_Col;
    @FXML
    private TableColumn<?, ?> secondquarter_Col;
    @FXML
    private TableColumn<?, ?> thirdquarter_Col;
    @FXML
    private TableColumn<?, ?> fourthquarter_Col;

    @FXML
    private void saveEdits(ActionEvent event) {
        //TODO
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION, "Are you sure you want to save changes?", ButtonType.YES, ButtonType.NO);
        alert.showAndWait();

        if (alert.getResult() == ButtonType.YES) {
            //TODO
            DialogWindows.dialogBox(Alert.AlertType.INFORMATION, "Saved Changes", "Successfully saved changes to competency marks.", ButtonType.OK);
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

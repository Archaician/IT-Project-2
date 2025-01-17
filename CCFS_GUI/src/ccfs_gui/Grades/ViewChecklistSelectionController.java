/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ccfs_gui.Grades;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Paul
 */
public class ViewChecklistSelectionController implements Initializable {
    
    @FXML
    private Button kinderChecklist_Btn;
    @FXML
    private Button gradeSchoolChecklist_Btn;    
    @FXML
    private Button closeButton;

    @FXML
    private void checklistSelection(ActionEvent event) throws IOException {
        AnchorPane root = null;

        if (event.getSource() == kinderChecklist_Btn) {
            Stage stage = (Stage) kinderChecklist_Btn.getScene().getWindow();
            stage.close();
            root = FXMLLoader.load(getClass().getResource("/ccfs_gui/Registrar/KinderChecklist.fxml"));
        } else if (event.getSource() == gradeSchoolChecklist_Btn) {
            Stage stage = (Stage) gradeSchoolChecklist_Btn.getScene().getWindow();
            stage.close();
            root = FXMLLoader.load(getClass().getResource("/ccfs_gui/Registrar/GradeSchoolGrades.fxml"));
        }
    }
    
    @FXML
    private void closebuttonApp() {
        Stage stage = (Stage) closeButton.getScene().getWindow();
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

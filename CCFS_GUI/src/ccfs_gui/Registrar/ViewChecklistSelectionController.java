/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ccfs_gui.Registrar;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;

/**
 * FXML Controller class
 *
 * @author D528_PC24
 */
public class ViewChecklistSelectionController implements Initializable {
    @FXML
    private Button kinderChecklist_Btn;

    @FXML
    private Button gradeSchoolCheklist_Btn;

    @FXML
    private void checklistSelection(ActionEvent event) throws IOException{
        AnchorPane root = null;
        
       if (event.getSource() == kinderChecklist_Btn) {
         root = FXMLLoader.load(getClass().getResource("/ccfs_gui/Registrar/KinderChecklist.fxml"));  
       } else if (event.getSource() == gradeSchoolCheklist_Btn)
           root = FXMLLoader.load(getClass().getResource("/ccfs_gui/Registrar/GradeSchoolGrades.fxml"));  
        
    }

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ccfs_gui.Grades;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;

/**
 * FXML Controller class
 *
 * @author Admin
 */
public class SubjectSelectionController implements Initializable {
    @FXML
    private AnchorPane container;
    @FXML
    private BorderPane innerpane;
    @FXML
    private Button back_Btn;
    //List of Subjects
    @FXML
    private TableView<?> subjectList_Table;
    //Start of Columns
    @FXML
    private TableColumn<?, ?> gradeLevel_Col;
    @FXML
    private TableColumn<?, ?> subject_Col;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void backButton(ActionEvent event) {
    }
    
}

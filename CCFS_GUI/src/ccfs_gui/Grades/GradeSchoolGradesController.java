/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ccfs_gui.Grades;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author Admin
 */
public class GradeSchoolGradesController implements Initializable {
    @FXML
    private TextField searchButton;
    //Start of Table
    @FXML
    private TableColumn<?, ?> checkId_Col;
    @FXML
    private TableColumn<?, ?> coreValues_Col;
    @FXML
    private TableColumn<?, ?> description_Col;
    @FXML
    private TableColumn<?, ?> firstQuarter_Col;
    @FXML
    private TableColumn<?, ?> secondQuarter_Col;
    @FXML
    private TableColumn<?, ?> thirdQuarter_Col;
    @FXML
    private TableColumn<?, ?> fourthQuarter_Col;
    @FXML
    private Button editGrades_Btn;
    @FXML
    private Label studentName;
    @FXML
    private Button back_Btn;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}

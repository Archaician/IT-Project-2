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
import javafx.scene.layout.AnchorPane;

/**
 * FXML Controller class
 *
 * @author Admin
 */
public class ViewGradesv2Controller implements Initializable {
    @FXML
    private AnchorPane container;
    //Header name of Subject
    @FXML
    private Label subjectName;
    @FXML
    private Button back_Btn;
    //Start of Table
    @FXML
    private TableColumn<?, ?> gradeId_Col;
    @FXML
    private TableColumn<?, ?> studName_Col;
    @FXML
    private TableColumn<?, ?> firstQuarter_Col;
    @FXML
    private TableColumn<?, ?> secondQuarter_Col;
    @FXML
    private TableColumn<?, ?> thirdQuarter_Col;
    @FXML
    private TableColumn<?, ?> fourthQuarter_Col;
    @FXML
    private TableColumn<?, ?> finalGrade_Col;
    @FXML
    private TableColumn<?, ?> remarks_Col;
    //Edit the grades of the Student
    @FXML
    private Button editGrades_Btn;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}

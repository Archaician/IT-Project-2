/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ccfs_gui.Admin;

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
 * @author Imran
 */
public class ListOfSchoolYearsController implements Initializable {

    @FXML
    private AnchorPane container;
    @FXML
    private BorderPane innerpane;
    @FXML
    private Button back_Btn;
    @FXML
    private Button logout_Btn;
    @FXML
    private TableView<?> schoolyearslist_Table;
    @FXML
    private TableColumn<?, ?> schoolyear_Col;
    @FXML
    private TableColumn<?, ?> schoolyearstatus_Col;
    @FXML
    private TableColumn<?, ?> action_Col;

    @FXML
    private void backButton(ActionEvent event) {
        //TODO
    }
    
    @FXML
    private void logoutButton(ActionEvent event) {
        //TODO
    }

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ccfs_gui.Admin;

import java.net.URL;
import java.time.LocalDate;
import java.util.Optional;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;

/**
 * FXML Controller class
 *
 * @author Acer
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
    private GridPane inner_borderpane;
    @FXML
    private DatePicker datestart;
    @FXML
    private DatePicker dateend;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        /*Set datepicker value to current date*/
        datestart.setValue(Optional.ofNullable(datestart.getValue()).orElse(LocalDate.now()));
    }    

    @FXML
    private void createButton(ActionEvent event) {
        //TODO
    }
    
    @FXML
    private void otherButtons(ActionEvent event) {
        
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ccfs_gui.Enrollment;

import ccfs_gui.DialogWindows;
import ccfs_gui.LayoutProperties;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;

/**
 * FXML Controller class
 *
 * @author Acer
 */
public class EnrollmentContinuingController implements Initializable {

    ObservableList list = FXCollections.observableArrayList();

    @FXML
    private AnchorPane container;
    @FXML
    private BorderPane innerpane;
    @FXML
    private Label studID;
    @FXML
    private Label schYR;
    @FXML
    private TextField searchbar;
    @FXML
    private Label noResultText;
    @FXML
    private Button back_Btn;
    @FXML
    private Button enroll_Btn;
    @FXML
    private TextField idnumber;
    @FXML
    private TextField surname;
    @FXML
    private TextField givenname;
    @FXML
    private TextField middlename;
    @FXML
    private TextField birthdate;
    @FXML
    private TextField birthplace;
    @FXML
    private TextField address;
    @FXML
    private TextField telephone;
    @FXML
    private TextField mobile;
    @FXML
    private TextField lastGradeLvl;
    @FXML
    private ChoiceBox<?> newgradelvl;
    @FXML
    private TextField prevschool;

    /*Show grade level choicebox choices.*/
    private void loadGradeLevel() {
        list.removeAll(list);
        String nursery = "Nursery";
        String prekinder = "Pre-Kinder";
        String kinder = "Kinder";
        String one = "Grade 1";
        String two = "Grade 2";
        String three = "Grade 3";
        String four = "Grade 4";
        String five = "Grade 5";
        String six = "Grade 6";
        list.addAll(nursery, prekinder, kinder, one, two, three, four, five, six);
        newgradelvl.getItems().addAll(list);
        //newgradelvl.setValue();
    }
    
    @FXML
    private void searchByLastName(ActionEvent event) throws IOException {
        //TODO
    }
    
    @FXML
    private void searchByID(ActionEvent event) throws IOException {
        //TODO
    }

    @FXML
    private void enrollButton(ActionEvent event) throws IOException {
        //TODO
    }

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        loadGradeLevel();
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ccfs_gui.Enrollment;

import ccfs_gui.FieldValidation;
import ccfs_gui.LayoutProperties;
import java.io.IOException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.ResourceBundle;
import javaRMI.ClientCon;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;

/**
 * FXML Controller class
 *
 * @author Imran
 */
public class RegistrationPageOneController implements Initializable {
    
    ObservableList list = FXCollections.observableArrayList();
    public static String[] infoStud = new String[33];
    
    @FXML   
    private BorderPane innerpane;
    @FXML
    private Label schYR;
    @FXML
    private Label studID;
    @FXML
    private TextField surname;
    @FXML
    private TextField givenname;
    @FXML
    private TextField middlename;
    @FXML
    private ChoiceBox<String> gender;
    @FXML
    private DatePicker birthdate;
    @FXML
    private ChoiceBox<String> gradelvl;
    @FXML
    private TextField birthplace;
    @FXML
    private TextField address;
    @FXML
    private TextField telephone;
    @FXML
    private TextField mobile;
    @FXML
    private TextField prevschool;
    @FXML
    private AnchorPane container;

    private void setStudentID() {
        /*SAMPLE ONLY */
        studID.setText("[ID here]");
    }

    private void setSchoolYear() {
        /*SAMPLE ONLY */
        schYR.setText("[YR here]");
    }
    
    private void setSurname() {
        String sur = surname.getText();
    }

    /*Show gender choicebox choices*/
    private void loadGender() {
        list.removeAll(list);
        String male = "MALE";
        String female = "FEMALE";
        list.addAll(male, female);
        gender.getItems().addAll(list);
        gender.setValue(male);
    }
    
    /*Show grade level choicebox choices.*/
    private void loadGradeLevel() {
        list.removeAll(list);
        String nursery = "NURSERY";
        String prekinder = "PRE-KINDER";
        String kinder = "KINDER";
        String one = "GRADE 1";
        String two = "GRADE 2";
        String three = "GRADE 3";
        String four = "GRADE 4";
        String five = "GRADE 5";
        String six = "GRADE 6";
        list.addAll(nursery, prekinder, kinder, one, two, three, four, five, six);
        gradelvl.getItems().addAll(list);
        gradelvl.setValue(nursery);
    }

    @FXML
    private void nextButton(ActionEvent event) throws Exception {
        /*Required textfields validation.*/
        String studID;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-ddd");

        if (surname.getText().isEmpty() || givenname.getText().isEmpty() || middlename.getText().isEmpty()
                || birthplace.getText().isEmpty() || address.getText().isEmpty() || prevschool.getText().isEmpty()) {
            FieldValidation.requiredTextFieldWarning(surname, givenname, middlename, birthplace, address, prevschool);
        } else if (birthdate.getValue() == null) {
            FieldValidation.requiredDateWarning(birthdate);
        } else {
            if (ClientCon.stub.getLastID().equals("0")) {
                studID = ClientCon.stub.getSchoolYear().substring
                (ClientCon.stub.getSchoolYear().length() - 2) + "1";
            }else {
                studID = ClientCon.stub.getSchoolYear().substring
                (ClientCon.stub.getSchoolYear().length() - 2) + Integer.parseInt(ClientCon.stub.
                        getLastID() + 1);
            }
            infoStud[0] = studID;
            infoStud[1] = givenname.getText();
            infoStud[2] = middlename.getText();
            infoStud[3] = surname.getText();
            infoStud[4] = gradelvl.getValue();
            infoStud[5] = simpleDateFormat.format(birthdate.getValue());
            infoStud[6] = birthplace.getText();
            infoStud[7] = gender.getValue();
            infoStud[8] = telephone.getText();
            infoStud[9] = mobile.getText();
            infoStud[10] = address.getText();
            infoStud[11] = prevschool.getText();
            infoStud[12] = "Enrolled";
            FXMLLoader loader = new FXMLLoader();
            AnchorPane root = FXMLLoader.load(getClass().getResource("RegistrationPageTwoFXML.fxml"));
            
            RegistrationPageTwoController pageTwo = (RegistrationPageTwoController) loader.getController();

            /*Pass student ID and school year values to the next page.*/
            //  pageTwo.getStudentID(studID.getText());
            //  pageTwo.getSchoolYear(schYR.getText());
           // pageTwo.getSurname(surname.getText());
            container.getChildren().setAll(root);
            LayoutProperties.anchorPaneConstraints(root);
        }
    }
    
    @FXML
    private void backButton(ActionEvent event) throws IOException {
        /*AnchorPane root = FXMLLoader.load(getClass().getResource("/ccfs_gui/Admin/AdminOptionsFXML.fxml"));
        container.getChildren().setAll(root);
        LayoutProperties.anchorPaneConstraints(root); */
    }

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        FieldValidation.capsLock(surname, givenname, middlename, birthplace, address, prevschool);
        setStudentID();
        setSchoolYear();
        setSurname();
        loadGender();
        loadGradeLevel();
        // TODO
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ccfs_gui.Admin;

import ccfs_gui.DialogWindows;
import ccfs_gui.FieldValidation;
import ccfs_gui.LayoutProperties;
import java.io.IOException;
import java.net.URL;
import java.time.LocalDate;
import java.util.Optional;
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
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableRow;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.TextFieldTableCell;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;

/**
 * FXML Controller class
 *
 * @author Imran
 */
public class CreateSchoolYearController implements Initializable {

    private ObservableList<SchoolYears> schyrdata;

    @FXML
    private AnchorPane container;
    @FXML
    private BorderPane innerpane;
    @FXML
    private Button back_Btn;
    @FXML
    private Button create_Btn;
    @FXML
    private Button viewSchYrList_Btn;
    @FXML
    private DatePicker datestart;
    @FXML
    private DatePicker dateend;
    @FXML
    private TextField schooldays;
    @FXML
    private TextField preschTuition;
    @FXML
    private TextField preschMisc;
    @FXML
    private TextField preschBooks;
    @FXML
    private TextField preschTotal;
    @FXML
    private TextField grdschTuition;
    @FXML
    private TextField grdschMisc;
    @FXML
    private TextField grdschBooks;
    @FXML
    private TextField grdschTotal;
    @FXML
    private Label invalid;
    @FXML
    private TabPane tabPane;
    @FXML
    private Tab dates_Tab;
    @FXML
    private Tab fees_Tab;
    @FXML
    private TableView<SchoolYears> setSectionsAndTeachers_Table;
    @FXML
    private TableColumn<SchoolYears, String> gradelevels_Col;
    @FXML
    private TableColumn<SchoolYears, String> sections_Col;
    @FXML
    private TableColumn<SchoolYears, String> teachers_Col;

    private void populateTable() {
        setSectionsAndTeachers_Table.getColumns().addAll(gradelevels_Col, sections_Col, teachers_Col);

        //schyrdata = FXCollections.observableArrayList(new SchoolYears("Nursery"));
        /*Make table rows clickable.*/
        setSectionsAndTeachers_Table.setRowFactory(tv -> {
            TableRow<SchoolYears> row = new TableRow<>();
            row.setOnMouseClicked(event -> {
                if (event.getClickCount() == 2 && (!row.isEmpty())) {
                    SchoolYears rowData = row.getItem();
                    //sections_Col.setEditable(true);
                    sections_Col.setCellFactory(TextFieldTableCell.forTableColumn());
                    teachers_Col.setCellFactory(TextFieldTableCell.forTableColumn());
                }
            });
            return row;
        });
    }

    public void onEditChange(TableColumn.CellEditEvent<SchoolYears, String> schoolYearsStringCellEditEvent) {
        SchoolYears schoolyears = setSectionsAndTeachers_Table.getSelectionModel().getSelectedItem();
        schoolyears.setSection(schoolYearsStringCellEditEvent.getNewValue());
        //schoolyears.setAdviser(schoolYearsStringCellEditEvent.getNewValue());
    }
    
    private void computeTotal() {
        //String prtuition = preschTuition.getText();
        //TODO
    }

    @FXML
    private void createButton(ActionEvent event) throws IOException {
        LocalDate start = datestart.getValue();
        LocalDate end = dateend.getValue();

        /*Field validation.*/
        if (start == null || end == null || schooldays.getText().isEmpty()) {
            tabPane.getSelectionModel().select(dates_Tab);
            invalid.setText("");
            FieldValidation.requiredDateWarning(datestart, dateend);
            FieldValidation.requiredTextFieldWarning(schooldays);
        } else if (start.isEqual(end) || start.isAfter(end)) {
            tabPane.getSelectionModel().select(dates_Tab);
            invalid.setText("INVALID SCHOOL YEAR!\nDATE END MUST BE AFTER DATE START.");
        } else if (preschTuition.getText().isEmpty() || preschMisc.getText().isEmpty() || preschBooks.getText().isEmpty() ||
                grdschTuition.getText().isEmpty() || grdschMisc.getText().isEmpty() || grdschBooks.getText().isEmpty()) {
            tabPane.getSelectionModel().select(fees_Tab);
            FieldValidation.requiredTextFieldWarning(preschTuition, preschMisc, preschBooks, grdschTuition, grdschMisc, grdschBooks);
        } else {
            String yrStart = Integer.toString(datestart.getValue().getYear());
            String yrEnd = Integer.toString(dateend.getValue().getYear());

            if (yrStart.equals(yrEnd)) {
                tabPane.getSelectionModel().select(dates_Tab);
                invalid.setText("INVALID SCHOOL YEAR!\nYEAR START AND YEAR END ARE THE SAME.");
            } else {
                invalid.setText("");
                Alert alert = new Alert(Alert.AlertType.CONFIRMATION, "Create a new school year with the following information?\n"
                        + "\nSchool Year: " + yrStart + "-" + yrEnd + "\nDate Start: " + start + "\nDate End: " + end, ButtonType.YES, ButtonType.NO);
                alert.showAndWait();

                if (alert.getResult() == ButtonType.YES) {
                    //TODO
                    DialogWindows.dialogBox(Alert.AlertType.INFORMATION, "Created New School Year", "Successfully created school year " + yrStart + "-" + yrEnd + ".", ButtonType.OK);
                    AnchorPane root = FXMLLoader.load(getClass().getResource("AdminOptionsFXML.fxml"));
                    container.getChildren().setAll(root);
                    LayoutProperties.anchorPaneConstraints(root);
                } else {
                    alert.close();
                }
            }
        }
    }

    @FXML
    private void otherButtons(ActionEvent event) throws IOException {
        if (event.getSource() == viewSchYrList_Btn) {
            Alert alert = new Alert(Alert.AlertType.WARNING, "Go to list of school years? \nAny changes you've made to this page will not be saved.", ButtonType.YES, ButtonType.NO);
            alert.showAndWait();

            if (alert.getResult() == ButtonType.YES) {
                AnchorPane root = FXMLLoader.load(getClass().getResource("ListOfSchoolYearsFXML.fxml"));
                container.getChildren().setAll(root);
                LayoutProperties.anchorPaneConstraints(root);
            } else {
                alert.close();
            }
        } else if (event.getSource() == back_Btn) {
            //TODO
        }

    }

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        FieldValidation.numericTextField(preschTuition, preschMisc, preschBooks, grdschTuition, grdschMisc, grdschBooks);
        /*Set datepicker value to current date.*/
        datestart.setValue(Optional.ofNullable(datestart.getValue()).orElse(LocalDate.now()));

        populateTable();
    }

}

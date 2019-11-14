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
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
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
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableRow;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;

/**
 * FXML Controller class
 *
 * @author Imran
 */
public class EnrollmentContinuingController implements Initializable {

    ObservableList list = FXCollections.observableArrayList();
    private ObservableList<Student> studentlist;

    @FXML
    private AnchorPane container;
    @FXML
    private BorderPane innerpane;
    @FXML
    private Label schYR;
    @FXML
    private TextField searchbar;
    @FXML
    private Label resultText;
    @FXML
    private Button searchBySurname_Btn;
    @FXML
    private Button searchByID_Btn;
    @FXML
    private Button enroll_Btn;
    @FXML
    private Button back_Btn;
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
    private ChoiceBox<String> newgradelvl;
    @FXML
    private TableView<Student> enrollcontinuing_Table;
    @FXML
    private TableColumn<Student, Integer> idnumber_Col;
    @FXML
    private TableColumn<Student, String> surname_Col;
    @FXML
    private TableColumn<Student, String> givenname_Col;

    private static Connection con;

    private void dbaseConnection() throws SQLException {
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ccfs?"
                + "user=root&password=");
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
        newgradelvl.getItems().addAll(list);
        //newgradelvl.setValue();
    }

    @FXML
    private void searchStudent(ActionEvent event) throws IOException, SQLException {

        if (searchbar.getText().isEmpty()) {
            searchbar.setStyle("-fx-border-color: red");
            searchbar.setOnKeyTyped(e -> {
                searchbar.setStyle("-fx-border-color: none");
            });
        } else if (event.getSource() == searchBySurname_Btn) {
            studentlist = FXCollections.observableArrayList();
            studentlist.clear();
            dbaseConnection();
            ResultSet rs = con.createStatement().executeQuery("SELECT `IDno`,`SurName`,`GivenName` FROM `enstudent` WHERE SurName=" + "'" + searchbar.getText() + "'");
            while (rs.next()) {
                Student student = new Student();
                student.setStudentID(rs.getInt("IDno"));
                student.setSurname(rs.getString("SurName"));
                student.setGivenName(rs.getString("GivenName"));

                studentlist.add(student);
            }
        } else if (event.getSource() == searchByID_Btn) {
            studentlist = FXCollections.observableArrayList();
            studentlist.clear();
            dbaseConnection();
            ResultSet rs = con.createStatement().executeQuery("SELECT `IDno`,`SurName`,`GivenName` FROM `enstudent` WHERE IDno=" + "'" + searchbar.getText() + "'");
            while (rs.next()) {
                Student student = new Student();
                student.setStudentID(rs.getInt("IDno"));
                student.setSurname(rs.getString("SurName"));
                student.setGivenName(rs.getString("GivenName"));

                studentlist.add(student);
            }
        }

        idnumber_Col.setCellValueFactory(new PropertyValueFactory<>("studentID"));
        surname_Col.setCellValueFactory(new PropertyValueFactory<>("surname"));
        givenname_Col.setCellValueFactory(new PropertyValueFactory<>("givenName"));

        /*Make table rows clickable.*/
        enrollcontinuing_Table.setRowFactory(tv -> {
            TableRow<Student> row = new TableRow<>();
            row.setOnMouseClicked(e -> {
                if (e.getClickCount() == 2 && (!row.isEmpty())) {
                    try {
                        Student rowData = row.getItem();
                        
                        /*Load information of selected student to textfields.*/
                        ResultSet rs = con.createStatement().executeQuery("SELECT `IDno`,`SurName`,`GivenName`,`MiddleName`,`birthdate`,`birthplace`,"
                                + "`studaddress`,`homeTelnum`,`mobilenum`,`gradelvl` FROM `enstudent` WHERE IDno=" + "'" + rowData.getStudentID() + "'");
                        while (rs.next()) {
                            idnumber.setText(rs.getString("IDno"));
                            surname.setText(rs.getString("SurName"));
                            givenname.setText(rs.getString("GivenName"));
                            middlename.setText(rs.getString("MiddleName"));
                            birthdate.setText(rs.getString("birthdate"));
                            birthplace.setText(rs.getString("birthplace"));
                            address.setText(rs.getString("studaddress"));
                            telephone.setText(rs.getString("homeTelnum"));
                            mobile.setText(rs.getString("mobilenum"));
                            lastGradeLvl.setText(rs.getString("gradelvl"));
                        }
                    } catch (SQLException ex) {
                        Logger.getLogger(EnrollmentContinuingController.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            });
            return row;
        });

        if (studentlist.size() > 0) {
            enrollcontinuing_Table.setItems(studentlist);
            resultText.setStyle("-fx-text-fill: green");
            resultText.setText(studentlist.size() + " search result(s).\nDouble click to select a student.");
        } else {
            resultText.setStyle("-fx-text-fill: red");
            resultText.setText("Student not found.");
        }

    }

        @FXML
        private void enrollButton(ActionEvent event) throws IOException {
            if (idnumber.getText().isEmpty()) {
                DialogWindows.dialogBox(Alert.AlertType.ERROR, "No Student Selected", "Please select a student to enroll.", ButtonType.OK);
            } else {
                Alert alert = new Alert(Alert.AlertType.CONFIRMATION, "Enroll this student?", ButtonType.YES, ButtonType.NO);
                alert.showAndWait();

                if (alert.getResult() == ButtonType.YES) {
                    //TODO
                    DialogWindows.dialogBox(Alert.AlertType.INFORMATION, "Enrolled Student", "Successfully enrolled student.", ButtonType.OK);
                    AnchorPane root = FXMLLoader.load(getClass().getResource("/ccfs_gui/Admin/AdminOptionsFXML.fxml"));
                    container.getChildren().setAll(root);
                    LayoutProperties.anchorPaneConstraints(root);
                } else {
                    alert.close();
                }
            }
        }

        @FXML
        private void backButton(ActionEvent event) throws IOException {
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

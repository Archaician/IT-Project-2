/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ccfs_gui.Registrar;

import ccfs_gui.Admin.Accounts;
import ccfs_gui.Admin.ListOfAccountsController;
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
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TableCell;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableRow;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.util.Callback;

/**
 * FXML Controller class
 *
 * @author Paul ; Imran
 */
public class ViewListOfStudentController implements Initializable {
    
    ObservableList list = FXCollections.observableArrayList();
    ObservableList studList = FXCollections.observableArrayList();

    @FXML
    private BorderPane innerpane;
    @FXML
    private ChoiceBox<String> sort;
    @FXML
    private AnchorPane container;
    @FXML
    private Label schYr;
    @FXML
    private TextField searchbar;
    @FXML
    private Button back_Btn;
    @FXML
    private TableView<Students> studlist_Table;
    @FXML
    private TableColumn<Students, Integer> idnumber_Col;
    @FXML
    private TableColumn<Students, String> studname_Col;
    @FXML
    private TableColumn<Students, String> gradelvl_Col;
    @FXML
    private TableColumn<Students, String> section_Col;
    @FXML
    private TableColumn<Students, String> teacher_Col;
    @FXML
    private TableColumn action_Col;
    
    private static Connection con;
    
    private void dbaseConnection() throws SQLException {
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ccfs?"
                + "user=root&password=");
    }
    
    
    /*Show sort options.*/
    private void loadSortBy(){
      list.removeAll(list);
      String latest = "Latest";
      String ascend = "Ascending";
      String descend = "Descending";
      list.addAll(latest, ascend, descend);
      sort.getItems().addAll(list);
      sort.setValue(latest);
    }
    
    private void populateStudentListTable() throws SQLException {
        studList = FXCollections.observableArrayList();
        
        dbaseConnection();
        ResultSet rs = con.createStatement().executeQuery("SELECT `IDno`, `SurName`, `gradelvl`, `gradelvl`, `GivenName` FROM `enstudent`");
        while (rs.next()) {
            Students students = new Students();
            students.setidNumber(rs.getInt("IDno"));
            students.setStudentName(rs.getString("SurName")); //must be combination of firstname and lastname
            students.setGradeLevel(rs.getString("gradelvl"));
            students.setSection(rs.getString("gradelvl"));
            students.setTeacher(rs.getString("GivenName"));
            
            studList.add(students);
        }
        
        idnumber_Col.setCellValueFactory(new PropertyValueFactory<>("idNumber"));
        studname_Col.setCellValueFactory(new PropertyValueFactory<>("studentName"));
        gradelvl_Col.setCellValueFactory(new PropertyValueFactory<>("gradeLevel"));
        section_Col.setCellValueFactory(new PropertyValueFactory<>("section"));
        teacher_Col.setCellValueFactory(new PropertyValueFactory<>("teacher"));
        
 /*Make table rows clickable.*/
        studlist_Table.setRowFactory(tv -> {
            TableRow<Students> row = new TableRow<>();
            row.setOnMouseClicked(event -> {
                if (event.getClickCount() == 2 && (! row.isEmpty()) ) {
                    try {
                        Students rowData = row.getItem();
                        
                        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("ViewEditStudentInformation.fxml"));
                        Parent root1 = (Parent) fxmlLoader.load();
                        Stage stage = new Stage();
                        stage.setScene(new Scene(root1));
                        stage.setResizable(false);
                        stage.initModality(Modality.APPLICATION_MODAL);
                        stage.showAndWait();
                    } catch (IOException ex) {
                        Logger.getLogger(ListOfAccountsController.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            });
            return row ;
        });
        
        studlist_Table.setItems(studList);
    }
    
    @FXML
    private void backButton(ActionEvent event) {
        //TODO
    }
    
    

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        try {
            dbaseConnection();
            loadSortBy();
            populateStudentListTable();
        } catch (SQLException ex) {
            Logger.getLogger(ViewListOfStudentController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }    
    
}

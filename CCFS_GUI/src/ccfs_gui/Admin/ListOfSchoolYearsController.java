/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ccfs_gui.Admin;

import ccfs_gui.DialogWindows;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TableCell;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableRow;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.util.Callback;

/**
 * FXML Controller class
 *
 * @author Imran
 */
public class ListOfSchoolYearsController implements Initializable {

    private ObservableList<SchoolYears> schyrlist;

    @FXML
    private AnchorPane container;
    @FXML
    private BorderPane innerpane;
    @FXML
    private Button back_Btn;
    @FXML
    private Button logout_Btn;
    @FXML
    private TableView<SchoolYears> schoolyearslist_Table;
    @FXML
    private TableColumn<SchoolYears, String> schoolyear_Col;
    @FXML
    private TableColumn<SchoolYears, String> schoolyearstatus_Col;
    @FXML
    private TableColumn action_Col;

    private static Connection con;

    private void dbaseConnection() throws SQLException {
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ccfs?"
                + "user=root&password=");
    }

    private void populateSchoolYearsListTable() throws SQLException {
        schyrlist = FXCollections.observableArrayList();
        schyrlist.clear();
        
        dbaseConnection();
        ResultSet rs = con.createStatement().executeQuery("SELECT CONCAT(yearstart, '-', yearend), `Status` FROM `schoolyear`");
        while (rs.next()) {
            SchoolYears schoolyears = new SchoolYears();
            schoolyears.setSchoolYear(rs.getString("CONCAT(yearstart, '-', yearend)"));
            schoolyears.setStatus(rs.getString("Status"));

            schyrlist.add(schoolyears);
        }

        schoolyear_Col.setCellValueFactory(new PropertyValueFactory<>("schoolYear"));
        schoolyearstatus_Col.setCellValueFactory(new PropertyValueFactory<>("status"));
        
        /*Create a button under Action column for every non-empty row.*/
        Callback<TableColumn<SchoolYears, String>, TableCell<SchoolYears, String>> cellFactory = (p) -> {

            final TableCell<SchoolYears, String> cell = new TableCell<SchoolYears, String>() {

                @Override
                public void updateItem(String item, boolean empty) {
                    super.updateItem(item, empty);

                    if (empty) {
                        setGraphic(null);
                        setText(null);
                    } else {
                        final Button editBtn = new Button();
                        SchoolYears yrs = getTableView().getItems().get(getIndex());

                        String schoolyr = schoolyear_Col.getCellData(yrs);
                        
                        /*Button to deactivate school year*/
                        if (schoolyearstatus_Col.getCellData(yrs).equalsIgnoreCase("Active")) {
                            editBtn.setText("SET AS INACTIVE");
                            editBtn.setStyle("-fx-text-fill: red ");
                            
                            editBtn.setOnAction(e -> {
                                Alert alert = new Alert(Alert.AlertType.CONFIRMATION, "Deactivate school year " + schoolyr + "?", ButtonType.YES, ButtonType.NO);
                                alert.showAndWait();

                                if (alert.getResult() == ButtonType.YES) {
                                    try {
                                        PreparedStatement ps = con.prepareStatement("UPDATE `schoolyear` SET `Status`='Inactive' WHERE CONCAT(yearstart, '-', yearend)=  " + "'" + schoolyr + "'");
                                        ps.executeUpdate();
                                        DialogWindows.dialogBox(Alert.AlertType.INFORMATION, "School Year Deactivated", "School year " + schoolyr + " has been set as inactive.", ButtonType.OK);
                                        populateSchoolYearsListTable(); //refresh table
                                    } catch (SQLException ex) {
                                        Logger.getLogger(ListOfSchoolYearsController.class.getName()).log(Level.SEVERE, null, ex);
                                    }
                                } else {
                                    alert.close();
                                }
                            });
                        /*Button to activate school year*/
                        } else if (schoolyearstatus_Col.getCellData(yrs).equalsIgnoreCase("Inactive")) {
                            editBtn.setText("SET AS ACTIVE");
                            editBtn.setStyle("-fx-text-fill: green");
                            
                            editBtn.setOnAction(e -> {
                                Alert alert = new Alert(Alert.AlertType.CONFIRMATION, "Activate school year " + schoolyr + "?", ButtonType.YES, ButtonType.NO);
                                alert.showAndWait();

                                if (alert.getResult() == ButtonType.YES) {
                                    try {
                                        PreparedStatement ps = con.prepareStatement("UPDATE `schoolyear` SET `Status`='Active' WHERE CONCAT(yearstart, '-', yearend)=  " + "'" + schoolyr + "'");
                                        ps.executeUpdate();
                                        DialogWindows.dialogBox(Alert.AlertType.INFORMATION, "School Year Activated", "School year " + schoolyr + " has been set as active.", ButtonType.OK);
                                        populateSchoolYearsListTable(); //refresh table
                                    } catch (SQLException ex) {
                                        Logger.getLogger(ListOfSchoolYearsController.class.getName()).log(Level.SEVERE, null, ex);
                                    }
                                } else {
                                    alert.close();
                                }
                            });
                        }

                        setGraphic(editBtn);
                    }
                }
            };

            return cell;
        };
        
        /*Make table rows clickable.*/
        schoolyearslist_Table.setRowFactory(tv -> {
            TableRow<SchoolYears> row = new TableRow<>();
            row.setOnMouseClicked(event -> {
                if (event.getClickCount() == 2 && (! row.isEmpty()) ) {
                        SchoolYears rowData = row.getItem();
                        
                        Alert alert = new Alert(Alert.AlertType.INFORMATION, "School year", ButtonType.OK);
                        alert.showAndWait();
                }
            });
            return row ;
        });

        action_Col.setCellFactory(cellFactory);

        schoolyearslist_Table.setItems(schyrlist);
    }

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
        try {
            dbaseConnection();
            populateSchoolYearsListTable();
        } catch (SQLException ex) {
            Logger.getLogger(ListOfAccountsController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}

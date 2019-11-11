/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ccfs_gui.Admin;

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
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableCell;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.util.Callback;

/**
 * FXML Controller class
 *
 * @author Imran
 */
public class ListOfAccountsController implements Initializable {
    
    private ObservableList<Accounts> acclist;

    @FXML
    private AnchorPane container;
    @FXML
    private BorderPane innerpane;
    @FXML
    private Button back_Btn;
    @FXML
    private TableView<Accounts> accountslist_Table;
    @FXML
    private TableColumn<Accounts, Integer> accid_Col;
    @FXML
    private TableColumn<Accounts, String> name_Col;
    @FXML
    private TableColumn<Accounts, String> username_Col;
    @FXML
    private TableColumn<Accounts, String> accounttype_Col;
    @FXML
    private TableColumn<Accounts, String> accountstatus_Col;
    @FXML
    private TableColumn action_Col;
    
    private static Connection con;
    
    private void dbaseConnection() throws SQLException {
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ccfs?"
                + "user=root&password=");
    }
    
    private void populateAccountsListTable() throws SQLException {
        acclist = FXCollections.observableArrayList();
        
        dbaseConnection();
        ResultSet rs = con.createStatement().executeQuery("SELECT `accid`, `lname`, `username`, `type`, `accstatus` FROM `accounts`");
        while (rs.next()) {
            Accounts accounts = new Accounts();
            accounts.setAccountID(rs.getInt("accid"));
            accounts.setName(rs.getString("lname")); //must be combination of firstname and lastname
            accounts.setUsername(rs.getString("username"));
            accounts.setAccountType(rs.getString("type"));
            accounts.setAccountStatus(rs.getString("accstatus"));
            
            acclist.add(accounts);
        }
        
        accid_Col.setCellValueFactory(new PropertyValueFactory<>("accountID"));
        name_Col.setCellValueFactory(new PropertyValueFactory<>("name"));
        username_Col.setCellValueFactory(new PropertyValueFactory<>("username"));
        accounttype_Col.setCellValueFactory(new PropertyValueFactory<>("type"));
        accountstatus_Col.setCellValueFactory(new PropertyValueFactory<>("status"));
        
        /*Create a button under Action column for every row.*/
        Callback<TableColumn<Accounts, String>, TableCell<Accounts, String>> cellFactory = (p) -> {
            
            final TableCell<Accounts, String> cell = new TableCell<Accounts, String>() {
                
                @Override
                public void updateItem(String item, boolean empty) {
                    super.updateItem(item, empty);
                    
                    if (empty) {
                        setGraphic(null);
                        setText(null);
                    } else {
                        final Button editBtn = new Button("Edit");
                        editBtn.setOnAction(e -> {
                            try {
                                Accounts acc = getTableView().getItems().get(getIndex());
                                
                                FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("EditAccountPopupFXML.fxml"));
                                Parent root1 = (Parent) fxmlLoader.load();
                                Stage stage = new Stage();
                                stage.setScene(new Scene(root1));
                                stage.setResizable(false);
                                stage.initModality(Modality.APPLICATION_MODAL);
                                stage.showAndWait();
                            } catch (IOException ex) {
                                Logger.getLogger(ListOfAccountsController.class.getName()).log(Level.SEVERE, null, ex);
                            }
                        });
                        
                        setGraphic(editBtn);
                        //editBtn.setStyle("-fx-background-color: yellowgreen");
                    }
                }
            };
            
            return cell;
        };
        
        action_Col.setCellFactory(cellFactory);
        
        accountslist_Table.setItems(acclist);
    }
    
    @FXML
    private void backButton(ActionEvent event) throws IOException {
        AnchorPane root = FXMLLoader.load(getClass().getResource("AdminOptionsFXML.fxml"));
        container.getChildren().setAll(root);
        LayoutProperties.anchorPaneConstraints(root);
    }
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        try {
            dbaseConnection();
            populateAccountsListTable();
        } catch (SQLException ex) {
            Logger.getLogger(ListOfAccountsController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }    
    
}

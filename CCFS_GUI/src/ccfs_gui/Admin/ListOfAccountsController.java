/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ccfs_gui.Admin;

import ccfs_gui.LayoutProperties;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;

/**
 * FXML Controller class
 *
 * @author Acer
 */
public class ListOfAccountsController implements Initializable {

    @FXML
    private AnchorPane container;
    @FXML
    private BorderPane innerpane;
    @FXML
    private Button back_Btn;
    @FXML
    private TableView<?> accountslist_Table;
    @FXML
    private TableColumn<?, ?> name_Col;
    @FXML
    private TableColumn<?, ?> username_Col;
    @FXML
    private TableColumn<?, ?> accounttype_Col;
    @FXML
    private TableColumn<?, ?> accountstatus_Col;
    @FXML
    private TableColumn<?, ?> action_Col;
    
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
        // TODO
    }    
    
}

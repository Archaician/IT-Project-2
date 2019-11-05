/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ccfs_gui.Registrar;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;

/**
 * FXML Controller class
 *
 * @author Paul ; Imran
 */
public class ViewStudentArchiveController implements Initializable {
    
    ObservableList list = FXCollections.observableArrayList();
    
    @FXML
    private BorderPane innerpane;
    @FXML
    private ChoiceBox<String> sort;
    @FXML
    private AnchorPane container;
    @FXML
    private TextField searchbar;
    @FXML
    private Button back_Btn;
    @FXML
    private TableView<?> studarchive_Table;
    @FXML
    private TableColumn<?, ?> idnumber_Col;
    @FXML
    private TableColumn<?, ?> studname_Col;
    @FXML
    private TableColumn<?, ?> gradelvl_Col;
    @FXML
    private TableColumn<?, ?> status_Col;
    
    private void loadSortBy(){
      list.removeAll(list);
      String latest = "Latest";
      String ascend = "Ascending";
      String descend = "Descending";
      list.addAll(latest, ascend, descend);
      sort.getItems().addAll(list);
      sort.setValue(latest);
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
        loadSortBy();
    }    
    
}

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
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ChoiceBox;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;

/**
 * FXML Controller class
 *
 * @author D528_PC24
 */
public class ViewListOfStudentController implements Initializable {
    
    ObservableList list = FXCollections.observableArrayList();

    @FXML
    private BorderPane innerpane;
    
    @FXML
    private ChoiceBox<String> sort;
    
    @FXML
    private AnchorPane container;
    
    //Show Sort By Options
    private void loadSortBy(){
      list.removeAll(list);
      String latest = "Latest";
      String ascend = "Ascending";
      String descend = "Descending";
      list.addAll(latest, ascend, descend);
      sort.getItems().addAll(list);
    }
    
    private void anchorPaneConstraints(BorderPane root) {
      AnchorPane.setTopAnchor(root, 0.0);
      AnchorPane.setRightAnchor(root, 0.0);
      AnchorPane.setLeftAnchor(root, 0.0);
      AnchorPane.setBottomAnchor(root, 0.0);
     }    

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        loadSortBy();
    }    
    
}

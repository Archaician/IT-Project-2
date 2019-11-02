/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ccfs_gui.DiscountSponsor;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;

/**
 * FXML Controller class
 *
 * @author Paul ; Imran
 */
public class DiscountOptionsController implements Initializable {

    ObservableList list = FXCollections.observableArrayList();

    @FXML
    private ChoiceBox<String> discountType;
    @FXML
    private ChoiceBox<String> discountPercentage;
    @FXML
    private AnchorPane container;
    @FXML
    private Button back_Btn;
    @FXML
    private Button confrm_Btn;
    @FXML
    private TextField searchbar;

    private void selectDiscountPercentage() {
        list.removeAll(list);
        String academic = "Academic";
        String pastoral = "Pastoral";
        String siblings = "Sibling Discount";
        list.addAll(academic, pastoral, siblings);
        discountType.getItems().addAll(list);
        discountType.setValue(academic);
        
        if (discountType.getValue().equals(academic)) {
            list.removeAll(list);
            String fifty = "50%";
            String seventyfive = "75%";
            String hundred = "100%";
            list.addAll(fifty, seventyfive, hundred);
            discountPercentage.getItems().addAll(list);
            discountPercentage.setValue(fifty);
        } else if (discountType.getValue().equals(pastoral)) {
            list.removeAll(list);
            String fifty = "50%";
            list.addAll(fifty);
            discountPercentage.getItems().addAll(list);
            discountPercentage.setValue(fifty);
        } else if (discountType.getValue().equals(siblings)) {
            list.removeAll(list);
            String ten = "10%";
            String twenty = "20%";
            String fifty = "50%";
            list.addAll(ten, twenty, fifty);
            discountPercentage.getItems().addAll(list);
            discountPercentage.setValue(ten);
        }

    }
    
    @FXML
    private void search(ActionEvent event) {
        //TODO
    }
    
    @FXML
    private void confirmButton(ActionEvent event) {
        //TODO
    }

    @FXML
    private void backButton(ActionEvent event) {
        //TODO
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        selectDiscountPercentage();
    }

}

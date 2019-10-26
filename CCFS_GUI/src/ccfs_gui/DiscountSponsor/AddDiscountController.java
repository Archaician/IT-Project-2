/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ccfs_gui.DiscountSponsor;

import java.net.URL;
import static java.util.Collections.list;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ChoiceBox;
import javafx.scene.text.Text;

/**
 * FXML Controller class
 *
 * @author Lenovo
 */
public class AddDiscountController implements Initializable {
    
    ObservableList list = FXCollections.observableArrayList();
    
    @FXML
    private Text studentName_label;

    @FXML
    private ChoiceBox<String> discountType;

    @FXML
    private ChoiceBox<String> discountPercentage;
    
    private void selectDiscountType() {
        list.removeAll(list);
        String siblings = "Siblings";
        String pastoral = "Pastoral";
        String academic = "Academic";
        list.addAll(siblings, pastoral, academic);
        discountType.getItems().addAll(list);
        discountType.setValue(siblings);
    }
    
    private void selectDiscountPercentage() {
        list.removeAll(list);
        String ten = "10%";
        String twenty = "20%";
        String fifty = "50%";
        String oneHundred = "100%";
        list.addAll(ten, twenty, fifty, oneHundred);
        discountPercentage.getItems().addAll(list);
        discountPercentage.setValue(ten);
    }
        
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        selectDiscountType();
        selectDiscountPercentage();
    }    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ccfs_gui.DiscountSponsor;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Lenovo
 */
public class RemoveSponsorController implements Initializable {

    @FXML
    private Button closeButton;
    @FXML
    private TextField idNumSearch_Btn;

    @FXML
    private void closebuttonApp(){
    Stage stage = (Stage) closeButton.getScene().getWindow();
    stage.close();
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}

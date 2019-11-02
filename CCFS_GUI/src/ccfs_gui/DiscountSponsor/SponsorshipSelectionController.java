/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ccfs_gui.DiscountSponsor;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Modality;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Lenovo
 */
public class SponsorshipSelectionController implements Initializable {

    @FXML
    private Button closeButton;
    @FXML
    private Button addSponsor_Btn;
    @FXML
    private Button remSponsor_Btn;

    
    @FXML
    private void sponsorshipSelection(ActionEvent event) throws IOException{
        AnchorPane root = null;
        if (event.getSource() == addSponsor_Btn) {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/ccfs_gui/DiscountSponsor/AddSponsor.fxml"));
            Parent root1 = (Parent) fxmlLoader.load();
            Stage stage = new Stage();
            stage.setScene(new Scene(root1));
            stage.setResizable(false);
            stage.initModality(Modality.APPLICATION_MODAL);
            stage.showAndWait();
        } else if (event.getSource() == remSponsor_Btn) {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/ccfs_gui/DiscountSponsor/RemoveSponsor.fxml"));
            Parent root1 = (Parent) fxmlLoader.load();
            Stage stage = new Stage();
            stage.setScene(new Scene(root1));
            stage.setResizable(false);
            stage.initModality(Modality.APPLICATION_MODAL);
            stage.showAndWait();
        }
        
    }
    
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

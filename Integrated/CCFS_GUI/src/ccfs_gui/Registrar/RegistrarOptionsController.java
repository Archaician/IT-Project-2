/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ccfs_gui.Registrar;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonBar;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;

/**
 * FXML Controller class
 *
 * @author Acer
 */
public class RegistrarOptionsController implements Initializable {

        @FXML
        private BorderPane outer_borderpane;
        @FXML
        private AnchorPane left_outer_pane;
        @FXML
        private AnchorPane bottom_outer_pane;
        @FXML
        private ButtonBar bottom_inner_pane;
        @FXML
        private Button logout_button;
        @FXML
        private GridPane inner_borderpane;
        @FXML
        private Button main_options_buttons1;
        @FXML
        private Button main_options_buttons2;
        @FXML
        private Button main_options_buttons3;
        @FXML
        private Button main_options_buttons4;
        @FXML
        private Button main_options_buttons5;
        @FXML
        private Button main_options_buttons6;
        @FXML
        private Button main_options_buttons7;
        @FXML
        private Button main_options_buttons8;
        @FXML
        private Button main_options_buttons9;
        @FXML
        private Button main_options_buttons10;
        @FXML
        private AnchorPane right_outer_pane;
        @FXML
        private AnchorPane innerpane;
        /**
         * Initializes the controller class.
         */
        private void anchorPaneConstraints(BorderPane root) {
            AnchorPane.setTopAnchor(root, 0.0);
            AnchorPane.setRightAnchor(root, 0.0);
            AnchorPane.setLeftAnchor(root, 0.0);
            AnchorPane.setBottomAnchor(root, 0.0);
    }
        
        @FXML
        public void viewGrades(ActionEvent event) {
                try {
                        BorderPane root = FXMLLoader.load(getClass().getResource("ViewGrades.fxml"));
                        innerpane.getChildren().setAll(root);
                        anchorPaneConstraints(root);
                } catch (IOException ex) {
                        Logger.getLogger(RegistrarOptionsController.class.getName()).log(Level.SEVERE, null, ex);
                }
        }
        
        @Override
        public void initialize(URL url, ResourceBundle rb) {
                // TODO
        }        
        
}

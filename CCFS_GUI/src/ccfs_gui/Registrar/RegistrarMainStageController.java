/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ccfs_gui.Registrar;

import ccfs_gui.LayoutProperties;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;

/**
 * FXML Controller class
 *
 * @author Imran
 */
public class RegistrarMainStageController implements Initializable {

        @FXML
        private BorderPane outer_borderpane;
        @FXML
        private AnchorPane left_outer_pane;
        @FXML
        private AnchorPane bottom_outer_pane;
        @FXML
        private AnchorPane right_outer_pane;
        @FXML
        private AnchorPane container;
        
        private void initialContent() throws IOException {
                AnchorPane root = FXMLLoader.load(getClass().getResource("RegistrarOptionsFXML.fxml"));
                container.getChildren().setAll(root);
                LayoutProperties.anchorPaneConstraints(root);
        }
        
        
        /**
         * Initializes the controller class.
         */
        @Override
        public void initialize(URL url, ResourceBundle rb) {
                try {
                        initialContent();
                } catch (IOException ex) {
                        Logger.getLogger(RegistrarMainStageController.class.getName()).log(Level.SEVERE, null, ex);
                }
        }        
        
}

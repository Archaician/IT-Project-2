/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ccfs_gui.Login;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

/**
 *
 * @author @Imran
 * @version 1.0
 */
public class Logout {
        @FXML
        public void logout(ActionEvent event, Button logoutbtn) throws IOException {
                ((Node)event.getSource()).getScene().getWindow().hide();
                Stage stage = new Stage();
                FXMLLoader loader = new FXMLLoader();
                Pane root = loader.load(getClass().getResource("/ccfs_gui/Login/LoginFXML.fxml").openStream());
                // AdminOptionsController adminOptionsController = (AdminOptionsController)loader.getController();
                Scene scene = new Scene(root);
                stage.setScene(scene);
                stage.show();
        }

}

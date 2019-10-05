/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ccfs_gui.Admin;

//import static ccfs_gui.Admin.AdminOptionsController.fxmlval;
import java.io.IOException;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author @Imran
 * @version 1.0
 */
public class BackButton {
        
        public void back(Scene scene) throws IOException{
                
                Stage stage = new Stage();
                //Parent parent = FXMLLoader.load(getClass().getResource(instance));
             //   scene = new Scene(parent);
                stage.setScene(scene);
    }
}
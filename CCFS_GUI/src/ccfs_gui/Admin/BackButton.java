/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ccfs_gui.Admin;

import java.io.IOException;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author @Imran
 * @version 1.0
 */
class BackButton {
        
        public void back(String instance,Stage stage) throws IOException{
                    Parent parent = FXMLLoader.load(getClass().getResource(instance));
                    Scene scene = new Scene(parent);
                   // scene.getStylesheets().add("/css/Style.css");
                    stage.setResizable(false);
                    stage.setScene(scene);
                    stage.show();
    }

}

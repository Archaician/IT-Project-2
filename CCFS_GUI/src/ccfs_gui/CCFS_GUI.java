/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ccfs_gui;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.application.Application;
import javafx.geometry.Rectangle2D;
import javafx.scene.Group;
import javafx.stage.Screen;

/**
 *
 * @author Imran
 */
public class CCFS_GUI extends Application {
        
        @Override
        public void start(Stage stage) throws Exception {
                Parent root = FXMLLoader.load(getClass().getResource("Admin/AdminOptionsFXML.fxml"));
                
                Scene scene = new Scene(root);
                
                stage.setTitle("Cypress Christian Foundation School SIS");
                stage.setScene(scene);
               // stage.setResizable(false);
               
                //resize Stage to fit screen
                Rectangle2D primaryScreenBounds = Screen.getPrimary().getVisualBounds();
                stage.setX(primaryScreenBounds.getMinX());
                stage.setY(primaryScreenBounds.getMinY());
                stage.setWidth(primaryScreenBounds.getWidth());
                stage.setHeight(primaryScreenBounds.getHeight());
                
                stage.setMinHeight(500);
                stage.setMinWidth(800);
                
                stage.show();
        }

        /**
         * @param args the command line arguments
         */
        public static void main(String[] args) {
                launch(args);
        }
        
}

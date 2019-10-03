/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ccfs_gui;

import static ccfs_gui.Admin.AdminOptionsController.fxmlval;
import static ccfs_gui.Admin.AdminOptionsController.sceneval;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.application.Application;
import javafx.stage.StageStyle;

/**
 *
 * @author Imran
 */
public class CCFS_GUI extends Application {
     //   PopupWindows pw = new PopupWindows();
        @Override
        public void start(Stage stage) throws Exception {
                Parent root = FXMLLoader.load(getClass().getResource("Admin/AdminOptionsFXML.fxml"));
                
                Scene scene = new Scene(root);
                
                stage.setTitle("Cypress Christian Foundation School SIS");
                stage.setScene(scene);
              //  fxmlval.add("AdminOptionsFXML.fxml");                                   
              //  stage = (Stage) validate.getScene().getWindow();
              //  sceneval.add((Scene) delete.getScene().getWindow());
               // stage.setResizable(false);
               
             // stage.centerOnScreen();
                stage.setMaximized(true);
                stage.setMinHeight(500);
                stage.setMinWidth(800);
               // stage.initStyle(StageStyle.UTILITY);
                stage.show();
                
                stage.setOnCloseRequest(c -> {
                        c.consume();
                        DialogWindows.confirmExit();
                        });    
        }

        /**
         * @param args the command line arguments
         */
        public static void main(String[] args) {
                launch(args);
        }
        
}

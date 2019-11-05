/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ccfs_gui.Grades;

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
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Modality;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Imran
 */
public class KinderCompetencyController implements Initializable {

    @FXML
    private AnchorPane container;
    @FXML
    private TextField searchbar;
    @FXML
    private Button back_Btn;
    @FXML
    private Label studname;
    @FXML
    private TableView<?> competency_Table;
    @FXML
    private TableColumn<?, ?> checkid_Col;
    @FXML
    private TableColumn<?, ?> competencyarea_Col;
    @FXML
    private TableColumn<?, ?> description_Col;
    @FXML
    private TableColumn<?, ?> firstquarter_Col;
    @FXML
    private TableColumn<?, ?> secondquarter_Col;
    @FXML
    private TableColumn<?, ?> thirdquarter_Col;
    @FXML
    private TableColumn<?, ?> fourthquarter_Col;
    @FXML
    private Button editcompetency_Btn;

    @FXML
    private void editCompetency(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("EditKinderCompetency.fxml"));
        Parent root1 = (Parent) fxmlLoader.load();
        Stage stage = new Stage();
        stage.setScene(new Scene(root1));
        stage.setResizable(false);
        stage.initModality(Modality.APPLICATION_MODAL);
        stage.showAndWait();
        
        //TODO
    }

    @FXML
    private void backButton(ActionEvent event) {
        //TODO
    }

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

}

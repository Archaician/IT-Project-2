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
 * @author Imran
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
    private Button registerStud_Btn;
    @FXML
    private Button enrollContStud_Btn;
    @FXML
    private Button viewStudList_Btn;
    @FXML
    private Button viewArchive_Btn;
    @FXML
    private Button attendance_Btn;
    @FXML
    private Button studGrades_Btn;
    @FXML
    private Button studDiscount_Btn;
    @FXML
    private Button studSponsorship_Btn;
    @FXML
    private Button studChecklist_Btn;
    @FXML
    private Button generateReports_Btn;
    @FXML
    private AnchorPane right_outer_pane;
    @FXML
    private AnchorPane container;

    @FXML
    private void registrarOptionsButtons(ActionEvent event) throws IOException {
        AnchorPane root = null;

        if (event.getSource() == registerStud_Btn) {
            root = FXMLLoader.load(getClass().getResource("/ccfs_gui/Enrollment/RegistrationPageOneFXML.fxml"));
        } else if (event.getSource() == enrollContStud_Btn) {
            root = FXMLLoader.load(getClass().getResource("/ccfs_gui/Enrollment/EnrollmentContinuingFXML.fxml"));
        }

        container.getChildren().setAll(root);
        LayoutProperties.anchorPaneConstraints(root);
    }

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

}

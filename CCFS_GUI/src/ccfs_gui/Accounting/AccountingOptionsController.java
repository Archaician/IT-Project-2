/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ccfs_gui.Accounting;

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

/**
 * FXML Controller class
 *
 * @author Imran
 */
public class AccountingOptionsController implements Initializable {

    @FXML
    private AnchorPane container;
    @FXML
    private ButtonBar bottom_inner_pane;
    @FXML
    private Button logout_button;
    @FXML
    private Button viewAddPayments_Btn;
    @FXML
    private Button generateAccReports_Btn;

    @FXML
     private void accountingOptionsButtons(ActionEvent event) throws IOException {
         AnchorPane root = null;
         
          if (event.getSource() == viewAddPayments_Btn) {
              root = FXMLLoader.load(getClass().getResource("/ccfs_gui/Accounting/ViewAddPayments.fxml"));
         } else if (event.getSource() == generateAccReports_Btn) {
              root = FXMLLoader.load(getClass().getResource("/ccfs_gui/Accounting/AccountingReports.fxml"));
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

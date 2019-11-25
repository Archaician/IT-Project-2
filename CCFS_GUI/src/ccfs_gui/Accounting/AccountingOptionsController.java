/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ccfs_gui.Accounting;

import ccfs_gui.Admin.AdminOptionsController;
import ccfs_gui.LayoutProperties;
import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonBar;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;

/**
 * FXML Controller class
 *
 * @author Imran
 */
public class AccountingOptionsController implements Initializable {
    
    @FXML
    private Label schyr;
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
    
    private void setSchoolYear() throws Exception {
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ccfs?"
                + "user=root&password=");        
        ResultSet rs = con.createStatement().executeQuery("SELECT CONCAT(yearstart, '-', yearend) FROM `schoolyear` WHERE Status='active'");
        while (rs.next()) {
            schyr.setText(rs.getString("CONCAT(yearstart, '-', yearend)"));
        }
    }

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
        try {
            setSchoolYear();
        } catch (Exception ex) {
            Logger.getLogger(AdminOptionsController.class.getName()).log(Level.SEVERE, null, ex);
        }
        // TODO
    }

}

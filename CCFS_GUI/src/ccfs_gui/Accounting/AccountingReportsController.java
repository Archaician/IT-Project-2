/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ccfs_gui.Accounting;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;

/**
 * FXML Controller class
 *
 * @author Paul ; Imran
 */
public class AccountingReportsController implements Initializable {

    @FXML
    private BorderPane innerpane;
    @FXML
    private AnchorPane container;
    @FXML
    private Label schYr;
    @FXML
    private Button monthlyreport_Btn;
    @FXML
    private Button yearlyreport_Btn;
    @FXML
    private Button genpaid_Btn;
    @FXML
    private Button genunpaid_Btn;

    @FXML
    private void showReports(ActionEvent event) {
        if (event.getSource() == monthlyreport_Btn) {
            //TODO
        } else if (event.getSource() == yearlyreport_Btn) {
            //TODO
        }
    }

    @FXML
    private void generateFile(ActionEvent event) {
        if (event.getSource() == genpaid_Btn) {
            //TODO
        } else if (event.getSource() == genunpaid_Btn) {
            //TODO
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

}

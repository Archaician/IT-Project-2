/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ccfs_gui.Accounting;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

/**
 * FXML Controller class
 *
 * @author Admin
 */
public class YearlyReportController implements Initializable {
    
    //buton
    @FXML
    private Button generate_Btn;
    //Rows
    @FXML
    private Label totalStudent_Row;
    @FXML
    private Label tuitionFee_Row;
    @FXML
    private Label bookFees_Row;
    @FXML
    private Label miscFees_Row;
    @FXML
    private Label schoolServiceFees_Row;
    @FXML
    private Label totalFees_Row;
    @FXML
    private Label totalCollectedFees_Row;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}

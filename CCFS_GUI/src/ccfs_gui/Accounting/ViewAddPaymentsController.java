/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ccfs_gui.Accounting;

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
import javafx.scene.layout.BorderPane;
import javafx.stage.Modality;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Paul ; Imran
 */
public class ViewAddPaymentsController implements Initializable {

    @FXML
    private BorderPane innerpane;
    @FXML
    private AnchorPane container;
    @FXML
    private Button schoolservice_Btn;
 
    @FXML
    private TextField searchIdNum;

    @FXML
    private Label studName;

    @FXML
    private TableView<?> payments_table;

    @FXML
    private TableColumn<?, ?> feeID_Col;

    @FXML
    private TableColumn<?, ?> discoutnType_Col;

    @FXML
    private TableColumn<?, ?> discountPercentage_Btn;

    @FXML
    private TableColumn<?, ?> amount_Col;

    @FXML
    private TableColumn<?, ?> feeDate_Col;

    @FXML
    private TableColumn<?, ?> dueDate_Col;

    @FXML
    private TableColumn<?, ?> surcharge_Col;

    @FXML
    private TableColumn<?, ?> status_Col;

    @FXML
    private Button logout_Btn;

    @FXML
    private Button back_Btn;


    @FXML
    private void addSchoolServiceFee(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("SchoolService.fxml"));
        Parent root1 = (Parent) fxmlLoader.load();
        Stage stage = new Stage();
        stage.setScene(new Scene(root1));
        stage.setResizable(false);
        stage.initModality(Modality.APPLICATION_MODAL);
        stage.showAndWait();
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

}

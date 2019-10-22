/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ccfs_gui;

import java.util.function.UnaryOperator;
import javafx.scene.control.TextField;
import javafx.scene.control.TextFormatter;
import javafx.scene.control.TextFormatter.Change;
import javafx.util.converter.IntegerStringConverter;

/**
 *
 * @author @Imran
 * @version 1.0
 */
public class FieldValidation {
    
    private static TextField t;
    public static TextField requiredTextField(TextField ... textfield) {
        for (TextField t : textfield)
            if (t.getText().isEmpty()) {
                t.setStyle("-fx-border-color: red");
                t.setPromptText("REQUIRED!");
                //return tf;
            }
       // return t;
        return t;
    }
    
    private void textfieldKeyTyped(java.awt.event.KeyEvent event) {
        TextField tf = new TextField();
        tf.setStyle("-fx-border-color: none");
    }
    
    public static void numericTextField(TextField ... textfield) {
        UnaryOperator<Change> integerFilter = change -> {
            String newText = change.getControlNewText();
            if (newText.matches("-?([1-9][0-9]*)?")) { 
                return change;
                }
            return null;
        };
        
        for (TextField tf : textfield)
            tf.setTextFormatter(
                    new TextFormatter<Integer>(new IntegerStringConverter(), 0, integerFilter));
        /*if (!tf.getText().matches("[0-9]")) {
            tf.clear();
            tf.setStyle("-fx-border-color: red");
            tf.setPromptText("PLEASE ENTER NUMBERS ONLY!"); 
        } */
    }
    /*
    public static void capsLock(TextField ... textfield) {
        for (TextField tf : textfield)
            tf.setTextFormatter(new TextFormatter<>((change) -> {
                change.setText(change.getText().charAt(0).toUpperCase());
                return change;
                }));
    } */
}

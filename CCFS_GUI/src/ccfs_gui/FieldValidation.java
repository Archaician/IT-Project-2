/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ccfs_gui;

import java.util.function.UnaryOperator;
import javafx.scene.control.DatePicker;
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

    /*Required textfields validation.*/
    public static void requiredTextFieldWarning(TextField... textfield) {
        for (TextField tf : textfield) {
            if (tf.getText().isEmpty()) {
                tf.setStyle("-fx-border-color: red");
                tf.setPromptText("REQUIRED!");
                tf.setOnKeyTyped(e -> {
                    tf.setStyle("-fx-border-color: none");
                });
            }
        }
    }

    /*Required dates validation.*/
    public static void requiredDateWarning(DatePicker... datepicker) {
        for (DatePicker dt : datepicker) {
            if (dt.getValue() == null) {
                dt.setStyle("-fx-border-color: red");
                dt.setPromptText("REQUIRED!");
                dt.setOnMouseClicked(e -> {
                    if (dt.getValue() != null) {
                        dt.setStyle("-fx-border-color: none");
                    }
                });
            }
        }
    }

    /*Numeric textfields validation.*/
    public static void numericTextField(TextField... textfield) {
        UnaryOperator<Change> integerFilter = change -> {
            String newText = change.getControlNewText();
            if (newText.matches("-?([1-9][0-9]*)?")) {
                return change;
            }
            return null;
        };

        for (TextField tf : textfield) {
            tf.setTextFormatter(
                    new TextFormatter<Integer>(new IntegerStringConverter(), 0, integerFilter));
        }
        /*if (!tf.getText().matches("[0-9]")) {
            tf.clear();
            tf.setStyle("-fx-border-color: red");
            tf.setPromptText("PLEASE ENTER NUMBERS ONLY!"); 
        } */
    }

    /*Force textfield input to be capitalized.*/
    public static void capsLock(TextField... textfield) {
        for (TextField tf : textfield) {
            tf.setTextFormatter(new TextFormatter<>((change) -> {
                change.setText(change.getText().toUpperCase());
                return change;
            }));
        }
    }
}

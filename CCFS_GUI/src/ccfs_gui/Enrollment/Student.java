/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ccfs_gui.Enrollment;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

/**
 * Object class for students list.
 * 
 * @author @Imran
 * @version 1.0
 */
public class Student {
    
    private final IntegerProperty studentID = new SimpleIntegerProperty();
    private final StringProperty surname = new SimpleStringProperty();
    private final StringProperty givenName = new SimpleStringProperty();
    
    public int getStudentID() {
        return studentID.get();
    }
    
    public void setStudentID(int value) {
        studentID.set(value);
    }
    
    public IntegerProperty studentIDProperty() {
        return studentID;
    }
    
    public String getSurname() {
        return surname.get();
    }
    
    public void setSurname(String value) {
        surname.set(value);
    }
    
    public StringProperty surnameProperty() {
        return surname;
    }
    
    public String getGivenName() {
        return givenName.get();
    }
    
    public void setGivenName(String value) {
        givenName.set(value);
    }
    
    public StringProperty givenNameProperty() {
        return givenName;
    }
    
}

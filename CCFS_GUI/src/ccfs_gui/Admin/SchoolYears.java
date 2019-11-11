/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ccfs_gui.Admin;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

/**
 * Object class for school years.
 * 
 * @author Imran
 */
public class SchoolYears {
    
    private final IntegerProperty yearStart = new SimpleIntegerProperty();
    private final IntegerProperty yearEnd = new SimpleIntegerProperty();
    private final StringProperty schoolYear = new SimpleStringProperty();
    
    public int getYearStart() {
        return yearStart.get();
    }
    
    public void setYearStart(int value) {
        yearStart.set(value);
    }
    
    public IntegerProperty yearStartProperty() {
        return yearStart;
    }
    
    public int getYearEnd() {
        return yearEnd.get();
    }
    
    public void setYearEnd(int value) {
        yearEnd.set(value);
    }
    
    public IntegerProperty yearEndProperty() {
        return yearEnd;
    }
    
    
}

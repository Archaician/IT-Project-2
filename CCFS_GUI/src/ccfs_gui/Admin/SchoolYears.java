/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ccfs_gui.Admin;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

/**
 * Object class for school years list.
 * 
 * @author Imran
 */
public class SchoolYears {
    
    private final StringProperty schoolYear = new SimpleStringProperty();
    private final StringProperty status = new SimpleStringProperty();
    
    public String getSchoolYear() {
        return schoolYear.get();
    }
    
    public void setSchoolYear(String value) {
        schoolYear.set(value);
    }
    
    public StringProperty schoolYearProperty() {
        return schoolYear;
    }
    
    public String getStatus() {
        return status.get();
    }
    
    public void setStatus(String value) {
        status.set(value);
    }
    
    public StringProperty statusProperty() {
        return status;
    }
    
    
}

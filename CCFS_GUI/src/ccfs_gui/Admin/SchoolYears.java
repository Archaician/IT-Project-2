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
    private final StringProperty gradelevel = new SimpleStringProperty();;
    private final StringProperty section = new SimpleStringProperty();
    private final StringProperty adviser = new SimpleStringProperty();
    
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
    
    public String getGradelevel() {
        return gradelevel.get();
    }
    
    public void setGradelevel(String value) {
        gradelevel.set(value);
    }
    
    public StringProperty gradelevelProperty() {
        return gradelevel;
    }
    
    public String getSection() {
        return section.get();
    }
    
    public void setSection(String value) {
        section.set(value);
    }
    
    public StringProperty sectionProperty() {
        return section;
    }
    
    public String getAdviser() {
        return adviser.get();
    }
    
    public void setAdviser(String value) {
        adviser.set(value);
    }
    
    public StringProperty adviserProperty() {
        return adviser;
    }
    
}

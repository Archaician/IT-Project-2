/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ccfs_gui.Registrar;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

/**
 *
 * @author Paul
 */
public class Students {

    private final IntegerProperty idNumber = new SimpleIntegerProperty();
    private final StringProperty studentName = new SimpleStringProperty();
    private final StringProperty gradeLevel = new SimpleStringProperty();
    private final StringProperty section = new SimpleStringProperty();
    private final StringProperty teacher = new SimpleStringProperty();

    public int getidNumber() {
        return idNumber.get();
    }

    public void setidNumber(int value) {
        idNumber.set(value);
    }
    
    public IntegerProperty idNumberProperty() {
        return idNumber;
    }

    public String getStudentName() {
        return studentName.get();
    }

    public void setStudentName(String value) {
        studentName.set(value);
    }
    
    public StringProperty studentNameProperty() {
    return studentName;
    }

    public String getGradeLevel() {
        return gradeLevel.get();
    }

    public void setGradeLevel(String value) {
        gradeLevel.set(value);
    }
    
    public StringProperty gradeLevelProperty() {
        return gradeLevel;
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

    public String getTeacher() {
        return teacher.get();
    }

    public void setTeacher(String value) {
        teacher.set(value);
    }
    
    public StringProperty teacherProperty() {
        return teacher;
    }
    
}

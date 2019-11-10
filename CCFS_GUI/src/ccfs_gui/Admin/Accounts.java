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
 * Object class for accounts list.
 * 
 * @author @Imran
 * @version 1.0
 */
public class Accounts {
    
    private final IntegerProperty accountID = new SimpleIntegerProperty();
    private final StringProperty name = new SimpleStringProperty();
    private final StringProperty username = new SimpleStringProperty();
    private final StringProperty type = new SimpleStringProperty();
    private final StringProperty status = new SimpleStringProperty();
    
    public int getAccountID() {
        return accountID.get();
    }
    
    public void setAccountID(int value) {
        accountID.set(value);
    }
    
    public IntegerProperty accountIDProperty() {
        return accountID;
    }
    
    public String getName() {
        return name.get();
    }
    
    public void setName(String value) {
        name.set(value);
    }
    
    public StringProperty nameProperty() {
        return name;
    }
    
    public String getUsername() {
        return username.get();
    }
    
    public void setUsername(String value) {
        username.set(value);
    }
    
    public StringProperty usernameProperty() {
        return username;
    }
    
    public String getAccountType() {
        return type.get();
    }
    
    public void setAccountType(String value) {
        type.set(value);
    }
    
    public StringProperty typeProperty() {
        return type;
    }
    
    public String getAccountStatus() {
        return status.get();
    }
    
    public void setAccountStatus(String value) {
        status.set(value);
    }
    
    public StringProperty statusProperty() {
        return status;
    }    

}

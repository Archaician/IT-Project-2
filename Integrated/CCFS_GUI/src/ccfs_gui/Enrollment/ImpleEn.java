/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ccfs_gui.Enrollment;
import java.util.LinkedList;
import javaRMI.ClientCon.*;
/**
 *
 * @author Acer
 */
public class ImpleEn{
    public static LinkedList<String> studInform = new LinkedList<String>();
    
    public static void addInfo(String[] info) {
        for(int i=0;i<info.length;i++){
            studInform.add(info[i]);
        }
    }
    public void add(){
        
    }
}

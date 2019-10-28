/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package schoolyear;

/**
 *
 * @author Lenovo
 */
public class App {
    
        public static void main(String[] args) throws Exception {
            SchoolYearMethod.connection();
            check();
        }
    
        public static void check() throws Exception{
            String[] arr = {"2024","2025","3","3","3","3"};
            SchoolYear y = new SchoolYear(arr);        
            SchoolYearMethod.addSchoolYear(y);
        }
}
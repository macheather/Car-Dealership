/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cardealership;

/**
 *
 * @author Heather
 */
public class Trunk {
    private boolean hasSpareTire;
    private boolean hasFirstAidKit;
    private boolean hasCarpet;
    private boolean hasJack; 
    private String carpetColor;
    
public Trunk() {
    
}
public Trunk (boolean hasSpareTire, boolean hasFirstAidKit, boolean hasJack, String carpetColor) {
    this.hasSpareTire = hasSpareTire;
    this.hasFirstAidKit = hasFirstAidKit;
    this.hasJack = hasJack;
    this.carpetColor = carpetColor;
    
}
public String toString() {
    String s = "Spare Tire: " + hasSpareTire + "\n First Aid Kit: " + hasFirstAidKit + "\n Jack: " + hasJack + "\n Carpet Color: " + carpetColor;
    return s;
    
}
}

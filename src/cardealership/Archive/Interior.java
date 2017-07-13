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
public class Interior {
    private String color1;
    private String color2;
    private boolean hasSunRoof;
    private boolean hasMoonRoof;
    
public Interior() {
}
public Interior(String color1, String color2, boolean hasSunRoof, boolean hasMoonRoof) {
    this.color1 = color1;
    this.color2 = color2;
    this.hasSunRoof = hasSunRoof;
    this.hasMoonRoof = hasMoonRoof;
}
public String test (boolean b) {
    if (b == true)
        return "Yes";
    else
        return "No";
}
public String toString() {
    String s = "Color 1: " + color1 + "\n Color 2: " + color2 + "\n SunRoof: " + test(hasSunRoof) + "\n Moon Roof: " + test(hasMoonRoof);
    return s;
    
}
}


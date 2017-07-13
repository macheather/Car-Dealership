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
public class Option {
    private String name;
    private String description;
    
public Option() { 
    name = "";
    description = "";
}
public Option (String name, String description) {
    this.name = name;
    this.description = description;
}
public String toString() {
    String s = "Name: " + name + "\n Description: " + description;
    return s;
}
public boolean empty () {
    if (name == "")
        return true;
    else
        return false;
}
public void setName (String n) {name = n;}
public String getName () {return name;}
public String getDesc() {return description;}
public void setDesc (String d) {description = d;}
}



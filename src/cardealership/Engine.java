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

public class Engine {
    public enum FuelType {Gas, Electric, Hybrid, Diesel}
    private FuelType fuelType;
    private int noOfCylinders;
    private int capacity;
    private int horsePower;
    private float mpg;
    
public Engine() {
    
}
public Engine (FuelType fuelType, int noOfCylinders, int capacity, int horsePower, float mpg) {
    this.fuelType = fuelType;
    this.noOfCylinders = noOfCylinders;
    this.capacity = capacity;
    this.horsePower = horsePower;
    this.mpg = mpg;
}
public String toString() {
    String s = " Fuel Type:" + 
            fuelType + "\nNumber of Cylinders: " + noOfCylinders + 
            "\nCapacity: " + capacity + "\nHorsepower: " + horsePower 
            + "\nMPG: " + mpg;
    return s;
}
public int getHorsePower() {
    return horsePower;
}
public float getMPG() {
    return mpg;
}
public FuelType getFuelType() {
    return fuelType;
}
public int getCapacity() {
    return capacity;
}
public int getNoOfCylinders() {
    return noOfCylinders;
}
    
}

    


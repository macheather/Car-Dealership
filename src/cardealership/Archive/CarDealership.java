/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cardealership;
import java.util.Scanner; 
import java.io.File;


/**
 *
 * @author Heather
 */
public class CarDealership {
    public CarDealership () {numCars = 0;}
    private int numCars;
    private Car [] myCars = new Car [10];
    private Car selectedCar;
    
    /**
     * @param args the command line arguments
     */
        
    public void addCar (Car c) {
        myCars[numCars] = c;
        myCars[numCars].setNumOptions(c.getNumberOptions());
        numCars++;
    }
    public Car getSCar() {return selectedCar;}
    public Car getCar (int n) {
        return myCars[n];
    }
    public void listAllCars() {
        for (int i = 0; i < numCars; i++) {
            System.out.print ((i + 1) + " - ");
            System.out.println(myCars[i].toString());
        }
    }
    public void selectCar(int i) {
        selectedCar = myCars[i];
    }
    public String openTrunk() {
        String s = "Trunk description: " + selectedCar.OpenTrunk();
        return s;
        
    }
    public String checkEngine() {
        String s = "Engine Description: " + selectedCar.CheckEngine();
        return s;
    }
    public String checkInterior() {
        String s = "Interior Description: " + selectedCar.CheckInterior();
        return s;
    }
    
    public String compare (int firstCar,int secondCar)
    {
       String s = "";
        String car1 = myCars[firstCar].getYear() + " " + myCars[firstCar].getMake() +" " + myCars[firstCar].getModel();
        String car2 = myCars[secondCar].getYear() + " " + myCars[secondCar].getMake() + " " + myCars[secondCar].getModel();
        if (myCars[firstCar].getYear() > myCars[secondCar].getYear())
            s +=(car1 + " is newer than " + car2 + "\n");
        else
            s+=(car2 + " is newer than " + car1 + "\n");
        if (myCars[firstCar].getEngine().getMPG() < myCars[secondCar].getEngine().getMPG())
            s +=(car2 + " has a better MPG than " + car1 + "\n");
        else
            s +=(car1 + " has a better MPG than " + car2 + "\n");
        if (myCars[firstCar].getPrice() < myCars[secondCar].getPrice())
            s +=(car1 + " is less expensive " + "\n");
        else 
            s +=(car2 + " is less expensive " + "\n");
        if (myCars[firstCar].getEngine().getHorsePower() < myCars[secondCar].getEngine().getHorsePower())
            s +=(car1 + " is more powerful " + "\n");
        else 
            s +=(car2 + " is more powerful " + "\n");
        if (myCars[firstCar].getNumberOptions() < myCars[secondCar].getNumberOptions())
            s +=(car1 + " has " + myCars[firstCar].getNumberOptions() + "options" + "\n");
        else if (myCars[firstCar].getNumberOptions() > myCars[secondCar].getNumberOptions()) 
            s += (car2 + " has " + myCars[secondCar].getNumberOptions() + "options" + "\n");
        else
            s += ("Cars have the same number of options.\n");
        if (myCars[firstCar].getEngine().getNoOfCylinders() > myCars[secondCar].getEngine().getNoOfCylinders())
            s += (car1 + " has more cylinders");
        else if (myCars[firstCar].getEngine().getNoOfCylinders() < myCars[secondCar].getEngine().getNoOfCylinders())
            s += (car2 + " has more cylinders");
         
        return s;
    }

}

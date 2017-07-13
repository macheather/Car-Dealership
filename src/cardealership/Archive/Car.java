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
public class Car {
    public enum CarType {Sedan, SUV, CrossOver, Truck}
    private String make;
    private int year;
    private String model;
    private int price;
    private String color;
    private CarType type;
    private Engine engine;
    private Interior interior;
    private Trunk trunk;
    private Option[] options;
    private int numberOptions;
    private int numOptions;
    public Car() {
        numOptions = 0;
        options = new Option [10];
        engine = new Engine();
        interior = new Interior();
        trunk = new Trunk();
    }
    public Car (String make, int year, String model, int price, String color, CarType type, Engine engine,Interior interior, Trunk trunk) {
        numOptions = 0;
        this.make = make;
        this.year = year;
        this.model = model;
        this.price = price;
        this.color = color; 
        this.type = type;
        this.engine = engine;
        this.interior = interior;
        this.trunk = trunk;
        options = new Option[5];
        for (int i = 0; i < 5;i++)
            options[i] = new Option();
    }
    public void setEngine(Engine engine) {
        this.engine = engine;
    }
    public Engine getEngine() {return engine;}
    public void setInterior(Interior interior) {
        this.interior = interior;
    }
    public void setTrunk(Trunk trunk) {
        this.trunk = trunk;
    }
  
    public void addOption(Option option) {
        options[numOptions].setDesc(option.getDesc());
        options[numOptions].setName(option.getName());
        numOptions++;
    }
    public void setNumOptions (int n) {numOptions = n;}
    public String getMake (){return make;}
    public String getModel () {return model;}
    public int getYear () {return year;}
    public int getPrice () {return price;}
    public int getNumberOptions () {return numberOptions;}
    public void printOptions() {
        for (int i = 0; i < numberOptions;i++) {
            System.out.println("Option " + (i+1) + options[i].toString());
        }
    }



    public String OpenTrunk() {
        return trunk.toString();
    }
    public String CheckEngine() {
        return engine.toString();
    }
    public String CheckInterior() {
        return interior.toString();
    }
    public String ShowOptions() {
        String output = "";
        int i = 0;
        while (options [i].empty()) {
            output.concat(options[i].toString());
        }
        return output;
        }
    public String toString() {
        
        String s = color + " " + year + " " + make + " " + model + " for $" + price; 
        return s;
      
    }
    /*
    public String CompareTo(Car otherCar) {
        String s = "";
        String car1 = this.year + this.make + this.model;
        String car2 = otherCar.getYear() + otherCar.getMake() + otherCar.getModel();
        if (this.getYear() < otherCar.getYear())
            s.concat(car1 + " is newer than " + car2 + "\n");
        else
            s.concat(car2 + " is newer than " + car1 + "\n");
        if (this.engine.getMPG() < otherCar.engine.getMPG())
            s.concat(car2 + " has a better MPG than " + car1 + "\n");
        else
            s.concat(car1 + " has a better MPG than " + car2 + "\n");
        if (this.getPrice() < otherCar.getPrice())
            s.concat(car1 + " is less expensive " + "\n");
        else 
            s.concat(car2 + " is less expensive " + "\n");
        if (this.engine.getHorsePower() < otherCar.engine.getHorsePower())
            s.concat(car1 + " is more powerful " + "\n");
        else 
            s.concat(car2 + " is more powerful " + "\n");
        if (this.getNumberOptions() < otherCar.getNumberOptions())
            s.concat(car1 + " has " + numberOptions + "options" + "\n");
        else if (this.getNumberOptions() > otherCar.getNumberOptions()) 
            s.concat(car2 + " has " + numberOptions + "options" + "\n");
        if (this.engine.getNoOfCylinders() < otherCar.engine.getNoOfCylinders())
            s.concat(car1 + " has more cylinders \n");
        else
            s.concat(car2 + " has more cylinders \n");
        return s;
            }
*/
}

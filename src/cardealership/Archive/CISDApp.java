/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cardealership;

import static cardealership.Car.CarType.SUV;
import static cardealership.Car.CarType.Sedan;
import static cardealership.Engine.FuelType.Gas;
import static cardealership.Engine.FuelType.Hybrid;
import java.util.Scanner;

/**
 *
 * @author Heather
 */
public class CISDApp {
    public enum FuelType {Gas, Electric, Hybrid, Diesel};
    public enum CarType {Sedan, SUV, CrossOver, Truck}
    public static void printMenu() {
        System.out.print("Commands: Shows a list of all the available commands \n");
        System.out.print("List: Lists the inventory of cars \n");
        System.out.print("Compare [n1] [n2]: Compares two cars \n");
        System.out.print("Select [n]: Selects car No. n and shows the details \n");
        System.out.print("Engine: Shows the details of the engine of the selected car \n");
        System.out.print("Interior: Show the details of the interior of the selected car \n");
        System.out.print("Trunk: Show the items in the trunk of the selected car \n");
        System.out.print("Options: Show the details of options installed on the selected car \n");
        System.out.print("Quit: Terminate the program \n");
        
    }
    public static void main(String [] args) {
    Scanner sc = new Scanner(System.in);
    String choice = "";
    boolean select = false;
    int car1, car2;
    CarDealership myDealership = new CarDealership ();
    Engine testE = new Engine (Gas, 4, 4, 5800, (float) 25.5);
    Trunk testT = new Trunk (true, false, false, "black");
    Interior testI = new Interior ("black", "white", true, false);
    Car testC = new Car ("Hyundai", 2006, "Sonata", 2500, "White", Sedan, testE, testI, testT);
    myDealership.addCar(testC);
    
    
    testE = new Engine ( Gas, 6, 5, 3700, (float) 28.5);
    testT = new Trunk (true, true, true, "black");
    testI = new Interior ("black", "white", true, true);
    testC = new Car ("Infiniti", 2016, "QX50", 38000, "Black", SUV, testE, testI, testT);
    Option testO = new Option ("Sport Package", "Add Sports Package");
    testC.addOption(testO);
    testO = new Option ("Sport Interior", "Add Sport Interior");
    testC.addOption(testO);
    myDealership.addCar(testC);
    
    
    testE = new Engine ( Gas, 4, 5, 2000, (float) 20.5);
    testT = new Trunk (false, false, true, "grey");
    testI = new Interior ("black", "grey", false, false);
    testC = new Car ("Toyota", 2010, "Corolla", 7845, "Red", Sedan, testE, testI, testT);
    myDealership.addCar(testC);
    
    testE = new Engine ( Gas, 4, 5, 2500, (float) 19.5);
    testT = new Trunk (false, false, false, "grey");
    testI = new Interior ("black", "white", false, false);
    testC = new Car ("Honda", 2000, "Accord", 3000, "Black", Sedan, testE, testI, testT);
    myDealership.addCar(testC);
    
    testE = new Engine ( Gas, 4, 2, 4000, (float) 20.5);
    testT = new Trunk (true, true, true, "tan");
    testI = new Interior ("black", "white", true, true);
    testC = new Car ("Ford", 2016, "Mustang", 29000, "White", Sedan, testE, testI, testT);
    Option test1 = new Option ("Technical Package", "Upgrade Technology");
    testC.addOption(test1);
    test1 = new Option ("Bluetooth", "Add Bluetooth");
    testC.addOption(test1);
    testC.printOptions();
    myDealership.addCar(testC);
   
    testE = new Engine ( Gas, 4, 5, 3500, (float) 29.5);
    testT = new Trunk (true, true, true, "black");
    testI = new Interior ("black", "white", true, true);
    testC = new Car ("Lexus", 2015, "RX350", 30000, "Grey", SUV, testE, testI, testT);
    Option test2 = new Option ("Sport Package", "Add Sports Package");
    testC.addOption(test2);
    test2 = new Option ("GPS", "Add GPS");
    testC.addOption(test2);
    myDealership.addCar(testC);
    
    testE = new Engine ( Hybrid, 4, 5, 2800, (float) 40.5);
    testT = new Trunk (true, true, true, "grey");
    testI = new Interior ("black", "grey", true, true);
    testC = new Car ("Toyota", 2013, "Prius", 23560, "Silver", Sedan, testE, testI, testT);
    myDealership.addCar(testC);
    
    testE = new Engine ( Gas, 6, 5, 5500, (float) 33.5);
    testT = new Trunk (true, true, true, "white");
    testI = new Interior ("black", "grey", true, true);
    testC = new Car ("BMW", 2016, "X5", 50000, "Black", SUV, testE, testI, testT);
    Option test3 = new Option ("Luxury Package", "Luxurious Comfort");
    testC.addOption(test3);
    test3 = new Option ("TV", "Add TV");
    testC.addOption(test3);
    myDealership.addCar(testC);
    
    testE = new Engine ( Gas, 4, 7, 4000, (float) 27.5);
    testT = new Trunk (true, true, true, "black");
    testI = new Interior ("black", "white", true, false);
    testC = new Car ("Honda", 2012, "Odyssey", 25000, "White", SUV, testE, testI, testT);
    myDealership.addCar(testC);
    
    testE = new Engine ( Gas, 4, 5, 1600, (float) 32.5);
    testT = new Trunk (true, false, false, "tan");
    testI = new Interior ("black", "white", true, false);
    testC = new Car ("Mazda", 2009, "3", 16000, "Grey", Sedan, testE, testI, testT);
    myDealership.addCar(testC);
    
    System.out.println("Welcome to CIS department's Car Dealership!");
    System.out.println("To View a List of Commands , enter Commands");
    System.out.print("<");
    choice = sc.next();
    while (!choice.equals("Quit"))
    {
            if (choice.equals("Commands"))
                printMenu();
            else if (choice.equals("List"))
                 myDealership.listAllCars();
            else if (choice.equals("Compare")) {
                 car1 = sc.nextInt();
                 car2 = sc.nextInt();
                 System.out.println(myDealership.compare(car1-1, car2-1));
                 }
            else if (choice.equals("Select")) {
                car1 = sc.nextInt();
                myDealership.selectCar(car1 - 1);
                System.out.println("Car " + car1 + " selected.");
                select = true;
            }
                
            else if (choice.equals("Engine")) {
                if (select) 
                  System.out.println(myDealership.checkEngine());
                else
                    System.out.println("You must select a car first.");
            }
            else if (choice.equals("Interior"))
                if (select)
                    System.out.println(myDealership.checkInterior());
                else
                    System.out.println("You must select a car first.");
            else if (choice.equals("Trunk"))
                if (select)
                    System.out.println(myDealership.openTrunk());
                else 
                    System.out.println("You must select a car first.");
            else if (choice.equals("Options")) {
                if (select)
                    myDealership.getSCar().printOptions();
                else
                    System.out.println ("You must select a car first.");
            }
    
         
    
            System.out.print("<");
            choice = sc.next();
        }
    System.out.println("Exit.");
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.anatomyclass;

/**
 *
 * @author CGouslin2026
 */

import java.text.*;
import java.util.*;

public class AnatomyClass {
    
    

    public static void main(String[] args) {
        /* Question 1: A class defines state and behavior for objects of that class. An object is a specific instance of that class.
        Question 2: It sends it to the command line using the _prt_ method
        Question 3: It is the the area within a program in which the variable can be called. Same with the class.
        Question 4/Program:                                                                                                         */
        
        //VW Bug
        Car bug = new Car();
        bug.setBrand("Volkswagen");
        bug.setEnginePower(57);
        bug.setMaxSpeed(82);
        bug.setPrice(15000);
        bug.setYear(1970);
        System.out.println(bug);
        //Toyota Prius
        Car prius = new Car();
        prius.setBrand("Toyota");
        prius.setEnginePower(194);
        prius.setMaxSpeed(112);
        prius.setPrice(27950);
        prius.setYear(2024);
        System.out.println(prius);
        //BMW i8
        Car bmwi8 = new Car();
        bmwi8.setBrand("BMW");
        bmwi8.setEnginePower(369);
        bmwi8.setMaxSpeed(155);
        bmwi8.setPrice(143400);
        bmwi8.setYear(2020);
        System.out.println(bmwi8);
        //Tesla Model 3
        Car teslaModel3 = new Car();
        teslaModel3.setBrand("Tesla");
        teslaModel3.setEnginePower(510);
        teslaModel3.setMaxSpeed(163);
        teslaModel3.setPrice(40630);
        teslaModel3.setYear(2024);
        System.out.println(teslaModel3);
    }
}
class Car {
    private String carBrand;
    private int enginePower;
    private double maxSpeed;
    private double price;
    private int year;
    
    public void setBrand (String inBrand){
        carBrand = inBrand;
    }
    
    public void setEnginePower (int inEnginePower){
        enginePower = inEnginePower;
    }
    
    public void setMaxSpeed (double inMaxSpeed){
        maxSpeed = inMaxSpeed;
    }
    
    public void setPrice (double inPrice){
        price = inPrice;
    }
    
    public void setYear (int inYear){
        year = inYear;
    }
    
    public String toString(){
        String result = "";
        result = "\n\nCar Brand: " + carBrand /**/ + "\nYear: " + year /**/ + "\nEngine Power: " + enginePower + " hp" /**/ + "\nMax Speed: " + maxSpeed + "mph" /**/ + "\nPrice: $" + price;
        return result;
    }
    
}
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.classinheritance;

/**
 *
 * @author CGouslin2026
 */
public class ClassInheritance {

    public static void main(String[] args) {
        
        //create vehicles
        
        /* sample */ Vehicle boatOne = new Vehicle("Sample Boat", 30.0, 2000, 100000.00);
        Vehicle boatTwo = new Vehicle("Sea Ray SPX 190", 50.0, 11, 1750.00);
        /* sample */ Car carOne = new Car("BMW", 200.00, 2, 100.00, 30.0);
        Car carTwo = new Car("Mini Cooper", 130.00, 5, 850.00, 44.0);
        Plane planeOne = new Plane("Cessna Citation Mustang", 391.0, 5, 640, 5.0);
        Plane planeTwo = new Plane("Boeing 747", 570.0 , 524, 274100, 0.2);
        Vehicle hovercraft = new Vehicle("BHC Beast Hovercraft", 35.0, 3, 440);
        Vehicle tricycle = new Vehicle("Five-year-old Boy on a Tricycle", 5, 1, 10);
        
        
        // print all
        
        System.out.println(carOne); 
        System.out.println();
        System.out.println(carTwo);
        System.out.println();
        System.out.println(boatOne);
        System.out.println();
        System.out.println(boatTwo);
        System.out.println();
        System.out.println(hovercraft);
        System.out.println();
        System.out.println(tricycle);
    }
}

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

// The Base Vehicle Class, implements the Speedometer interface
class Vehicle implements Speedometer{
//base (Class wide) variables
protected String brandName = "";
protected double speed = 0.0;
protected int passengers = 0;
protected double cargoWeight = 0.0;
//Base default constructor
public Vehicle(){
brandName = "";
speed = 0.0;
passengers = 0;
cargoWeight = 0.0;
}
public Vehicle(String inBrand, double inSpeed, int inPassengers, double
inCargo){
brandName = inBrand;
speed = inSpeed;
passengers = inPassengers;
cargoWeight = inCargo;
}
//getters and setters
public Vehicle(String inBrand){
brandName = inBrand;
}
public String getBrand(){
return brandName;
}
public void setBrandName(String inBrand){
brandName = inBrand;
}
public double getSpeed(){
return speed;
}
public void setSpeed(double inSpeed){
speed = inSpeed;
}
public int getPassengers(){
return passengers;
}
public void setPassengers(int inPassengers){
speed = inPassengers;
}
public double getCargoWeight(){
return cargoWeight;
}
public void setCargoWeight(double inCargoWeight){
cargoWeight = inCargoWeight;
}
//Base toString
public String toString(){
String result = "";
result = "Brand: \t\t\t" + getBrand() + "\n" + 
"Speed (mph): \t" + getSpeed() + "\n" +
"Passengers: \t" + getPassengers() + "\n" +
"Cargo (lbs): \t" + getCargoWeight() + "\n";
return result;
    }
}
//the Speedometer interface to show the speed of any vehicle in the same way
interface Speedometer{
    public void setSpeed(double inSpeed);
    public double getSpeed();
}
        
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        
// Car Class inherits from Vehicle Class
class Car extends Vehicle{
    int wheels = 4;
    String color = "White";
    boolean spoiler = false;
    boolean stereo = false;
    double mpg = 0.0; //has an extra variable, mpg

    public Car(String inBrand, double inSpeed, int inPassengers, double inCargo, double inMPG){
        super(inBrand, inSpeed, inPassengers, inCargo); //uses the super constructor
        mpg = inMPG; //also include the extra variable in the Car constructor
    }
    //another additional variable
    public void setSpoiler(boolean inSpoiler){
        spoiler = inSpoiler;
    }

    public boolean getSpoiler(){
        return spoiler;
    }
    //another additional variable
    public void setStereo(boolean inStereo){
        stereo = inStereo;
    }

    public boolean getStereo(){
        return  stereo;
    }
    //overrides the super getSpeed method
    @Override
    public double getSpeed() {
        if (spoiler)
            return super.getSpeed() + 20;
        else
            return super.getSpeed();
    }

    public void setMpg(double mpg) {
        this.mpg = mpg;
    }

    public double getMPG(){
        if(stereo)
            return mpg - (mpg / 10);
        else
            return mpg;
    }
    //usesd the super toString, as well as adding the new variable to it.
    public String toString(){
        String result = super.toString() +
                "MPG :\t\t\t" + this.getMPG();
        return  result ;
    }
}

// class plane

// Car Class inherits from Vehicle Class
class Plane extends Vehicle{
    int landingGearWheels = 4;
    String color = "White";
    boolean stereo = false;
    double mpg = 0.0; //has an extra variable, mpg

    public Plane(String inBrand, double inSpeed, int inPassengers, double inCargo, double inMPG){
        super(inBrand, inSpeed, inPassengers, inCargo); //uses the super constructor
        mpg = inMPG; //also include the extra variable in the Car constructor
    }

    //another additional variable
    public void setStereo(boolean inStereo){
        stereo = inStereo;
    }

    public boolean getStereo(){
        return  stereo;
    }
    //overrides the super getSpeed method
    @Override
    public double getSpeed() {
        if (1!=1)
            return super.getSpeed() + 20;
        else
            return super.getSpeed();
    }

    public void setMpg(double mpg) {
        this.mpg = mpg;
    }

    public double getMPG(){
        if(stereo)
            return mpg - (mpg / 10);
        else
            return mpg;
    }
    //usesd the super toString, as well as adding the new variable to it.
    public String toString(){
        String result = super.toString() +
                "MPG :\t\t\t" + this.getMPG();
        return  result ;
    }
}

        
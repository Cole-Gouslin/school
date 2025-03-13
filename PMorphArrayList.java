/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pmorpharraylist;

/**
 *
 * @author CGouslin2026
 */

import java.util.ArrayList;
import java.util.Arrays;

public class PMorphArrayList {

    public static void main(String[] args) {
        
        // create objects 
        
        Aircraft Felicia = new Aircraft("Felicia","super cool epic big wings");
        SEAc Mohandas = new SEAc("Mohandas","wings that are a little bit less cool than Felicia's (very sad)", "amazingly powerful and light engine");
        Helicopter RobinBanks = new Helicopter("RobinBanks","no real wings cuz it's a helicobopter","the same engine as Mohandas despite being told to change the answer a little bit","five blades that a bit longer than you typically see on a helicopter");
    
        // add these to an array list
        
        ArrayList<Aircraft> aircraftList = new ArrayList<>(Arrays.asList(Felicia,Mohandas,RobinBanks));
        
        // print all
        
        for (Aircraft a : aircraftList){
            System.out.println(a + "\n");
        }
    }
}

////////////////////////////////////////////// Aircraft ///////////////////////////////////////////////////////////

class Aircraft {
    
    // initialize
    
    protected String wings = "";
    protected String name = "";
    
    // constructor
    
    public Aircraft(String inName, String inWings){
        name = inName;
        wings = inWings;
    }
    
    // accessor
    
    public String getName(){
        return name;
    }
    
    // toString
    
    @Override
    public String toString() {
        return this.getName() + ":\nWings - " + wings;
    }
        
}

////////////////////////////////////////////// Single Engine Aircraft ///////////////////////////////////////////////////////


class SEAc extends Aircraft {
    
    // initialize
    
    protected String rotaryEngine = ""; 
    
    // constructor
    
    public SEAc (String inName, String inWings, String inRE){
        super(inName, inWings);
        rotaryEngine = inRE;
    }
    
    // toString
    
    @Override
    public String toString() {
        return this.getName() + ":\nWings - " + wings + "\nEngine - " + rotaryEngine;
    }
}

/////////////////////////////////////////// Helicopter //////////////////////////////////////////////////////

class Helicopter extends SEAc {
    
    // intialize
    
    protected String blades = "";
    
    // constructor
    
    public Helicopter (String inName, String inWings, String inRE, String inBlades) {
        super(inName, inWings, inRE);
        blades = inBlades;
    }
    
    // toString
    
    @Override
    public String toString() {
        return this.getName() + ":\nWings - " + wings + "\nEngine - " + rotaryEngine + "\nBlades - " + blades;
    }
}
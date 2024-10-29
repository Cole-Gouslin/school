/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.constructors;

/**
 *
 * @author CGouslin2026
 */
public class Constructors {

    public static void main(String[] args) {
        // set ap comp sci
        Course AP_computerScienceA = new Course("AP Computer Science A","AP CS A",5,"JP Nelson");
        // set precalc 
        Course preCalculus = new Course("Pre-Calculus","P CALC",4,"Christine Laporte");
        //set us history
        Course US_history = new Course();
        US_history.setTitle("US History");
        US_history.setCode("US H");
        US_history.setPoints(4);
        US_history.setInstructor("Rob Reiter");
        //print courses
        System.out.println(AP_computerScienceA);
        System.out.println(preCalculus);
        System.out.println(US_history);       
    }
}

class Course { 
    //initialize variables
    private String title;
    private String code;
    private int points;
    private String instructor;
    
    // Constructors
    public Course(){
        title = "";
    }
    public Course(String inTitle, String inCode, int inPoints, String inInstructor){
        title = inTitle;
        code = inCode;
        points = inPoints;
        instructor = inInstructor;
    }
    
    // setters
    public void setTitle(String inTitle){
        title = inTitle;
    }
    
    public void setCode(String inCode){
        code = inCode;
    }
    
    public void setPoints(int inPoints){
        points = inPoints;
    }
    
    public void setInstructor(String inInstructor){
        instructor = inInstructor;
    }
    
    //accessors
    public String getTitle(){
        String result = "\n" + title;
        return result;
}
    
    public String getCode(){
        String result = "\n" + code;
        return result;
}
    
    public String getPoints(){
        String result =  "\n" + points;
        return result;
    }
    
    public String getInstructor(){
        String result = "\n" + instructor;
        return result;
}
    
    // toString
    @Override
    public String toString(){
        String result = "\nClass Title: " + title + "\nClass Code: " + code + "\nPoints: " + points + "\nInstructor: " + instructor;
        return result;
    }
}

    
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.interestrate;

import java.util.*;
import java.text.*;

/**
 *
 * @author CGouslin2026
 */
public class InterestRate {

    public static void main(String[] args) {
        //use calculator
        Scanner scan = new Scanner(System.in);
        IRCalc calc = new IRCalc();
        System.out.println("Please enter an initial amount:");
        calc.setInitialAmount(scan.nextDouble());
        System.out.println("Please enter an interest rate (decimal format):");
        calc.setInterestRate(scan.nextDouble());
        System.out.println("Please enter time period (in months):");
        calc.setMonths(scan.nextInt());
        System.out.println("Please enter monthly payment wanted");
        calc.setMonthWanted(scan.nextInt());
        System.out.println(calc);
    }
    
    
}

class IRCalc {
    //create format
    DecimalFormat currency = new DecimalFormat("#.##");
    //rest of class
    private double initialAmount;
    private double interestRate;
    private int months;
    private int monthWanted;

    public void setInitialAmount(double inInitialAmount) {
       initialAmount = inInitialAmount; 
    }
    
    public void setInterestRate(double inInterestRate) {
       interestRate = inInterestRate; 
    }
    
    public void setMonths(int inMonths) {
       months = inMonths; 
    }
    
    public void setMonthWanted(int inMonthWanted) {
        monthWanted = inMonthWanted;
    }
    
    @Override
    public String toString(){
        double result = ((initialAmount/months)*Math.pow((1+interestRate),monthWanted));
        String realResult = "Your monthly payment for month " + monthWanted + " is " + result;
        return realResult;
    }
}
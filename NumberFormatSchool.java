/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.numberformatschool;

import java.util.*;
import java.text.*;

/**
 *
 * @author CGouslin2026
 */
public class NumberFormatSchool {

    public static void main(String[] args) {
       //#1
        //creating scanner and getting student number
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter total students: ");
        int totalStudents = scan.nextInt();
        System.out.println("Enter total female students: ");
        int totalFemaleStudents = scan.nextInt();
        //creating percentage format
        NumberFormat pct = NumberFormat.getPercentInstance();
        int totalMaleStudents = totalStudents - totalFemaleStudents;
        double fractionF = (double) totalFemaleStudents/totalStudents;
        System.out.println("\nFraction of female students = " + fractionF);
        System.out.println("Percent of female students = " + pct.format(fractionF));
        System.out.println("\nFraction of male students = " + (1-fractionF));
        System.out.println("Percent of male students = " + pct.format((1-fractionF)));
        //#2
        //get usd amount
        System.out.println("\n\nEnter amount (USD): ");        
        double amountUSD = scan.nextDouble();
        //convert to GBP
        double amountGBP = amountUSD * .75;
        //print
        NumberFormat currencyUK = NumberFormat.getCurrencyInstance(Locale.UK);
        System.out.println("\nAmount in British Pounds (.75 Pounds/USD:" + currencyUK.format(amountGBP));
        
        //#3
        DecimalFormat fmt2 = new DecimalFormat("############.#");
        //get integer from 0-15
        System.out.println("\n\nPlease enter an integer from 0-15: ");
        int decimalPlaces = scan.nextInt();
        //create format
        if (decimalPlaces == 0){
             fmt2 = new DecimalFormat("#.");
        } else if (decimalPlaces == 1){
            fmt2 = new DecimalFormat("#.#");
        }else if (decimalPlaces == 2){
            fmt2 = new DecimalFormat("#.##");
        }else if (decimalPlaces == 3){
           fmt2 = new DecimalFormat("#.###");
        }else if (decimalPlaces == 4){
             fmt2 = new DecimalFormat("#.####");
        }else if (decimalPlaces == 5){
             fmt2 = new DecimalFormat("#.#####");
        }else if (decimalPlaces == 6){
            fmt2 = new DecimalFormat("#.######");
        }else if (decimalPlaces == 7){
             fmt2 = new DecimalFormat("#.#######");
        }else if (decimalPlaces == 8){
            fmt2 = new DecimalFormat("#.########");
        }else if (decimalPlaces == 9){
            fmt2 = new DecimalFormat("#.#########");
        }else if (decimalPlaces == 10){
            fmt2 = new DecimalFormat("#.##########");
        }else if (decimalPlaces == 11){
            fmt2 = new DecimalFormat("#.###########");
        }else if (decimalPlaces == 12){
             fmt2 = new DecimalFormat("#.############");
        }else if (decimalPlaces == 13){
             fmt2 = new DecimalFormat("#.#############");
        }else if (decimalPlaces == 14){
             fmt2 = new DecimalFormat("#.##############");
        }else if (decimalPlaces == 15){
            fmt2 = new DecimalFormat("#.###############");
        }
        System.out.println("\nPi to " + decimalPlaces + "decimal place(s) = " + fmt2.format(Math.PI));
        
        //#4
        Random rng = new Random();
        double bigNumber = rng.nextDouble(999e18 - 100000000)+100000000;
        System.out.printf("Random number: %.0f\n", bigNumber);
        
        
    }
}

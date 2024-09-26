/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.energything;

/**
 *
 * @author CGouslin2026
 */

import java.util.Random;
import java.util.Scanner;

public class EnergyThing {

    public static void main(String[] args) {
        //#1
        Random rng = new Random();
        int number = rng.nextInt(91);
        System.out.println("Number: " + number);
        double sin = Math.sin(number);
        System.out.println("Sine: " + roundAvoid(sin,3));
        double cos = Math.cos(number);
        System.out.println("Cosine: " + roundAvoid(cos,3));
        double tan = Math.tan(number);
        System.out.println("Tangent: " + roundAvoid(tan,3));
        //#2
        double number2 = rng.nextDouble(20)+1;
        number2 = number2 * 10;
        number2 = Math.round(number2);
        number2= number2/10;
        System.out.println("\nRadius: " + number2);
        double area = roundAvoid(((number2 * number2) * Math.PI),1);
        System.out.println("Area: " + area);
        double volume = roundAvoid((Math.pow(number2,3) * (4/3) * Math.PI),1);
        System.out.println("Volume: " + volume);
        //#3
        double number3 = rng.nextDouble(999990000)+1000;
        System.out.println("\nNumber: " + number3);
        double root = roundAvoid(Math.sqrt(number3),5);
        System.out.println("Square Root: " + root);
        double natLog = roundAvoid(Math.log(number3),5);
        System.out.println("Natural Log: " + natLog);
        double logBaseTen = roundAvoid(Math.log10(number3),5);
        System.out.println("Log Base Ten: " + logBaseTen);
        //#4
        double number4 = number3;
        System.out.println("\nEnergy: " + number4 + " Joules");
        double mass = (number4/(Math.pow(299800000,2)));
        System.out.println("Mass Requirement: " + mass + " Grams");
        //#5
        Scanner scan = new Scanner(System.in);
        System.out.println("\nInput A Real Number:");
        double realNumber = scan.nextDouble();
        System.out.println("Please Input An Integer:");
        double integerNumber = scan.nextInt();
        double output = roundAvoid((Math.pow(realNumber, integerNumber)),3);
        System.out.println(realNumber + " raised to the power of " + integerNumber + " = " + output);
        
    }
    
    public static double roundAvoid(double value, int places) {
        double scale = Math.pow(10, places);
        return Math.round(value * scale) / scale;
    }
}

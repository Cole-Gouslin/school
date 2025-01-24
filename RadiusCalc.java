/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.radiuscalc;

/**
 *
 * @author CGouslin2026
 */
import java.util.Scanner;

public class RadiusCalc {

    /**
     * @param args the command line arguments
     */
    //carry out calculations or circular items
    //such as a circle, a sphere, a cone, a column
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("This program calculates round item numbers such as \n" +
                "1 - Area of a circle (pi r^2)\n" +
                "2 - Volume of a sphere (4/3 pi r^3)\n" +
                "3 - Volume of a cone (pi r^2 h/3)\n" +
                "4 - Volume of a column (pi r^2 h)");
        System.out.println("Type the number for which one you want to calculate");
        int i = s.nextInt();
        if (i == 1){
            cCalc();
        }else if (i == 2){
            sCalc();
        }else if(i == 3){
            cCalc2();
        }else if(i == 4){
            cCalc3();
        }
    }
    
    // volume of a cylinder/column 4
    
    public static void cCalc3(){
        System.out.println("enter the radius of your cone, then height of your cone");
        // added scanner
        Scanner s = new Scanner(System.in);
        int r = s.nextInt();
        // added h a couple of time to each Calc
        int h = s.nextInt();
        double result = Math.PI * Math.pow(r, 2) * h;
        System.out.println(result);
    }
    
    // volume of a cone 3
    
    public static void cCalc2(){
        System.out.println("enter the radius of your cone, then height of your cone");
        // added scanner
        Scanner s = new Scanner(System.in);
        int r = s.nextInt();
        int h = s.nextInt();
        // changed h to (h/3.0)
        double result = Math.PI * Math.pow(r, 2) * (h/3.0);
        // changed r to result
        System.out.println(result);
    }
    
    // area of a circle 1
    
    public static void cCalc(){
        System.out.println("enter the radius of your circle");
        // added scanner
        Scanner s = new Scanner(System.in);
        int r = s.nextInt();
        double result = Math.PI * Math.pow(r, 2);
        // changed r to result
        System.out.println(result);
    }
    
    // volume of a sphere 2
    
    public static void sCalc(){
        System.out.println("enter the radius of your circle");
        // added scanner
        Scanner s = new Scanner(System.in);
        int r = s.nextInt();
        // changed 4 to 4.0
        double result = (4.0/3) * Math.PI * Math.pow(r, 3);
        System.out.println(result);
    }
}

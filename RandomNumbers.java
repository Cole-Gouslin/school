/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.randomnumbers;

/**
 *
 * @author CGouslin2026
 */

import java.util.*;

public class RandomNumbers {

    public static void main(String[] args) {
        //create variables
        Random generator = new Random();
        int checker;
        int oneTwoThree;
        String fullNumber;
        String firstThreeString = "";
        //get first three integers
        for (int i = 0; i < 2; i++) {
            checker = generator.nextInt(8);
            firstThreeString = firstThreeString + checker;
        }
        if (firstThreeString.length() < 3){
            firstThreeString = "0" + firstThreeString;
        }
         if (firstThreeString.length() < 3){
            firstThreeString = "0" + firstThreeString;
         }
         // generate numbers 4-6
         checker = generator.nextInt(656);
         int fourFiveSix = checker;
         String fFSString = "" + fourFiveSix;
         if (fFSString.length() < 3){
            fFSString = "0" + fFSString;
        }
         if (fFSString.length() < 3){
            fFSString = "0" + fFSString;
         }
         //generate last four digits
         int lastFour = generator.nextInt(10000);
         String lastFourString = "" + lastFour;
         if (lastFourString.length() < 4){
            lastFourString = "0" + lastFourString;
        }
         if (lastFourString.length() < 4){
            lastFourString = "0" + lastFourString;
         }
          if (lastFourString.length() < 4){
            lastFourString = "0" + lastFourString;
         }
         // concatenate
         fullNumber = firstThreeString + "-" + fFSString + "-" + lastFourString;
         System.out.println(fullNumber);
    }     
}
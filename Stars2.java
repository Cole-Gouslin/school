/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.stars2;

/**
 *
 * @author CGouslin2026
 */
public class Stars2 {

    public static void main(String[] args) {
        final int MAX_ROWS = 10;
        System.out.println("a.");
        //for each row
        for (int row = 1; row <= MAX_ROWS; row++){
            
            //print out the appropriate number of stars for that row
            
            for (int star = 1; star <= row; star++){
                System.out.print("*");
            }
            
            //newline for a new row
            System.out.println();
        }
        
        // B
        
        System.out.println("b.");
        
        for (int row = 1; row <= MAX_ROWS; row++){
            int spaceAmount = 10 - row;
            
            for (int space = 0; space < spaceAmount; space++){
                System.out.print(" ");
            }
            
            for (int star = 0; star < row; star++){
                System.out.print("*");
            }
            
            System.out.println();
        }
        
        // C
        
        System.out.println("c.");
        
        for (int row = 1; row <= MAX_ROWS; row++){
            int spaceAmount = row - 1;
            
            for (int space = 0; space < spaceAmount; space++){
                System.out.print(" ");
            }
            
            for (int star = 0; star < (10 - row); star++){
                System.out.print("*");
            }
            
            System.out.println();
        }
        
        // D
        final int NEW_MAX_ROWS = 5;
        
        System.out.println("d.");
         for (int row = 1; row <= 5; row++) {
            // Print spaces
            for (int space = 1; space <= NEW_MAX_ROWS - row; space++) {
                System.out.print(" ");
            }
            // Print stars
            for (int star = 1; star <= (2 * row - 1); star++) {
                System.out.print("*");
            }
            System.out.println();
         }    
            
            
        for (int row = 4; row >= 1; row--) {
            // Print spaces
            for (int space = 1; space <= NEW_MAX_ROWS - row; space++) {
                System.out.print(" ");
            }
            // Print stars
            for (int star = 1; star <= (2 * row - 1); star++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }       
}

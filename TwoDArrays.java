/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.twodarrays;

/**
 *
 * @author CGouslin2026
 */

import java.util.Random;

public class TwoDArrays {

    public static void main(String[] args) {
        // create deck of cards
        String[][] deckOfCards = {
            {"01s","02s","03s","04s","05s","06s","07s","08s","09s","10s","11s","12s","13s"},
            {"01d","02d","03d","04d","05d","06d","07d","08d","09d","10d","11d","12d","13d"},
            {"01c","02c","03c","04c","05c","06c","07c","08c","09c","10c","11c","12c","13c"},
            {"01h","02h","03h","04h","05h","06h","07h","08h","09h","10h","11h","12h","13h"}
        };
        // call shuffle method
        shuffle(deckOfCards);
        System.out.println("---------------------------------------------------------------------------------------");
        shuffle(deckOfCards);
        System.out.println("---------------------------------------------------------------------------------------");
        shuffle(deckOfCards);
        System.out.println("---------------------------------------------------------------------------------------");
        shuffle(deckOfCards);
        System.out.println("---------------------------------------------------------------------------------------");
        shuffle(deckOfCards);
        System.out.println("---------------------------------------------------------------------------------------");
        shuffle(deckOfCards);
        System.out.println("---------------------------------------------------------------------------------------");
        shuffle(deckOfCards);
        
    }

    // method that shuffles cards
    public static void shuffle(String[][] inArray){
        
        // create temporary array
        
        String[] tempArray = new String[52];
        for (int i = 0; i < 4; i++) { 
            for (int j = 0; j < 13; j++) {
                tempArray[(i * 13) + j]= inArray[i][j];
            }
        }
        // shuffle process (based on the Fischer-Yates shuffle method)
       for (int i = 51; i > -1; i--){
           Random rand = new Random();
           int j = rand.nextInt(i + 1);
           String tempString = tempArray[i];
           tempArray[i] = tempArray[j];
           tempArray[j] = tempString;         
       }
        // print shuffled deck
       for (int i = 0; i < 52; i++) { 
               System.out.println(tempArray[i]); 
            }
        }    
    }



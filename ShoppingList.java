/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.shoppinglist;

/**
 *
 * @author CGouslin2026
 */

import java.util.*;

public class ShoppingList {

    public static void main(String[] args) {
        // initialize
        ArrayList<String> shoppingList = new ArrayList<String>();
        Scanner scan = new Scanner(System.in);
        
        
        // get items
        boolean b = true;
        while (b = true){
            
            System.out.println("Would you like to add or remove anything from your shopping list?");
            String input = scan.nextLine();
            if (input.equalsIgnoreCase("add")){
                System.out.println("\nWhat would you like to add?");
                shoppingList.add(scan.nextLine());
                
            } else if (input.equalsIgnoreCase("remove")) { 
                System.out.println("\nWhat would you like to remove?");
                int removalIndex = shoppingList.indexOf(scan.nextLine());
                shoppingList.remove(removalIndex);
                
            } else if (input.equalsIgnoreCase("no")) {  
                
            } else {
                System.out.println("\nINVALID INPUT\nPLEASE INPUT ONE OF\n\"ADD\"\n\"REMOVE\"\n\"NO\"\n");
                continue;
            }
            
            
            // print list / end program
            System.out.println("\nWould you like to see your list (\"SEE MY LIST\") or end the program (\"END\") ?");
            String input2 = scan.nextLine();
            if (input2.equalsIgnoreCase("SEE MY LIST")){
                
                
                // PRINT LIST
                System.out.println("\n");
                
                ArrayList<String> printableList = new ArrayList<String>();
                for (int i = 0; i < shoppingList.size(); i++){
                    String tempItem = Integer.toString(i + 1) + ". " + shoppingList.get(i);
                    printableList.add(tempItem);
                }
                
                for (int i = 0; i < printableList.size(); i++){
                    System.out.println(printableList.get(i));
                }
                
                System.out.println("\n");
               
            } else if (input2.equalsIgnoreCase("END")) { 
                System.out.println("\nENDING PROGRAM");
                System.exit(0); 
                
            } else { 
                System.out.println("");     
            }    
        }
    }
}

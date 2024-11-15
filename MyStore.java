/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mystore;

/**
 *
 * @author CGouslin2026
 */

import java.util.*;
import java.text.*;

public class MyStore {

    public static void main(String[] args) {
        // create items
        Item tShirt = new Item("T Shirt", 29.99);
        Item shoes = new Item("Shoes", 125.99);
        Item jeans = new Item("Jeans", 60.99);
        Item jacket = new Item("Jacket", 250.00);
        Item hat = new Item("Hat", 25.99);
        Item shorts = new Item("Shorts", 75.99);
        Item blouse = new Item("Blouse", 88.99);
        
        // create budget
        final double MAX_BUDGET = 250.00;
        double spent = 0.00;
        int count = 0;
        
        // create scanner
        Scanner scan = new Scanner(System.in);
        
        // edit cart
        System.out.println("Here is a list of all items and their prices:\n\n" + tShirt  + "\n" + shoes + "\n" + jeans + "\n" + jacket + "\n" + hat + "\n" + shorts + "\n" + blouse);
        
        while (spent <= MAX_BUDGET) {
            System.out.println("\nWhat item would you like to add to your cart?");
            String currentItem = scan.nextLine();
            
            if (currentItem.equalsIgnoreCase("T Shirt")){
                spent = spent + tShirt.getPrice();
                count++;

                System.out.println("Your current number of items is " + count + " and your total spent is " + spent + ".");
            } else if (currentItem.equalsIgnoreCase("Shoes")){
                spent = spent + shoes.getPrice();
                count++;

                System.out.println("Your current number of items is " + count + " and your total spent is " + spent + ".");
            } else if (currentItem.equalsIgnoreCase("Jeans")){
                spent = spent + jeans.getPrice();
                count++;
                
                System.out.println("Your current number of items is " + count + " and your total spent is " + spent + ".");
            } else if (currentItem.equalsIgnoreCase("Jacket")){
                spent = spent + jacket.getPrice();
                count++;
                
                System.out.println("Your current number of items is " + count + " and your total spent is " + spent + ".");
            } else if (currentItem.equalsIgnoreCase("Hat")){
                spent = spent + hat.getPrice();
                count++;
                
                System.out.println("Your current number of items is " + count + " and your total spent is " + spent + ".");
            } else if (currentItem.equalsIgnoreCase("Shorts")){
                spent = spent + shorts.getPrice();
                count++;
                
                System.out.println("Your current number of items is " + count + " and your total spent is " + spent + ".");
            } else if (currentItem.equalsIgnoreCase("Blouse")){
                spent = spent + blouse.getPrice();
                count++;
                
                System.out.println("Your current number of items is " + count + " and your total spent is " + spent + ".");
            }else {
                System.out.println("INVALID ITEM");
            }

            // detect overspending
            if (spent > MAX_BUDGET){
                System.out.println("You have gone over budget. Would you like to exit or remove an item?\nIf you want to exit, enter \"Exit\".\nIf you would like to remove an item, type the item's name.");
                currentItem = scan.nextLine();
                
                if (currentItem.equalsIgnoreCase("Exit")){
                    System.exit(0);
                    
                } else if (currentItem.equalsIgnoreCase("T Shirt")){
                    spent = spent - tShirt.getPrice();
                    count--;
                
                    System.out.println("Your current number of items is " + count + " and your total spent is " + spent + ".");
                } else if (currentItem.equalsIgnoreCase("Shoes")){
                    spent = spent - shoes.getPrice();
                    count--;
                
                    System.out.println("Your current number of items is " + count + " and your total spent is " + spent + ".");
                } else if (currentItem.equalsIgnoreCase("Jeans")){
                    spent = spent - jeans.getPrice();
                    count--;
                    
                    System.out.println("Your current number of items is " + count + " and your total spent is " + spent + ".");
                } else if (currentItem.equalsIgnoreCase("Jacket")){
                    spent = spent - jacket.getPrice();
                    count--;
                    
                    System.out.println("Your current number of items is " + count + " and your total spent is " + spent + ".");
                } else if (currentItem.equalsIgnoreCase("Hat")){
                    spent = spent - hat.getPrice();
                    count--;
                    
                    System.out.println("Your current number of items is " + count + " and your total spent is " + spent + ".");
                } else if (currentItem.equalsIgnoreCase("Shorts")){
                    spent = spent - shorts.getPrice();
                    count--;
                    
                    System.out.println("Your current number of items is " + count + " and your total spent is " + spent + ".");
                } else if (currentItem.equalsIgnoreCase("Blouse")){
                    spent = spent - blouse.getPrice();
                    count--;
                    
                    System.out.println("Your current number of items is " + count + " and your total spent is " + spent + ".");
                } else {
                    System.out.println("INVALID ITEM");
                }
            }
        }
        
    }
}

class Item {
    
    // initialize variables
    private String name;
    private double price;
    
    // constructors
    public Item(){
        name = "";
        price = 0.00;
    }
    
    public Item(String inName, double inPrice){
        name = inName;
        price = inPrice;
    }
    
    // modifiers
    public void setName(String inName){
        name = inName;
    }
    
    public void setPrice(double inPrice){
        price = inPrice;
    }
    
    // accessors
    public String getName(){
        return name;
    }
    
    public double getPrice(){
        return price;
    }
    
    // toString
    @Override
    public String toString(){
        return "Item: " + name + " || Price: " + price;
    }
    
 
    
}

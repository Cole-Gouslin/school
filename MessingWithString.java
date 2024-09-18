/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.messingwithstring;

/**
 *
 * @author CGouslin2026
 */
public class MessingWithString {

    public static void main(String[] args) {
        // 1
        String name = new String ("Cole Gouslin");
        System.out.println("My name is " + "\"" + name + "\"");
        // 2
        System.out.println("My name length is " + name.length());
        // 3
        System.out.println("My name in upper case is " + name.toUpperCase());
        // 4
        System.out.println("My name in lower case is " + name.toLowerCase());
        // 5
        System.out.println("The first letter in my name is " + name.charAt(0));
        // 6
        System.out.println("The last letter in my name is " + name.charAt(name.length()-1));
        // 7
        System.out.println("The index of the space between the names is " + name.indexOf(" "));
        
        
        
        
    }     
}
    
    


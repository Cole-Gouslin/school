/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.weekdays;

/**
 *
 * @author CGouslin2026
 */
public class WeekDays {

    public static void main(String[] args) {
        // create array
        String[] DOTW = {"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
        // print DOTW
        for (int i = 0; i < DOTW.length; i++) {
            System.out.println(DOTW[i]);
        }
        System.out.println();
        // create temporary array and copy 2-6
        String[] TempDOTW = new String[5];
        for (int i = 1; i < 6; i++) {
            TempDOTW[i-1] = DOTW[i];
        }
        // set DOTW to TempDOTW
        DOTW = TempDOTW;
        // print resized array
        for (int i = 0; i < DOTW.length; i++) {
            System.out.println(DOTW[i]);
        }    
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.enumeratedtypes;

/**
 *
 * @author CGouslin2026
 */

import java.util.*;

public class EnumeratedTypes {
    enum dotWeek {sunday, monday, tuesday, wednesday, thursday, friday, saturday}
    enum motYear {january, february, march, april, may, june, july, august, september, october, november, december}

    public static void main(String[] args) {
        //#1a////////////////////////////////////////////////////////////////////////////////////
        /////////////////////////////////////////////////////////////////////////////////////////
        dotWeek day1 = dotWeek.sunday;
        dotWeek day2 = dotWeek.monday;
        dotWeek day3 = dotWeek.tuesday;
        dotWeek day4 = dotWeek.wednesday;
        dotWeek day5 = dotWeek.thursday;
        dotWeek day6 = dotWeek.friday;
        dotWeek day7 = dotWeek.saturday;
        System.out.println((day1.ordinal() + 1) + "\n" + (day2.ordinal() + 1) + "\n" + (day3.ordinal() + 1) + "\n" + (day4.ordinal() + 1) + "\n" + (day5.ordinal() + 1) + "\n" + (day6.ordinal() + 1) + "\n" + (day7.ordinal() + 1) + "\n");
        //#1b///////////////////////////
        /*motYear month1 = motYear.january;
        motYear month2 = motYear.february;
        motYear month3 = motYear.march;
        motYear month4 = motYear.april;
        motYear month5 = motYear.may;
        motYear month6 = motYear.june;
        motYear month7 = motYear.july;
        motYear month8 = motYear.august;
        motYear month9 = motYear.september;
        motYear month10 = motYear.october;
        motYear month11 = motYear.november;
        motYear month12 = motYear.december;*/
        motYear[] months = motYear.values();
        //print
        for (motYear month : months) {
            System.out.println(month);
        }
        //#2
        Scanner scan = new Scanner(System.in);
        String name;
        System.out.println("\n\nPlease input your username (first initial + last name + gradutation year:");
        name = scan.nextLine();
        //String gradYear =  Integer.toString(name.charAt(+ name.length()-4) + name.charAt(name.length()-3) + name.charAt(name.length()-2) + name.charAt(name.length()-1));
        String gradYear = name.substring(name.length()-4, name.length());
        int printThing = Integer.valueOf(gradYear);
        System.out.println("\nYou graduate in: " + gradYear);
        System.out.println("\nIn computer language, you graduate in: " + Integer.toBinaryString(printThing));
        
        
        
    }   
}

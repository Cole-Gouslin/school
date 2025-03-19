/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.sort;

/**
 *
 * @author CGouslin2026
 */
class Contact implements Comparable<Contact> {
    private String firstName, lastName, phone;

    public Contact(String first, String last, String telephone) {
        firstName = first;
        lastName = last;
        phone = telephone;
    }

    public String toString() {
        return lastName + ", " + firstName + "\t" + phone;
    }

    public boolean equals(Object other) {
        return (other instanceof Contact) && phone.equals(((Contact) other).getPhone());
    }

    public int compareTo(Contact other) {
        return phone.compareTo(other.getPhone());
    }

    public String getPhone() {
        return phone;
    }
}

class Sorting {
    public static void selectionSort(Comparable[] list) {
        int min;
        Comparable temp;
        for (int index = 0; index < list.length - 1; index++) {
            min = index;
            for (int scan = index + 1; scan < list.length; scan++) {
                if (list[scan].compareTo(list[min]) < 0)
                    min = scan;
            }
            temp = list[min];
            list[min] = list[index];
            list[index] = temp;
        }
    }

    public static void insertionSort(Comparable[] list) {
        for (int index = 1; index < list.length; index++) {
            Comparable key = list[index];
            int position = index;
            while (position > 0 && key.compareTo(list[position - 1]) < 0) {
                list[position] = list[position - 1];
                position--;
            }
            list[position] = key;
        }
    }
}

public class Sort {
    public static void main(String[] args) {
        Contact[] friends = new Contact[8];
        friends[0] = new Contact("John", "Smith", "610-555-7384");
        friends[1] = new Contact("Sarah", "Barnes", "215-555-3827");
        friends[2] = new Contact("Mark", "Riley", "733-555-2969");
        friends[3] = new Contact("Laura", "Getz", "663-555-3984");
        friends[4] = new Contact("Larry", "Smith", "464-555-3489");
        friends[5] = new Contact("Frank", "Phelps", "322-555-2284");
        friends[6] = new Contact("Mario", "Guzman", "804-555-9066");
        friends[7] = new Contact("Marsha", "Grant", "243-555-2837");
        
        System.out.println("*** Original List ***");
        printContacts(friends);
        
        Sorting.selectionSort(friends);
        System.out.println("\n*** Selection Sort ***");
        printContacts(friends);
        
        Sorting.insertionSort(friends);
        System.out.println("\n*** Insertion Sort ***");
        printContacts(friends);
    }
    
    public static void printContacts(Contact[] contacts) {
        for (Contact contact : contacts) {
            System.out.println(contact);
        }
    }
}
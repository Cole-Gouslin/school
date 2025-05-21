/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.recursivepp;

/**
 *
 * @author CGouslin2026
 */

import java.util.Scanner;
import java.util.Arrays;

public class RecursivePP {

    // Recursive method to calculate value at position (row, col)
    public static int pascalValue(int row, int col) {
        if (col == 0 || col == row) {
            return 1; // Base cases: first or last element in row
        }
        return pascalValue(row - 1, col - 1) + pascalValue(row - 1, col); // Recursive case
    }

    // Method to compute and return the nth line of Pascal's Triangle
    public static int[] getPascalsLine(int n) {
        int[] line = new int[n + 1];
        for (int i = 0; i <= n; i++) {
            line[i] = pascalValue(n, i);
        }
        return line;
    }

    // Main method to get input and print the result
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the line number (N) of Pascal's Triangle: ");
        int n = scanner.nextInt();

        int[] nthLine = getPascalsLine(n);
        System.out.println("Line " + n + " of Pascal's Triangle: " + Arrays.toString(nthLine));

        scanner.close();
    }
}

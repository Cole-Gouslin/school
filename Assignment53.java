/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.assignment53;
import java.util.*;

/**
 *
 * @author mearley2025
 */
public class Assignment53 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Collecting student details from the user
        System.out.print("Enter student's first name:");
        String firstName = input.nextLine();
        System.out.print("Enter student's last name:");
        String lastName = input.nextLine();

        Student student = new Student(firstName, lastName);

        // Setting courses and scores
        System.out.println("Enter three courses:");
        student.setCourse(input.nextLine(), input.nextLine(), input.nextLine());

        System.out.println("Enter test scores for the courses:");
        student.setTestScore(1, input.nextInt());
        student.setTestScore(2, input.nextInt());
        student.setTestScore(3, input.nextInt());

        // Displaying student details
        System.out.println(student);
        System.out.println("Average Score: " + student.getAverage());
    }
}

class Student {
    private String firstName, lastName;
    private String course1, course2, course3;
    private int cOneTest, cTwoTest, cThreeTest;

    // Default constructor initializing test scores to zero
    public Student() {
        firstName = "";
        lastName = "";
        course1 = "";
        course2 = "";
        course3 = "";
        cOneTest = 0;
        cTwoTest = 0;
        cThreeTest = 0;
    }

    // Overloaded constructor to initialize student with name
    public Student(String first, String last) {
        firstName = first;
        lastName = last;
        course1 = "";
        course2 = "";
        course3 = "";
        cOneTest = 0;
        cTwoTest = 0;
        cThreeTest = 0;
    }

    // Set courses
    public void setCourse(String courseOne, String courseTwo, String courseThree) {
        course1 = courseOne;
        course2 = courseTwo;
        course3 = courseThree;
    }

    // Get courses
    public String[] getCourse() {
        return new String[]{course1, course2, course3};
    }

    // Set test score 
    public void setTestScore(int courseNumber, int score) {
        switch (courseNumber) {
            case 1 -> cOneTest = score;
            case 2 -> cTwoTest = score;
            case 3 -> cThreeTest = score;
            default -> throw new IllegalArgumentException("Invalid course number");
        }
    }

    // Get test scores as an array
    public int[] getTestScores() {
        return new int[]{cOneTest, cTwoTest, cThreeTest};
    }

    // Calculating average test score
    public double getAverage() {
        return  (cOneTest + cTwoTest + cThreeTest) / 3.0;
    }

    // toString method for what to print
    @Override
    public String toString() {
        return "Student: " + firstName + " " + lastName + "\n" +
                "Courses and their grades:\n" +
                course1 + " - " + cOneTest + "%\n" +
                course2 + " - " + cTwoTest + "%\n" +
                course3 + " - " + cThreeTest + "%";
    }
}
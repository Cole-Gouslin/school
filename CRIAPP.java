/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.criapp;

/**
 *
 * @author CGouslin2026
 */

import java.util.*;

public class CRIAPP {

    public static void main(String[] args) {
         // create task objects
        Task t1 = new Task (1, 3, "Go to work");
        Task t2 = new Task(2, 2, "Eat food");
        Task t3 = new Task(3, 5, "Do homework");
 
        // create task array
        List<Task> tasks = new ArrayList<>();
        tasks.add(t1);
        tasks.add(t2);
        tasks.add(t3);
        
        //compare tasks
        Collections.sort(tasks);
        
        // print final list 
        System.out.println("Tasks sorted by priority and complexity: \n");
        for (Task task : tasks) {
            System.out.println(task);
       }
    }
}

class Task implements Priority, Complexity, Comparable<Task> {
    private int priority = 0;
    private int complexity = 0;
    private String taskName = "";
    
    // constructors
    public Task(int priority, int complexity, String taskName) {
        this.priority = priority;
        this.complexity = complexity;
        this.taskName = taskName;
    }
    
    //setting task name
    public void setTaskName(String inName){
        taskName = inName;
    }//making input (to be set to different things in the objects) a string
    
    // priority interface
    public void setPriority(int priority) {
        this.priority = priority;
    }
    public int getPriority() {
        return priority;
    }
    
    // complexity interface
    public void setComplexity(int complexity) {
        this.complexity = complexity;
    }
    public int getComplexity() {
        return complexity;
    }

    // comparable interface
    @Override
    public int compareTo(Task otherTask) {
        // priority comparison
        int priorityComparison = Integer.compare(this.priority, otherTask.priority);
        if (priorityComparison != 0) {
            return priorityComparison;
        }
        // result to comparing complexity if equal priority
        return Integer.compare(this.complexity, otherTask.complexity);
    }
// toString
@Override
    public String toString() {
        return "Task: " + taskName + "\nPriority: " + priority + "\nComplexity: " + complexity + "\n";
    }
}


// priority interface
interface Priority {
    public void setPriority(int priority);
    public int getPriority();
}
// complexity interface
interface Complexity{
    public void setComplexity(int complexity);
    public int getComplexity();
}
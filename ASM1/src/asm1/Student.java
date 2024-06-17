/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package asm1;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class Student {
    private int ID;
    private String Name;
    private float Marks;
    private String Ranking;
    
    public Student() {
        // Default constructor
        this.ID = 0; // Default ID
        this.Name = ""; // Default name
        this.Marks = 0.0f; // Default marks
        calculateRanking();
    }
    
    public Student(int ID, String Name, float Marks) {
        this.ID = ID;
        this.Name = Name;
        this.Marks = Marks;
        calculateRanking();
    }
    
    public void inputStudent(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the student's ID: ");
        ID = input.nextInt();
        input.nextLine();
        System.out.print("Enter the student's name: ");
        Name = input.nextLine();
        System.out.print("Enter the student's mark: ");
        Marks = input.nextFloat();
        calculateRanking();
    }
    
    @Override
    public String toString() {
        return "Student ID: " + ID + "\nStudent Name: " + Name + "\nMarks: " + Marks + "\nRanking: " + Ranking;
    }
    
    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        try {
            if (ID <= 0) {
                throw new IllegalArgumentException("ID must be a positive integer.");
            }
            this.ID = ID;
        } catch (IllegalArgumentException e) {
            System.out.println("Error setting ID: " + e.getMessage());
        }
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        try {
            if (Name == null || Name.trim().isEmpty()) {
                throw new IllegalArgumentException("Name cannot be null or empty.");
            }
            this.Name = Name;
        } catch (IllegalArgumentException e) {
            System.out.println("Error setting Name: " + e.getMessage());
        }
    }

    public double getMarks() {
        return Marks;
    }

    public void setMarks(float Marks) {
        try {
            if (Marks >= 0 && Marks <= 10.0) {
            } else {
                throw new IllegalArgumentException("Marks must be between 0 and 10.0.");
            }
            this.Marks = Marks;
        } catch (IllegalArgumentException e) {
            System.out.println("Error setting Marks: " + e.getMessage());
        }
    } 
    
    public String getRanking() {
        return Ranking;
    }

    private void calculateRanking() {
        if (Marks >= 0 && Marks < 5.0) {
            Ranking = "Fail";
        } else if (Marks >= 5.0 && Marks < 6.5) {
            Ranking = "Medium";
        } else if (Marks >= 6.5 && Marks < 7.5) {
            Ranking = "Good";
        } else if (Marks >= 7.5 && Marks < 9.0) {
            Ranking = "Very Good";
        } else if (Marks >= 9.0 && Marks <= 10.0) {
            Ranking = "Excellent";
        } else {
            Ranking = "Invalid";
        }
    }

}

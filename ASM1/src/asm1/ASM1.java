/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package asm1;

import static asm1.StudentManagementSystem.addStudent;
import static asm1.StudentManagementSystem.editStudent;
import static asm1.StudentManagementSystem.deleteStudent;
import static asm1.StudentManagementSystem.searchStudentByName;
import static asm1.StudentManagementSystem.sortStudentsByMarks;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class ASM1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Student> students = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        int choice;
        
        do {
            System.out.println("Student Management System");
            System.out.println("1. Add Student");
            System.out.println("2. Edit Student");
            System.out.println("3. Delete Student");
            System.out.println("4. Sort Students by Marks");
            System.out.println("5. Search Student by Name");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = input.nextInt();
            System.out.println("");
            
            switch (choice) {
                case 1 -> addStudent(students);
                case 2 -> {
                    System.out.print("Enter the ID of the student to edit: ");
                    int editID = input.nextInt();
                    editStudent(students, editID);
                }
                case 3 -> {
                    System.out.print("Enter the ID of the student to delete: ");
                    int deleteID = input.nextInt();
                    deleteStudent(students, deleteID);
                }
                case 4 -> {
                    sortStudentsByMarks(students);
                    System.out.println("Students sorted by marks:");
                    for (Student student : students) {
                        System.out.println(student);
                    }
                }
                case 5 -> {
                    input.nextLine(); // Consume newline character
                    System.out.print("Enter the name of the student to search: ");
                    String searchName = input.nextLine();
                    searchStudentByName(students, searchName);
                }
                case 6 -> System.out.println("Exiting program...");
                default -> System.out.println("Invalid choice. Please enter a number between 1 and 6.");
            }
        } while (choice != 6);
        
        input.close();
    }
    
}

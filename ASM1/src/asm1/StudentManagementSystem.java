/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package asm1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author user
 */
public class StudentManagementSystem {
    // Method to add a student to the list
    public static void addStudent(ArrayList<Student> students) {
        Student student = new Student();
        student.inputStudent();
        students.add(student);
        System.out.println("");
    }
    
    // Method to edit a student's information
    public static void editStudent(ArrayList<Student> students, int studentID) {
        for (Student student : students) {
            if (student.getID() == studentID) {
                student.inputStudent();
                return;
            }
        }
        System.out.println("Student with ID " + studentID + " not found.");
        System.out.println("");
    }
    
    // Method to delete a student from the list
    public static void deleteStudent(ArrayList<Student> students, int studentID) {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getID() == studentID) {
                students.remove(i);
                return;
            }
        }
        System.out.println("Student with ID " + studentID + " not found.");
        System.out.println("");
    }
    
    // Method to sort students by marks
    public static void sortStudentsByMarks(ArrayList<Student> students) {
        Collections.sort(students, Comparator.comparing(Student::getMarks).reversed());      
    }
    
    // Method to search for a student by name
    public static void searchStudentByName(ArrayList<Student> students, String name) {
        boolean found = false;
        for (Student student : students) {
            if (student.getName().equalsIgnoreCase(name)) {
                System.out.println(student);
                found = true;
            }
        }
        if (!found) {
            System.out.println("Student with name " + name + " not found.");
        }
        System.out.println("");
    }
}

package com.controller;

import com.bean.Student;
import com.dao.StudentDAO;
import com.util.ValidationUtil;

import java.util.Scanner;

public class MainController {
    private static StudentDAO studentDAO = new StudentDAO();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Counsellor Menu");
            System.out.println("2. Faculty Menu");
            System.out.println("3. Exit");
            System.out.print("Select an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    counsellorMenu();
                    break;
                case 2:
                    facultyMenu();
                    break;
                case 3:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice, please try again.");
            }
        }
    }

    private static void counsellorMenu() {
        while (true) {
            System.out.println("\nCounsellor Menu:");
            System.out.println("1. Add Student");
            System.out.println("2. Remove Student");
            System.out.println("3. View All Students");
            System.out.println("4. View Specific Student");
            System.out.println("5. Back to Main Menu");
            System.out.print("Select an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    addStudent();
                    break;
                case 2:
                    removeStudent();
                    break;
                case 3:
                    viewAllStudents();
                    break;
                case 4:
                    viewSpecificStudent();
                    break;
                case 5:
                    return;
                default:
                    System.out.println("Invalid choice, please try again.");
            }
        }
    }

    private static void addStudent() {
        System.out.print("Enter ID: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // consume newline

        String firstName;
        while (true) {
            System.out.print("Enter First Name: ");
            firstName = scanner.nextLine();
            if (ValidationUtil.isValidName(firstName)) break;
            System.out.println("Invalid name, please try again.");
        }

        String contactNumber;
        while (true) {
            System.out.print("Enter Contact Number (10 digits): ");
            contactNumber = scanner.nextLine();
            if (ValidationUtil.isValidContactNumber(contactNumber)) break;
            System.out.println("Invalid contact number, please try again.");
        }

        studentDAO.addStudent(new Student(id, firstName, contactNumber));
        System.out.println("Student added successfully!");
    }

    private static void removeStudent() {
        System.out.print("Enter ID to remove: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // consume newline

        System.out.print("Are you sure you want to delete student with ID " + id + "? (Y/N): ");
        String confirmation = scanner.nextLine();

        if (confirmation.equalsIgnoreCase("Y")) {
            studentDAO.removeStudent(id);
            System.out.println("Student removed successfully!");
        } else {
            System.out.println("Operation cancelled.");
        }
    }

    private static void viewAllStudents() {
        System.out.println("All Students:");
        for (Student student : studentDAO.viewAllStudents()) {
            System.out.println(student);
        }
    }

    private static void viewSpecificStudent() {
        System.out.print("Enter ID to view: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // consume newline

        Student student = studentDAO.viewSpecificStudent(id);
        if (student != null) {
            System.out.println(student);
        } else {
            System.out.println("User does not exist.");
        }
    }

    private static void facultyMenu() {
        // Similar implementation for faculty to add/view marks for own students
        System.out.println("Faculty functionality is not yet implemented.");
    }
}

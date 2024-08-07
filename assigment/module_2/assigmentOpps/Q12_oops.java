package assigmentOpps;

/*
 Write a program which will ask the user to enter his/her marks (out of 100). Define a
method that will display grades according to the marks entered as below:
Marks Grade :
1-100 A
1-90 B
1-80 B
1-70 C
1-60 D
41-50 DD40 Fail


 */

import java.util.Scanner;

public class Q12_oops {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your marks (out of 100): ");
        int marks = scanner.nextInt();
        calculateGrade(marks);
    }

    public static void calculateGrade(int marks) {
        if (marks >= 91 && marks <= 100) {
            System.out.println("Grade: A");
        } else if (marks >= 81 && marks <= 90) {
            System.out.println("Grade: B");
        } else if (marks >= 71 && marks <= 80) {
            System.out.println("Grade: C");
        } else if (marks >= 61 && marks <= 70) {
            System.out.println("Grade: D");
        } else if (marks >= 51 && marks <= 60) {
            System.out.println("Grade: DD");
        } else if (marks >= 41 && marks <= 50) {
            System.out.println("Grade: DD40");
        } else {
            System.out.println("Grade: Fail");
        }
    }
}


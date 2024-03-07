package day3method;

import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter your marks (out of 100): ");
        int marks = scanner.nextInt();

        displayGrade(marks);

        scanner.close();
    }

    public static void displayGrade(int marks) {
        char grade;

        if (marks >= 91 && marks <= 100) {
            grade = 'A';
        } else if (marks >= 81 && marks <= 90) {
            grade = 'A';
        } else if (marks >= 71 && marks <= 80) {
            grade = 'B';
        } else if (marks >= 61 && marks <= 70) {
            grade = 'B';
        } else if (marks >= 51 && marks <= 60) {
            grade = 'C';
        } else if (marks >= 41 && marks <= 50) {
            grade = 'D';
        } else {
            grade = 'F';
        }

        System.out.println("Grade: " + grade);
    }
}

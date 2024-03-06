package day2_postlunch;

import java.util.Scanner;

public class IntegerInputArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create an array to store 10 integers
        int[] numbers = new int[10];

        // Take 10 integer inputs from the user
        System.out.println("Enter 10 integers:");

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        // Print the integers on the screen
        System.out.println("The integers you entered are:");
        for (int i = 0; i < 10; i++) {
            System.out.println(numbers[i]);
        }

        // Close the scanner
        scanner.close();
    }
}

package day2_postlunch;

import java.util.Scanner;

public class ReverseArrayCopy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take 10 integer inputs from the user and store them in the array
        int[] originalArray = new int[10];
        System.out.println("Enter 10 integers:");

        for (int i = 0; i < 10; i++) {
            originalArray[i] = scanner.nextInt();
        }

        // Create another array to store elements in reverse order
        int[] reversedArray = new int[10];

        // Copy elements from the original array to the reversed array in reverse order
        for (int i = 0; i < 10; i++) {
            reversedArray[i] = originalArray[9 - i];
        }

        // Print the reversed array
        System.out.println("Original Array:");
        for (int i = 0; i < 10; i++) {
            System.out.print(originalArray[i] + " ");
        }
        System.out.println("\nReversed Array:");
        for (int i = 0; i < 10; i++) {
            System.out.print(reversedArray[i] + " ");
        }

        // Close the scanner
        scanner.close();
    }
}

package day2_postlunch;

//Take 10 integer inputs from user and store them in an array. Again ask user to give a number. Now, tell user whether that number is present in array or not.
import java.util.Scanner;

public class NumberPresenceInArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take 10 integer inputs from the user and store them in the array
        int[] numbers = new int[10];
        System.out.println("Enter 10 integers:");

        for (int i = 0; i < 10; i++) {
            numbers[i] = scanner.nextInt();
        }

        // Ask the user to give a number to search in the array
        System.out.print("Enter a number to search in the array: ");
        int searchNumber = scanner.nextInt();

        // Check if the entered number is present in the array
        boolean found = false;
        for (int i = 0; i < 10; i++) {
            if (numbers[i] == searchNumber) {
                found = true;
                break;
            }
        }

        // Print whether the number is present in the array or not
        if (found) {
            System.out.println("The number " + searchNumber + " is present in the array.");
        } else {
            System.out.println("The number " + searchNumber + " is not present in the array.");
        }

        // Close the scanner
        scanner.close();
    }
}

package day2_postlunch;

import java.util.Scanner;
import java.util.Arrays;

public class MaxMinDifference {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take input for the number of elements in the array
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        // Create an array of size n to store the elements
        int[] array = new int[n];

        // Take input for the elements of the array
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        // Sort the array to easily find the minimum and maximum differences
        Arrays.sort(array);

        // Find the maximum difference
        int maxDifference = array[n - 1] - array[0];

        // Find the minimum difference
        int minDifference = array[1] - array[0];

        // Iterate through the array to find the minimum difference
        for (int i = 2; i < n; i++) {
            minDifference = Math.min(minDifference, array[i] - array[i - 1]);
        }

        // Print the pair of elements with maximum difference
        System.out.println("Pair with maximum difference: " + array[0] + " and " + array[n - 1]);
        System.out.println("Maximum difference: " + maxDifference);

        // Print the pair of elements with minimum difference
        System.out.println("Pair with minimum difference: " + (array[0] + minDifference) + " and " + array[0]);
        System.out.println("Minimum difference: " + minDifference);

        scanner.close();
    }
}


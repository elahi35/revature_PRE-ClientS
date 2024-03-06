package day2_postlunch;

import java.util.Scanner;

public class NumberStatistics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = new int[20];
        System.out.println("Enter 20 integers:");

        for (int i = 0; i < 20; i++) {
            numbers[i] = scanner.nextInt();
        }

        
        int positiveCount = 0;
        int negativeCount = 0;
        int oddCount = 0;
        int evenCount = 0;
        int zeroCount = 0;

        
        for (int number : numbers) {
            if (number > 0) {
                positiveCount++;
            } else if (number < 0) {
                negativeCount++;
            } else {
                zeroCount++;
            }

            if (number % 2 == 0 && number != 0) {
                evenCount++;
            } else if (number % 2 != 0) {
                oddCount++;
            }
        }

       
        System.out.println("Number of positive numbers: " + positiveCount);
        System.out.println("Number of negative numbers: " + negativeCount);
        System.out.println("Number of odd numbers: " + oddCount);
        System.out.println("Number of even numbers: " + evenCount);
        System.out.println("Number of zeros: " + zeroCount);

        
        scanner.close();
    }
}

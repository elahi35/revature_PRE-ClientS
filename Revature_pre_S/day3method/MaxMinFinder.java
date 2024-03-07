package day3method;

import java.util.Scanner;

public class MaxMinFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

  
        System.out.println("Enter three numbers:");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();

        
        System.out.println("Maximum number: " + findMax(num1, num2, num3));
        System.out.println("Minimum number: " + findMin(num1, num2, num3));

        scanner.close();
    }

  
    public static int findMax(int a, int b, int c) {
        return Math.max(Math.max(a, b), c);
    }

    public static int findMin(int a, int b, int c) {
        return Math.min(Math.min(a, b), c);
    }
}

package day3method;

import java.util.Scanner;

public class TaxCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter your gross salary: ");
        double grossSalary = scanner.nextDouble();

        System.out.print("Enter your total savings: ");
        double totalSavings = scanner.nextDouble();

        double tax = taxCalculator(grossSalary, totalSavings);

        System.out.println("Your tax is: " + tax);

        scanner.close();
    }
    public static double taxCalculator(double grossSalary, double totalSavings) {
        double tax;

        double taxableIncome = grossSalary - Math.min(totalSavings, 100000);

        if (taxableIncome <= 500000) {
            tax = 0; 
        } else if (taxableIncome <= 1000000) {
            tax = 0.1 * (taxableIncome - 500000); 
        } else {
            tax = 0.2 * (taxableIncome - 1000000) + 50000; 
        }

        return tax;
    }
}

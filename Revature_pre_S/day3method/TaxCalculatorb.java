package day3method;

import java.util.Scanner;

public class TaxCalculatorb {
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
        double tax = 0;
        double taxableIncome = grossSalary - totalSavings;
        if (taxableIncome > 500000) {
            tax += 0.3 * (taxableIncome - 500000); 
            taxableIncome = 500000; 
        }
        if (taxableIncome > 200000) {
            tax += 0.2 * (taxableIncome - 200000); 
            taxableIncome = 200000; 
        }
        if (taxableIncome > 100000) {
            tax += 0.1 * (taxableIncome - 100000); 
        }

        return tax;
    }
}

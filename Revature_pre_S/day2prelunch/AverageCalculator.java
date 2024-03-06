
import java.util.Scanner;

public class AverageCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sum = 0;

        // Input 10 integers from the user
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter integer " + (i + 1) + ": ");
            int num = sc.nextInt();
            sum += num;
        }

        // Calculate the average
        double average = (double) sum / 10;

        // Print the average value
        System.out.println("Average value: " + average);

        sc.close();
    }
}


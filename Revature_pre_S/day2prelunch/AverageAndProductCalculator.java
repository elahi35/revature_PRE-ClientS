
import java.util.Scanner;

public class AverageAndProductCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int count = 0;
        long product = 1;

    
        System.out.println("Enter integers (press 'z' to quit):");
        while (true) {
            String input = scanner.next();

          
            if (input.equalsIgnoreCase("z")) {
                break;
            }

        
            try {
                int number = Integer.parseInt(input);
                sum += number;
                product *= number;
                count++;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter an integer or 'q' to quit.");
            }
        }

        
        if (count == 0) {
            System.out.println("No numbers entered.");
        } else {
           
            double average = (double) sum / count;

           
            System.out.println("Average: " + average);
            System.out.println("Product: " + product);
        }

        scanner.close();
    }
}

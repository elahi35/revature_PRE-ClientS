import java.util.Scanner;

public class AverageMain {

  public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first number:");
        double num1 = scanner.nextDouble();
        System.out.println("Enter the second number:");
        double num2 = scanner.nextDouble();
        System.out.println("Enter the third number:");
        double num3 = scanner.nextDouble();

        Average averageCalculator = new Average();

        averageCalculator.calculateAverage(num1, num2, num3);
        averageCalculator.printAverage();
  }
  
}

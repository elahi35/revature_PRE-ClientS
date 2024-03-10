import java.time.LocalDate;
import java.util.Scanner;

public class EmployeeMain {

  public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Employee[] employees = new Employee[10];

        for (int i = 0; i < employees.length; i++) {
            System.out.println("Enter details for Employee " + (i + 1) + ":");
            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.print("Salary: $");
            double salary = scanner.nextDouble();
            scanner.nextLine(); 
            System.out.print("Date of Joining (YYYY-MM-DD): ");
            String dateOfJoiningString = scanner.nextLine();
            LocalDate dateOfJoining = LocalDate.parse(dateOfJoiningString);

            employees[i] = new Employee(name, salary, dateOfJoining);
            System.out.println();
        }

        System.out.println("Employee Information:");
        for (Employee employee : employees) {
            employee.printEmployeeInfo();
        }

    }
  
}

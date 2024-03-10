public class EmployeeMain {
  public static void main(String[] args) {
    
    Employee employee[] = new Employee[3];
    employee[0] = new Employee("Robert", 1994, 50000, "64C- WallsStreet");
    employee[1] = new Employee("Sam", 2000, 60000, "68D- WallsStreet");
    employee[2] = new Employee("John", 1999, 55000, "26B- WallsStreet");

    System.out.printf("%-10s%-20s%-20s%-20s\n", "Name", "Year of Joining", "Salary", "Address");

    for (Employee employees : employee) {
      employees.printEmployeeInfo();
    }

  }
  
}

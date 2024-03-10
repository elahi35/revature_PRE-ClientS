import java.time.LocalDate;

class Employee {
  private String name;
  private double salary;
  private LocalDate dateOfJoining;

  public Employee(String name, double salary, LocalDate dateOfJoining) {
      this.name = name;
      this.salary = salary;
      this.dateOfJoining = dateOfJoining;
  }

  public void printEmployeeInfo() {
      System.out.println("Name: " + name);
      System.out.println("Salary: $" + salary);
      System.out.println("Date of Joining: " + dateOfJoining);
      System.out.println();
  }
}
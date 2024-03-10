public class Employee {
  private String name;
  private int yearOfJoining;
  private double salary;
  private String address;

  public Employee(String name, int yearOfJoining, double salary, String address) {
      this.name = name;
      this.yearOfJoining = yearOfJoining;
      this.salary = salary;
      this.address = address;
  }

  public void printEmployeeInfo() {
    System.out.printf("%-10s%-20s%-20s%-20s\n", name, yearOfJoining, salary, address);
  }
}
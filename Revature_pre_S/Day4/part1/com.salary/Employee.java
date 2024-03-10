public class Employee {
  private double salary;
  private int hoursOfWorkPerDay;

  public void getInfo(double salary, int hoursOfWorkPerDay) {
      this.salary = salary;
      this.hoursOfWorkPerDay = hoursOfWorkPerDay;
  }

  public void addSal() {
      if (salary < 500) {
          salary += 10;
      }
  }

  public void addWork() {
      if (hoursOfWorkPerDay > 6) {
          salary += 5;
      }
  }

  public void printFinalSalary() {
      System.out.println("Final Salary: $" + salary);
  }
}
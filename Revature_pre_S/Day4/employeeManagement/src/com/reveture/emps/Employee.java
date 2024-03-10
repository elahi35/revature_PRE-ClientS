package  com.reveture.emps;

public abstract class Employee {
    private int empId;
    private String name;
    private int daysPresent;
    private int basicSalary;

    public Employee() {
    }

    public Employee(int empId, String name, int daysPresent, int basicSalary) {
        this.empId = empId;
        this.name = name;
        this.daysPresent = daysPresent;
        this.basicSalary = basicSalary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", name='" + name + '\'' +
                ", daysPresent=" + daysPresent +
                ", basicSalary=" + basicSalary +
                '}';
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDaysPresent() {
        return daysPresent;
    }

    public void setDaysPresent(int daysPresent) {
        this.daysPresent = daysPresent;
    }

    public int getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(int basicSalary) {
        this.basicSalary = basicSalary;
    }

    public abstract int calculateSalary(int hoursWorked,int perHourPay);

    // public abstract int calculateTax(int rateofTax);
}
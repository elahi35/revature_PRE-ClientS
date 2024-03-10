package com.reveture.emps;
public class ContractualEmployee extends Employee{
    public ContractualEmployee() {
    }

    public ContractualEmployee(int empId, String name, int daysPresent, int basicSalary) {
        super(empId, name, daysPresent, basicSalary);
    }

    @Override
    public String toString() {
        return "ContractualEmployee{} " + super.toString();
    }

    public int calculateSalary(int hoursWorked,int perHourPay){

        return (hoursWorked*perHourPay);
    }


}
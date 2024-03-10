package com.reveture.emps;

public class EmployeeManager {
    public static void main(String[] args) {
        SalariedEmployee se1 = new SalariedEmployee(101,"Salaried Emp 101",20,800);
        ContractualEmployee ce1 = new ContractualEmployee(201,"Contractual emp 201",80,150);

        System.out.println(se1);
        System.out.println(ce1);
    }
}

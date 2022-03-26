package com.codewithmosh;


//class Employee {
//    public int baseSalary;
//    public int hourlyRate;
//
//    public int calculateWage(int extraHours) {
//        return baseSalary + (hourlyRate + extraHours);
//    }
//}


public class Wage {
    public static void main(String[] args) {
//        new Employee(0);
        com.codewithmosh.Employee employee = new com.codewithmosh.Employee(50_000,20);
//        employee.setBaseSalary(-1);
        employee.getBaseSalary();
//        employee.setHourlyRate(25);
        employee.getHourlyRate();
        int Wage = employee.calculateWage(10);
        System.out.println(Wage);
    }
}
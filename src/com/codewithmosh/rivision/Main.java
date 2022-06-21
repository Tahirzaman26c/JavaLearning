package com.codewithmosh.rivision;

public class Main {
    public static void main(String[] args) {
        var employee = new Employe(50_000,10);
//        employee.setBaseSalary(-1);
//        employee.setHourlyRate(20);
        int wage =employee.calculateWage(10);
        System.out.println(wage);

        }
}

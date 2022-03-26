package com.codewithmosh;

public class Employee {
    private int baseSalary;
    private int hourlyRate;

    public Employee(int baseSalary, int hourlyRate){
        setBaseSalary(baseSalary);
        setHourlyRate(hourlyRate);
    }

    public Employee(int baseSalary){
        this(baseSalary,0);
    }

    public int calculateWage(int extraHours) {
        return baseSalary + (hourlyRate + extraHours);
    }
    private void setBaseSalary(int baseSalary){
        if (baseSalary<= 0 )
            throw new IllegalArgumentException("Value cannot be 0 or less.");
        this.baseSalary = baseSalary;
    }
    public int getBaseSalary(){
        return baseSalary;
    }
    private void setHourlyRate(int hourlyRate){
        if (hourlyRate >= 12)
            throw new IllegalArgumentException("Hour cannot be more than 12. ");
        this.hourlyRate = hourlyRate;

    }
    public int getHourlyRate(){
        return hourlyRate;
    }

}

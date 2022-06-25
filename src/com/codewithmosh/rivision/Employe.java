package com.codewithmosh.rivision;

public class Employe {
    private int baseSalary;
    private int hourlyRate;

    public Employe(int baseSalary, int hourlyRate){
        this.setBaseSalary(baseSalary);
        this.setHourlyRate(hourlyRate);
    }


    public int calculateWage(int extraHour){
        return baseSalary+ (hourlyRate*extraHour);
    }
    public int calculateWage(){
        return baseSalary;
    }
    private void setBaseSalary(int baseSalary){
        if (baseSalary<=0)
            throw new IllegalArgumentException("BaseSalary cannot be zero or less");
        this.baseSalary=baseSalary;
    }
    private int getBaseSalary(){
        return baseSalary;
    }
    private void setHourlyRate(int hourlyRate){
        this.hourlyRate=hourlyRate;
    }
    private int getHourlyRate(){
        return hourlyRate;
    }

}

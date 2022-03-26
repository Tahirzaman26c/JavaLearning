package com.codewithmosh;

public class TaxCalculation2022 implements TaxCalculation {
    private double taxableIncome;

    public TaxCalculation2022(double taxableIncome) {
        this.taxableIncome = taxableIncome;
    }
    public double calculateTax(){
        return taxableIncome*0.3;
    }
}

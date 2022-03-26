package com.codewithmosh;


public class TaxReport {
    private TaxCalculation calculator;

    public TaxReport(TaxCalculation calculator){
        this.calculator = calculator;
    }

    public void show(){
        var tax = calculator.calculateTax();
        System.out.println(tax);
    }
    public void setCalculator(TaxCalculation calculator) {
        this.calculator = calculator;
    }
}

package com.codewithmosh.rivision;


public class TaxReport {
    public TaxCalculator calculator;

    //Constructor injection
//    public TaxReport(TaxCalculator calculator){
//        this.calculator = calculator;
//    }

    public void show(TaxCalculator calculator){
        var tax = calculator.calculateTax();
        System.out.println(tax);
    }

    // Setter injection
//    public void setCalculator(TaxCalculator calculator) {
//        this.calculator = calculator;
//    }
}

package com.codewithmosh.rivision;

public class Main {

    public static void main(String[] args) {
        var calculator = new TaxCalculator2018(100_000);
        var report  = new TaxReport();
        report.show(calculator);

//        report.setCalculator(new TaxCalculator2019());
//        report.show();




//        int principal = (int) console.readNumber("Principal: ", 1000, 1_000_000);
//        float annualInterest = (float) console.readNumber("Annual Interest Rate: ", 1, 30);
//        byte years = (byte) console.readNumber("Period (Years): ", 1, 30);
//
//        var calculator = new MortgageCalculator(principal,annualInterest,years);
//        var report = new MortgageReport(calculator);
//        report.printMortgage();
//        report.printPaymentSchedule();
    }

}

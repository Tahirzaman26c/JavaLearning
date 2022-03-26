package com.codewithmosh;

public class Main {
    public static void main(String[] args) {
        var calculator = new TaxCalculation2022(1000_000);
        var report = new TaxReport(calculator);
        report.show();
        report.setCalculator(new TaxCalculator2023());
        report.show();








//        var browser = new Browser();
//
//        UIControl[] controls = {new TextBox(), new CheckBox()};
//        for (var control : controls)
//            control.render();
    }
}


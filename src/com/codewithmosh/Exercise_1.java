package com.codewithmosh;// package com.codewithmosh;
import java.text.NumberFormat;
import java.util.Scanner;
    

// public class com.codewithmosh.Exercise_1 {

//     public static void main(String[] args) {
//         final byte MONTHS_IN_YEAR = 12;
//         final byte PERCENT = 100;

//         int principal = 0;
//         float annualInterest = 0;
//         float monthlyInterest;
//         int numberOfPayments = 0;

//         Scanner sc = new Scanner(System.in);

//         while(true){
//             System.out.print("Principal (1k-1M): ");
//             principal = sc.nextInt();
//             if(principal >=1000 && principal<= 1_000_000)
//                 break;
//             System.out.println("Enter the value between 1000 to 1_000_000");
//         }

//         while(true) {
//             System.out.print("Annual Interest Rate (): ");
//             annualInterest = sc.nextFloat();
//             if (annualInterest >=1 && annualInterest <=30){
//                 monthlyInterest = annualInterest / PERCENT / MONTHS_IN_YEAR;
//                 break;
//             }
//             System.out.println("Enter a value between 1 and 30 ");
            
//         }

//         while(true) {
//             System.out.print("Period (Years): ");
//             byte years = sc.nextByte();
//             if(years >=1 && years <=30){
//                 numberOfPayments = years * MONTHS_IN_YEAR;
//                 break;
//             }
//             System.out.println("Enter a value between 1 and 30 ");
            
//         }

//         double mortgage = principal
//                     * (monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayments))
//                     / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1);

//         String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
//         System.out.println("Mortgage: " + mortgageFormatted);
//     }
// }
    


// ---------------------------upgraded-----------------


// public class com.codewithmosh.Exercise_1 {

//     public static void main(String[] args) {
        

//         int principal = 0;
//         byte years = 0;
//         float annualInterest = 0;
//         // float monthlyInterest;
//         // int numberOfPayments = 0;

//         Scanner sc = new Scanner(System.in);

//         while(true){
//             System.out.print("Principal (1k-1M): ");
//             principal = sc.nextInt();
//             if(principal >=1000 && principal<= 1_000_000)
//                 break;
//             System.out.println("Enter the value between 1000 to 1_000_000");
//         }

//         while(true) {
//             System.out.print("Annual Interest Rate (): ");
//             annualInterest = sc.nextFloat();
//             if (annualInterest >=1 && annualInterest <=30)
//                 break;
            
//             System.out.println("Enter a value between 1 and 30 ");
            
//         }

//         while(true) {
//             System.out.print("Period (Years): ");
//             years = sc.nextByte();
//             if(years >=1 && years <=30)
//                 break;
            
//             System.out.println("Enter a value between 1 and 30 ");
            
//         }

//         double mortgage = mortgageCalculator(principal,annualInterest,years);

//         String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
//         System.out.println("Mortgage: " + mortgageFormatted);
//     }

//     public static double mortgageCalculator(int principal, float annualInterest,byte years){

//         final byte MONTHS_IN_YEAR = 12;
//         final byte PERCENT = 100;

//         short numberOfPayments = (short)(years * MONTHS_IN_YEAR);
//         float monthlyInterest = annualInterest / PERCENT / MONTHS_IN_YEAR;

//         double mortgage = principal
//                     * (monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayments))
//                     / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1);
//         return mortgage;

//     }
// }


// -----------------------------upgraded--------------------------


public class Exercise_1 {
    final static byte MONTHS_IN_YEAR = 12;
    final static byte PERCENT = 100;

    public static void main(String[] args) {
        

        // int principal = 0;
        // byte years = 0;
       
        // float annualInterest = 0;
        // float monthlyInterest;
        // int numberOfPayments = 0;

        int principal =(int) readNumber("Principal ",1000,1_000_000);
        float annualInterest =(float)readNumber("Annual Interest Rate: ", 1,30);
        byte years = (byte) readNumber("Years: ", 1,30);

        printMortgage(principal, annualInterest, years);


        extracted(principal, annualInterest, years);



    }
    private static void printMortgage(int principal, float annualInterest, byte years) {
        double mortgage = mortgageCalculator(principal,annualInterest,years);
        System.out.println("MORTGAGE");
        System.out.println("--------------");
        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println("Monthly balance: " + mortgageFormatted);
    }
    private static void extracted(int principal, float annualInterest, byte years) {
        System.out.println("REMAINING BALANCE");
        for (short month=1;month<=(years* MONTHS_IN_YEAR);month++){
            double balance = paymentSchedule(principal,annualInterest,years, month);
            System.out.println(balance);
        }
    }
    public static double readNumber(String prompt, double min, double max) {
        Scanner sc = new Scanner(System.in);
        double value;
        while(true) {
            System.out.print(prompt);
            
            value = sc.nextFloat();
            if (value >=min && value <=max)
                break;
            
            System.out.println("Enter a value between " + min + " and " + max);
            
        }
        return value;
    }

    public static double mortgageCalculator(int principal, float annualInterest,byte years){


        short numberOfPayments = (short)(years * MONTHS_IN_YEAR);
        float monthlyInterest = annualInterest / PERCENT / MONTHS_IN_YEAR;

        double mortgage = principal
                    * (monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayments))
                    / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1);
        return mortgage;

    }
    public static double paymentSchedule(int principal,float annualInterest,byte years,short numberOfPaymentsMade){

        float monthlyInterest = annualInterest / PERCENT / MONTHS_IN_YEAR;
        short numberOfPayments = (short)(years * MONTHS_IN_YEAR);

        double balance = principal
                * (Math.pow(1 + monthlyInterest, numberOfPayments) - Math.pow(1 + monthlyInterest, numberOfPaymentsMade))
                / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1);
        return balance;
        
    }
}
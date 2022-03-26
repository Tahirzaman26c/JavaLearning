package com.codewithmosh.exceptions;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        var account = new Account();
        try {
            account.withdraw(10);
        } catch (AccountException e) {
            var cause = e.getCause();
            System.out.println(cause.getMessage());
        }
//        try {
//            account.deposit(1);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        ExceptionsDemo.show();
    }
}

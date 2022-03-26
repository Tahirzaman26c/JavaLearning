package com.codewithmosh.exceptions;

public class InsufficientFundsException extends Exception{
    public InsufficientFundsException(String message){
        super(message);
    }
    public InsufficientFundsException(){
        super("Insufficient Funds in your Account !!");
    }
}

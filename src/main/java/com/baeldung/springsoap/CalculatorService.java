package com.baeldung.springsoap;

public class CalculatorService {
    public double calculate(double num1, double num2, String operator) {
        if(operator.equals("+")) {
            return num1 + num2;
        } 
        else if(operator.equals("-")) {
            return num1 - num2;
        } 
        else if(operator.equals("*")) {
            return num1 * num2;
        } 
        else if(operator.equals("/")) {
            if(num2 == 0) {
                throw new IllegalArgumentException("Can't divide by 0");
            } else {
                return num1 / num2;
            }
        } 
        else if (operator.equals("^")) {
            return (double) Math.pow(num1, num2);
        }
        else {
            throw new IllegalArgumentException("Invalid calculation");
        }
    }
}

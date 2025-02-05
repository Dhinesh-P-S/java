package com.wipro.java.exception;

public class UncheckedException {
    public static void main(String[] args) {
        try {
            // Attempting to divide by zero
            int result = 10 / 0;
        } catch (ArithmeticException e) {
            // Handling the unchecked exception
            System.out.println("ArithmeticException occurred: " + e.getMessage());
        }
    }
}
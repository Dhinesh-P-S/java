/**
 * 
 */
package com.wipro.java.exception;
/**
 * 
 */
public class ExceptionHandling {
    public static void main(String[] args) {
        try {
            int num1 = 10, num2 = 0;
            int result = num1 / num2; // This will cause ArithmeticException
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
        }
        finally {
        	System.out.println("Always executed");
        }
        try {
            int[] arr = {1, 2, 3};
            System.out.println(arr[5]); // This will cause ArrayIndexOutOfBoundsException
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Array index is out of bounds.");
        }
        finally {
        	System.out.println("Always executed");
        }
        System.out.println("Program execution completed.");
    }
}


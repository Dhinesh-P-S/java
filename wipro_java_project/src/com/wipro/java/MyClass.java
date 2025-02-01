/**
 * 
 */
package com.wipro.java;

/**
 * 
 */
public class MyClass {
    int num = 5;
    
    public void changeValue(int num) {
        this.num = num;
    }
    public static void main(String[] args) {
        MyClass obj = new MyClass(); // object creation
        obj.changeValue(10); // method calling
        System.out.println(obj.num);
    }
}

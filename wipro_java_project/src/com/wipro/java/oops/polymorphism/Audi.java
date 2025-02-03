/**
 * 
 */
package com.wipro.java.oops.polymorphism;

import com.wipro.java.oops.inheritance.Car;

/**
 * 
 */
public class Audi extends Car {
	public void carName() {
		System.out.println("X8");
	}
	public void carColour() {
		System.out.println("Blue");
	}
	public void carYear() {
		System.out.println(2010);
	}
	
	public static void main(String[] args) {
		Car car = new Audi();
		car.carName();
		car.carColour();
		car.carYear();
	}
}
/**
 * 
 */
package com.wipro.java.oops.inheritance;

/**
 * 
 */
public class Nissan extends Car {
	public void carName() {
		System.out.println("GTR");
	}
	public void carColour() {
		System.out.println("Red");
	}
	public void carYear() {
		System.out.println(2020);
	}
	
	public static void main(String[] args) {
		Car car = new Nissan();
		car.carName();
		car.carColour();
		car.carYear();
	}
}
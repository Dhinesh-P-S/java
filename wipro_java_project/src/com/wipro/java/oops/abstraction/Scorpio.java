/**
 * 
 */
package com.wipro.java.oops.abstraction;

/**
 * 
 */
public class Scorpio extends Car {
	public void carType() {
		System.out.println("SUV");
	}
	public void seats() {
		System.out.println(7);
	}
	public void mileage() {
		System.out.println(20);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car = new Scorpio();
		car.carType();
		car.seats();
		car.mileage();
	}

}

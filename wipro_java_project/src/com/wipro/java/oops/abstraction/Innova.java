/**
 * 
 */
package com.wipro.java.oops.abstraction;

/**
 * 
 */
public class Innova extends Car {
	public void carType() {
		System.out.println("SUV");
	}
	public void seats() {
		System.out.println(8);
	}
	public void mileage() {
		System.out.println(25);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car = new Innova();
		car.carType();
		car.seats();
		car.mileage();
	}

}

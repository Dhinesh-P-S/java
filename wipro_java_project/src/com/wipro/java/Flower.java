/**
 * 
 */
package com.wipro.java;

/**
 * 
 */
public class Flower {

	/**
	 * 
	 */
	String name;
	String colour;
	int count;
	public Flower(String name, String colour, int count) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.colour = colour;
		this.count = count;		
	}
	void display()
	{
		System.out.println("Flower name : " + name);
		System.out.println("Flower colour : " + colour);
		System.out.println("Flower count : " + count);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Flower flower1 = new Flower("Rose", "Red", 7);
		Flower flower2 = new Flower("Lotus", "Pink", 18);
		Flower flower3 = new Flower("Lily", "White", 24);
		flower1.display();
		flower2.display();
		flower3.display();
		
	}

}

/**
 * 
 */
package com.wipro.java.oops.encapsulation;

/**
 * 
 */
public class Animal {

	/**
	 * 
	 */
	private String name;
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if(age > 0)
			this.age = age;
		else
			System.out.println("Age cannot be less than 0");
	}

	private String type;
	private int age;
	public Animal(String name, String type, int age) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.age = age;
		this.type = type;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal animal1 = new Animal("Tiger", "Wild", 20);
		Animal animal2 = new Animal("Dog", "Domestic", 12);
		
		System.out.println(animal1.name);
		System.out.println(animal1.type);
		System.out.println(animal1.age);
		
		System.out.println(animal2.name);
		System.out.println(animal2.type);
		System.out.println(animal2.age);
		
		animal1.setName("Lion");
		animal2.setName("Cat");
		animal1.setAge(24);
		animal2.setAge(7);
		
		System.out.println(animal1.name);
		System.out.println(animal1.type);
		System.out.println(animal1.age);
		
		System.out.println(animal2.name);
		System.out.println(animal2.type);
		System.out.println(animal2.age);
		
	}

}

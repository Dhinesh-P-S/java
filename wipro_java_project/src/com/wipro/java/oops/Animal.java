/**
 * 
 */
package com.wipro.java.oops;

/**
 * 
 */
public class Animal {

	/**
	 *  Properties of POJO
	 *  No constructor
	 *  getters have value
	 *  setters have no value
	 *  Properties are determined using private fields
	 *  Values or behaviors are determined through setters
	 *  toString will convert the animal class with properties and behaviors
	 */
	private String name; //animal name
	private int age; // animal age
	private String type; // whether domestic or wild
	private float height; // weight of animal
	private float weight; // height of animal
	
	public float getHeight() {
		return height;
	}

	public void setHeight(float height) {
		this.height = 5.5f;
	}

	public float getWeight() {
		return weight;
	}

	public void setWeight(float weight) {
		this.weight = 120.4f;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = "Tiger";
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = 24;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = "Wild";
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

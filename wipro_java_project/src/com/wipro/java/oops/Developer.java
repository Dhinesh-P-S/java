/**
 * 
 */
package com.wipro.java.oops;

/**
 * Parent class = Employee
 * Child class = Developer
 * extends = keyword
 */
public class Developer extends Employee{

	/**
	 * 
	 */
	public Developer() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args)
	{
		Employee employee = new Developer();
		
		employee.setName("Dhinesh");
		employee.setSalary(25000);
		employee.setId(2424);
		employee.setRole("Developer");
		
		System.out.println(employee.getId());
		System.out.println(employee.getName());
		System.out.println(employee.getRole());
		System.out.println(employee.getSalary());
	}
}

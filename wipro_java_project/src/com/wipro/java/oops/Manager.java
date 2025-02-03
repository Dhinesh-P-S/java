/**
 * 
 */
package com.wipro.java.oops;

/**
 * Parent class = Employee
 * Child class = Manager
 * extends = keyword
 */
public class Manager extends Employee{

	/**
	 * 
	 */
	public Manager() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args)
	{
		Employee employee = new Manager();
		
		employee.setName("Dhinesh");
		employee.setSalary(30000);
		employee.setId(1111);
		employee.setRole("Manager");
		
		System.out.println(employee.getId());
		System.out.println(employee.getName());
		System.out.println(employee.getRole());
		System.out.println(employee.getSalary());
	}
}

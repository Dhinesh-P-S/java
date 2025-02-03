/**
 * 
 */
package com.wipro.java.oops;

/**
 * Parent class = Employee
 * Child class = ProjectLead
 * extends = keyword
 */
public class ProjectLead extends Employee{

	/**
	 * 
	 */
	public ProjectLead() {
		// TODO Auto-generated constructor stub
	}
	
public static void main(String[] args)
{
	Employee employee = new ProjectLead();
	
	employee.setName("Dhinesh");
	employee.setSalary(40000);
	employee.setId(1234);
	employee.setRole("Project Lead");
	
	System.out.println(employee.getId());
	System.out.println(employee.getName());
	System.out.println(employee.getRole());
	System.out.println(employee.getSalary());
}

}

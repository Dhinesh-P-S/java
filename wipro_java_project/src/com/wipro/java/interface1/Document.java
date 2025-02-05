/**
 * 
 */
package com.wipro.java.interface1;

/**
 * 
 */
public class Document implements Print, Show{

	public void show() {
		System.out.println("Showing Document");
	}
	
	public void print() {
		System.out.println("Printing Document");
	}
	/**
	 * 
	 */


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Document document = new Document();
		document.show();
		document.print();
		
	}

}

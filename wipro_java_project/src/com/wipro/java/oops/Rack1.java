/**
 * 
 */
package com.wipro.java.oops;

/**
 * 
 */
public class Rack1 extends Library {
	
	private int rackNo;
	private String bookName;
	private int noOfBooks;


	public void rackNo() {
		System.out.println("Rack No : " + rackNo);
	}
	public void bookName() {
		System.out.println("Book Name : " + bookName);
	}
	public void noOfBooks() {
		System.out.println("Number of Books : " + noOfBooks);
	}
	public void libraryName() {
		System.out.println("Chennai Library");
	}

	/**
	 * 
	 */
	public Rack1(int rackNo, String bookName, int noOfBooks) {
		// TODO Auto-generated constructor stub
		this.rackNo = rackNo;
		this.bookName = bookName;
		this.noOfBooks = noOfBooks;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Library library = new Rack1(1, "Harry Potter", 7);
		library.libraryName();
		library.rackNo();
		library.bookName();
		library.noOfBooks();
		
	}

}

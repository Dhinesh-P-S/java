/**
 * 
 */
package com.wipro.java.oops.polymorphism;

/**
 * 
 */
public class Mario extends Game{

	/**
	 * 
	 */
	String platform = "Playstation";
	String name = "Mario";
	int size = 100;
	
	public void gameName() {
		System.out.println("Game Name : " + name);
	}
	
	public void gameSize() {
		System.out.println("Game Size : " + size + "MB");
	}
	
	public void gamePlatform() {
		System.out.println("Game Platform : " + platform);
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Game game = new Mario();
		game.gameName();
		game.gamePlatform();
		game.gameSize();
	}

}

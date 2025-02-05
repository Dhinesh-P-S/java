/**
 * 
 */
package com.wipro.java.oops.polymorphism;

/**
 * 
 */
public class CallOfDuty extends Game {

	/**
	 * 
	 */
	int size = 150;
	
	public void gameSize() {
		System.out.println("Game Size : " + size + "GB");
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Game game = new CallOfDuty();
		game.gameName();
		game.gamePlatform();
		game.gameSize();
	}

}

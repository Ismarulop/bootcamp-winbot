package com.daniel.bootcamp.pruebaSpring.game;

public class GameRunner {
	
	private GamingConsole game;
	
	public GameRunner (GamingConsole game) {
		this.game = game;
	}

	public void run() {
		// TODO Auto-generated method stub
		game.up();
		game.down();
		game.right();
		game.left();
	}
	

}

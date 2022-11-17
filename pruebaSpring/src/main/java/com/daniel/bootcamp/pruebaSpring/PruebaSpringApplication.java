package com.daniel.bootcamp.pruebaSpring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.daniel.bootcamp.pruebaSpring.game.GameRunner;
import com.daniel.bootcamp.pruebaSpring.game.GamingConsole;
import com.daniel.bootcamp.pruebaSpring.game.MarioGame;

@SpringBootApplication
public class PruebaSpringApplication {

	public static void main(String[] args) {
		//SpringApplication.run(PruebaSpringApplication.class, args);
		GamingConsole game= new MarioGame();
		GameRunner runner = new GameRunner(game);
		runner.run();
		
	}

}

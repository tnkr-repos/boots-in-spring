package com.in28minutes.learn_spring_framework;

import com.in28minutes.learn_spring_framework.game.GameRunner;
import com.in28minutes.learn_spring_framework.game.GamingConsole;
import com.in28minutes.learn_spring_framework.game.MarioGame;
import com.in28minutes.learn_spring_framework.game.PacmanGame;
import com.in28minutes.learn_spring_framework.game.SuperContraGame;

public class AppGamingBasicJava {
    public static void main(String[] args) {
        
        // var marioGame = new MarioGame();
        // var gameRunner = new GameRunner(marioGame);
        
        // var superContraGame = new SuperContraGame();
        // var gameRunner = new GameRunner(superContraGame);

        // var pacmanGame = new PacmanGame();
        // var gameRunner = new GameRunner(pacmanGame);

        var game = new MarioGame();
        // var game = new SuperContraGame();
        // var game = new PacmanGame();
        GameRunner gameRunner = new GameRunner(game);
        gameRunner.run();
    }
}

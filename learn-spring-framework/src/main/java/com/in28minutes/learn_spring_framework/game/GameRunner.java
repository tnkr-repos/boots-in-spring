package com.in28minutes.learn_spring_framework.game;

public class GameRunner {

    private MarioGame marioGame;
    public GameRunner(MarioGame marioGame) {
        //TODO Auto-generated constructor stub
        this.marioGame = marioGame;
    }

    // private SuperContraGame superContraGame;
    // public GameRunner(SuperContraGame superContraGame) {
    //     this.superContraGame = superContraGame;
    // }

    // private PacmanGame pacmanGame;
    // public GameRunner(PacmanGame pacmanGame) {
    //     this.pacmanGame = pacmanGame;
    // }


    public void run() {

        System.out.println("\n***************\nRunning Game: " + 
                            marioGame + 
                            "\n***************\n");
        marioGame.up();
        marioGame.down();
        marioGame.left();
        marioGame.right();

        // System.out.println("\n***************\nRunning Game: " + 
        //                     superContraGame + 
        //                     "\n***************\n");
        // superContraGame.up();
        // superContraGame.down();
        // superContraGame.left();
        // superContraGame.right();

        // System.out.println("\n***************\nRunning Game: " + 
        //                     pacmanGame + 
        //                     "\n***************\n");
        // pacmanGame.up();
        // pacmanGame.down();
        // pacmanGame.left();
        // pacmanGame.right();
    }

}

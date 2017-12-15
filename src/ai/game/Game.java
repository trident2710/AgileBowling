/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ai.game;

import ai.score.IScore;

/**
 *
 * defines the common interface for different types of games
 * @author trident
 */
public interface Game {
    
    /**
     * how many points can user get during one turn
     */
    int MAX_SCORE_TURN=10;
    
    /**
     * process one turn of the game 
     * 
     * @return 
     *  true if it was the last turn and the game is finished
     *  false if it was not the last turn
     * 
     */
    boolean processTurn();
    
    /**
     * get the current score of this game
     * @return the score of the game
     */
    IScore getScore();
    
    
}

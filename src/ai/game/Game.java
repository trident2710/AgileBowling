/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ai.game;

import ai.score.IScore;

/**
 *
 * @author trident
 */
public interface Game {
    
    int MAX_SCORE_TURN=10;
    boolean processTurn();
    IScore getScore();
    
    
}
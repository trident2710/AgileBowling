/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ai.game;

import ai.score.IScore;

/**
 *
 * defines the game of type "Turnament"
 * The winner is the player with the highest core after the last turn
 * @author souissi
 */
public class TurnGame implements Game{

    @Override
    public boolean processTurn() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public IScore getScore() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}

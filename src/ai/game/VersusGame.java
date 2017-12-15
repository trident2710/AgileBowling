/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ai.game;

import ai.score.IScore;

/**
 * defines the game of type versus where the human player is playing against one AI player
 * The winner is the player with the highest score after the last turn
 * @author trident
 */
public class VersusGame implements Game{
    @Override
    public String toString(){
        return this.getClass().getSimpleName();
    }

    @Override
    public boolean processTurn() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public IScore getScore() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    
}

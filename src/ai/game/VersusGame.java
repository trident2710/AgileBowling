/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ai.game;

import ai.game.Game;
import ai.score.IScore;

/**
 *
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

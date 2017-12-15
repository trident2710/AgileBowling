/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ai.score;

import ai.player.IPlayer;

/**
 * defines the score of the team game
 * should represent the scores of each player and the total score of 2 participant teams
 * 
 * @author souissi
 */
public class TeamScore implements IScore{

    @Override
    public String afficherScore() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean hasPlayerWon() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void updateForPlayer(IPlayer player, int newScore) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}

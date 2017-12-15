/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ai.score;

import ai.player.IPlayer;

/**
 *
 * defines the abstraction for the score in the bowling game
 * @author souissi
 */
public interface IScore {
    /**
     * add the points to the total points of the player
     * @param player 
     * @param newScore - value which should be added to the total score of the player
     */
    void updateForPlayer(IPlayer player, int newScore);
    
    /**
     * 
     * @return string that represents this score
     */
    String afficherScore();
    
    /**
     * defines if the player has already won in this game
     * @return 
     */
    boolean hasPlayerWon();
    
}

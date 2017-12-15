/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ai.score;

/**
 *
 * defines the abstraction for the score in the bowling game
 * @author souissi
 */
public interface IScore {
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

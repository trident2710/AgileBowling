/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ai.player;

/**
 * defines the abstraction of the bowling player
 * @author trident
 */
public interface IPlayer {
    /**
     * simulates the the turn of this user
     * @return how many points he has got <= @see Game.MAX_SCORE_TURN
     */
    int lancer();
    
}

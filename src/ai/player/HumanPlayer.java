/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ai.player;

import ai.game.Game;
import java.util.Random;

/**
 *
 * @author souissi
 */
public class HumanPlayer implements IPlayer{
    private Random r;
  
    public HumanPlayer()
    {
        r=new Random();
    }
            
    @Override
    public int lancer() {
        return r.nextInt(1+Game.MAX_SCORE_TURN);           
    }
    
}

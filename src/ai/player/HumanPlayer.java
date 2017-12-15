/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ai.player;

import ai.game.Game;
import java.util.Random;

/**
 *
 * simulates the player controlled by human
 * @author souissi
 */
public class HumanPlayer implements IPlayer{
    
    private String name;
    private Random r;
  
    public HumanPlayer(String name)
    {
        this.name = name;
        r=new Random();
    }
            
    @Override
    public int lancer() {
        return r.nextInt(1+Game.MAX_SCORE_TURN);           
    }
    
    @Override
    public String toString(){
        return this.getClass().getSimpleName()+" with name "+name;
    }
    
}

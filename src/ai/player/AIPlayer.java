/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ai.player;

import ai.game.Game;
import ai.settings.GameDifficulty;
import java.util.Random;

/**
 *
 * @author souissi
 */
public class AIPlayer implements IPlayer{
    private Random r;
    private GameDifficulty niv;
    
    public AIPlayer(GameDifficulty n)
    {
        niv=n;
        r=new Random();
    }
            
    @Override
    public int lancer() {
        if (niv==GameDifficulty.EASY)
            return r.nextInt(1 + Game.MAX_SCORE_TURN/2);
        else
            return 5+r.nextInt(1+Game.MAX_SCORE_TURN/2);
            
        
    }
    
}

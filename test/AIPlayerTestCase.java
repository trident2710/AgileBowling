
import ai.GameFabricImpl;
import ai.game.Game;
import ai.game.VersusGame;
import ai.player.AIPlayer;
import ai.player.IPlayer;
import ai.settings.GameDifficulty;
import junit.framework.Assert;
import junit.framework.TestCase;
import org.junit.Test;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author trident
 */
public class AIPlayerTestCase extends TestCase{
    
    @Test
    public void testEasyPlayer(){
        IPlayer player  = new AIPlayer(GameDifficulty.EASY);
        for(int i = 0;i < 10; i++){
            int score  = player.lancer();
            Assert.assertTrue(score>=0&&score<=Game.MAX_SCORE_TURN/2);
        }   
    }
    
    @Test
    public void testHardPlayer(){
        IPlayer player  = new AIPlayer(GameDifficulty.HARD);
        for(int i = 0;i < 10; i++){
            int score  = player.lancer();
            Assert.assertTrue(score>=Game.MAX_SCORE_TURN/2&&score<=Game.MAX_SCORE_TURN);
        }   
    }
    
}

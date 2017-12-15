
import agilebowling.data.DatabaseReader;
import ai.GameFabric;
import ai.GameFabricImpl;
import ai.game.Game;
import ai.game.VersusGame;
import ai.settings.GameDifficulty;
import junit.framework.Assert;
import junit.framework.TestCase;
import org.junit.Before;
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
public class GameFabricTestCase extends TestCase{
    GameFabric gf;
    
    
    @Test
    public void testVersus(){
        gf = new GameFabricImpl();
        Assert.assertTrue(gf.createVersusGame(null, GameDifficulty.EASY) instanceof VersusGame);
    }
    
    @Test
    public void assert10TurnsAtLeast(){
        gf = new GameFabricImpl();
        Game g = new VersusGame();
        for(int i=0;i<10;i++) {            
            Assert.assertTrue(!g.processTurn());
        }
    }
    
}

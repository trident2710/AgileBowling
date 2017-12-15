
import agilebowling.data.DatabaseReader;
import ai.GameFabric;
import ai.GameFabricImpl;
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
    
}

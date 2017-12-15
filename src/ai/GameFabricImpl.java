/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ai;

import agilebowling.data.User;
import ai.settings.GameDifficulty;

/**
 *
 * @author trident
 */
public class GameFabricImpl implements GameFabric{

    @Override
    public Game createVersusGame(User user, GameDifficulty difficulty) {
        return new VersusGame();
    }
    
}

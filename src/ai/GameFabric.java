/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ai;

import ai.game.Game;
import agilebowling.data.User;
import ai.settings.GameDifficulty;

/**
 * abstract factory pattern for creating the different types of games
 * @author trident
 */
public interface GameFabric {
    /**
     * create game of type "Versus"
     * @param user
     * @param difficulty
     * @return VersusGame
     */
    Game createVersusGame(User user, GameDifficulty difficulty);
}

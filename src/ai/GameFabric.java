/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ai;

import agilebowling.data.User;
import ai.settings.GameDifficulty;
import ai.settings.GameType;

/**
 *
 * @author trident
 */
public interface GameFabric {
    Game createVersusGame(User user, GameDifficulty difficulty);
}

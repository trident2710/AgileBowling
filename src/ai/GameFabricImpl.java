/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ai;

import ai.game.VersusGame;
import ai.game.Game;
import agilebowling.data.User;
import ai.game.TurnGame;
import ai.player.HumanPlayer;
import ai.settings.GameDifficulty;

/**
 *
 * @author trident
 */
public class GameFabricImpl implements GameFabric{

    @Override
    public Game createVersusGame(User user, GameDifficulty difficulty) {
        return new VersusGame(new HumanPlayer(user.getUsername()),difficulty);
    }

    @Override
    public Game createTournamentGame(User user, GameDifficulty difficulty, int tournSize) {
        return new TurnGame(new HumanPlayer(user.getUsername()), tournSize, difficulty);
    }
    
}

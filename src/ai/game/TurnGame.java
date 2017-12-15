/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ai.game;

import ai.player.AIPlayer;
import ai.player.IPlayer;
import ai.score.IScore;
import ai.settings.GameDifficulty;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * defines the game of type "Turnament"
 * The winner is the player with the highest core after the last turn
 * @author souissi
 */
public class TurnGame implements Game{
    
    private IPlayer player;
    private Set<IPlayer> computers;
    private GameDifficulty difficulty;
    private int playersCount;
    
    public TurnGame(IPlayer player, int playersCount, GameDifficulty difficulty){
        this.player = player;
        this.difficulty = difficulty;
        this.playersCount = playersCount;
        computers = new HashSet<>();
        generatePlayers(playersCount-1);
    }
    
    private void generatePlayers(int playersCount){
        for(int i=0;i<playersCount;i++){
            computers.add(new AIPlayer(difficulty));
        }
    }

    @Override
    public boolean processTurn() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public IScore getScore() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}

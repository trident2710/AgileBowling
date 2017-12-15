/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ai.game;

import ai.player.AIPlayer;
import ai.player.IPlayer;
import ai.score.IScore;
import ai.score.TurnScore;
import ai.settings.GameDifficulty;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.TimeUnit;

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
    private IScore score;
    private int currentTurn;
    
    public TurnGame(IPlayer player, int playersCount, GameDifficulty difficulty){
        this.player = player;
        this.difficulty = difficulty;
        this.playersCount = playersCount;
        computers = new HashSet<>();
        generatePlayers(playersCount-1);
        this.score = new TurnScore(player);
        this.currentTurn = 0;
    }
    
    private void generatePlayers(int playersCount){
        for(int i=0;i<playersCount;i++){
            computers.add(new AIPlayer(difficulty));
        }
    }

    @Override
    public boolean processTurn() {
        for(IPlayer pl: computers){
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException ex) {
                
            }
            System.out.println("Processing turn of the player "+pl);
            int val = pl.lancer();
            System.out.println("He got "+val+ " points");
            score.updateForPlayer(pl, val);
        }
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException ex) {

        }
        System.out.println("Processing turn of the player "+player);
        int val = player.lancer();
        System.out.println("You got "+val+ " points");
        score.updateForPlayer(player, val);
        currentTurn++;
        return !(currentTurn<Game.MAX_TURNS);
    }

    @Override
    public IScore getScore() {
        return score;
    }
    
}

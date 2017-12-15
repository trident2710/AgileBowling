/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ai.game;

import ai.player.AIPlayer;
import ai.player.IPlayer;
import ai.score.IScore;
import ai.score.VersusScore;
import ai.settings.GameDifficulty;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.concurrent.TimeUnit;

/**
 * defines the game of type versus where the human player is playing against one AI player
 * The winner is the player with the highest score after the last turn
 * @author trident
 */
public class VersusGame implements Game{
    
    private IPlayer human;
    private IPlayer enemy;
    private IScore score;
    private int currentTurn;
    
    public VersusGame(IPlayer human, GameDifficulty difficulty){
        this.human = human;
        this.enemy = new AIPlayer(difficulty);
        this.score = new VersusScore(human);
        this.currentTurn = 0;
    }
    
    @Override
    public String toString(){
        return this.getClass().getSimpleName() + human + " vs "+ enemy;
    }

    @Override
    public boolean processTurn() {
        System.out.println("1 pour lancer, 2 pour arreter");
        BufferedReader br3= new BufferedReader(new InputStreamReader(System.in));
        try {
            String choix = br3.readLine();
            switch(choix){
                
                case "2":
                    return true;
                default:
                case "1":
                    System.out.println("Processing turn of the player "+human);
                    int val = human.lancer();
                    System.out.println("You got "+val+ " points");
                    score.updateForPlayer(human, val);
                    break;
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        
        
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException ex) {

        }
        System.out.println("Processing turn of the player "+enemy);
        int vale = enemy.lancer();
        System.out.println("He got "+vale+ " points");
        score.updateForPlayer(enemy, vale);
        
        currentTurn++;
        return !(currentTurn<Game.MAX_TURNS);
        
    }

    @Override
    public IScore getScore() {
        return score;
    }
    
    
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ai.score;

import ai.player.IPlayer;
import java.util.HashMap;
import java.util.Map;

/**
 * defines the score of the tournament game
 * should represent the score of each participant of the tournament
 * @author souissi
 */
public class TurnScore implements IScore{
    private IPlayer player;
    private Map<IPlayer,Integer> scores;
    
    public TurnScore(IPlayer player){
        this.scores = new HashMap<>();
        this.player = player;
    }

    @Override
    public String afficherScore() {
        return toString();
    }

    @Override
    public boolean hasPlayerWon() {
        if(!scores.containsKey(player)) return false;
        
        int max = 0;
        for(Integer i:scores.values()){
            if(i>max) max = i;
        }
        return scores.get(player)>max;
    }

    @Override
    public void updateForPlayer(IPlayer player, int newScore) {
        if(scores.containsKey(player))
            scores.replace(player, scores.get(player)+newScore);
        else
           scores.put(player,newScore); 
    }
    
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Tournament score: \n");
        for(Map.Entry<IPlayer,Integer> e: scores.entrySet()){
            sb.append(e.getKey()).append(" ").append(e.getValue()).append(" points\n");
        }
        return sb.toString();
    }
    
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ai.game;

import ai.score.IScore;

/**
 * defines the "Team" type of game where 2 teams are playing
 * The winner is the team with the highest total score (sum of scores of participants)
 * @author souissi
 */
public class TeamGame implements Game{

    @Override
    public boolean processTurn() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public IScore getScore() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}

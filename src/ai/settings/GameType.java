/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ai.settings;

/**
 * defines the game type
 * @author trident
 */
public enum GameType {
    VERSUS, //game 1 vs 1 i.e. player vs computer
    TURNAMENT, // game in turnament i.e. player vs n computers
    TEAM, // game in team i.e. one team (including player and computers) vs other team (of computers)
}

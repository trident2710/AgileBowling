/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agilebowling.data;

/**
 *
 * @author trident
 */
public class User {
    private final String username;
    private final String password;
    private int gamesPlayed;
    private int gamesWon;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
        this.gamesPlayed = 0;
        this.gamesWon = 0;
    }

    public User(String username, String password, int gamesPlayed, int gamesWon) {
        this.username = username;
        this.password = password;
        this.gamesPlayed = gamesPlayed;
        this.gamesWon = gamesWon;
    }
    
    public int getGamesPlayed() {
        return gamesPlayed;
    }

    public void setGamesPlayed(int gamesPlayed) {
        this.gamesPlayed = gamesPlayed;
    }

    public int getGamesWon() {
        return gamesWon;
    }

    public void setGamesWon(int gamesWon) {
        this.gamesWon = gamesWon;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
    
    public String getScoreReport(){
        StringBuilder sb = new StringBuilder();
        sb.append("login: ").append(getUsername()).append("\n");
        sb.append("Jeux joué: ").append(getGamesPlayed()).append("\n");
        sb.append("Jeux gagné: ").append(getGamesPlayed()).append("\n");
        return sb.toString();
    }
    
    @Override
    public boolean equals(Object other){
        if(other instanceof User) return false;
        User u = (User)other;
        return  u.getUsername().equals(this.username)&&u.getPassword().equals(this.password);
    }
}

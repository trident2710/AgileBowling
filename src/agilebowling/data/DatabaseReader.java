/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agilebowling.data;

import agilebowling.utils.Tuple;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author trident
 */
public class DatabaseReader {
    private static final String DATABASE_PATH = "users.db";
    
    private static  DatabaseReader instance = new DatabaseReader();
    
    private Set<User> userData;
    
    private DatabaseReader(){
        userData = new HashSet<>();
        
    }
    
    public static DatabaseReader getInstance(){
        return instance;
    }
    
    private void readData(){
        BufferedReader r = null;
        try {
            File f = new File(DATABASE_PATH);
            r = new BufferedReader(new FileReader(f));
            String line   = r.readLine();
            while (line !=null) {                
                String[] data = line.split(" ");
                userData.add(new User(data[0], data[1], Integer.parseInt(data[2]),Integer.parseInt(data[3])));
                line = r.readLine();
            }
        } catch (Exception ex) {
            
        } finally {
            try {
                r.close();
            } catch (IOException ex) {
                
            }
        }
    }
    
    public void saveAll(){
        PrintWriter r = null;
        try {
            File f = new File(DATABASE_PATH);
            r = new PrintWriter(new BufferedWriter(new FileWriter(f)));
            for(User u: userData){
                r.append(u.getUsername()+" "+u.getPassword()+" "+u.getGamesPlayed()+" "+u.getGamesWon()+"\n");
            }
            
        } catch (Exception ex) {
            
        } finally {
            r.close();
        }
    }
    
    public Set<User> getUsers(){
        if(userData.isEmpty())
            readData();
        return userData;
    }
    
    public void addUser(String username, String password){
        userData.add(new User(username, password));
        saveAll();
    }
    
    public User findByName(String username){
        if(userData.isEmpty())
            readData();
        for(User u: userData){
            if(u.getUsername().equals(username))
                return u;
        }
        return null;
    }
    
    public void deleteUser(String username){
        userData.remove(findByName(username));
        saveAll();
    }
}

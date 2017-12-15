/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agilebowling;

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
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author trident
 */
public class DatabaseReader {
    private static final String DATABASE_PATH = "users.db";
    
    private static  DatabaseReader instance = new DatabaseReader();
    
    private Map<String,String> userData;
    
    private DatabaseReader(){
        userData = new HashMap<>();
        
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
                userData.put(data[0],data[1]);
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
    
    private void saveAll(){
        PrintWriter r = null;
        try {
            File f = new File(DATABASE_PATH);
            r = new PrintWriter(new BufferedWriter(new FileWriter(f)));
            for(Map.Entry<String,String> v: userData.entrySet()){
                r.append(v.getKey()+" "+v.getValue());
            }
            
        } catch (Exception ex) {
            
        } finally {
            r.close();
        }
    }
    
    public Map<String,String> getUsers(){
        if(userData.isEmpty())
            readData();
        return userData;
    }
    
    public void saveUser(String username, String password){
        userData.put(username, password);
        saveAll();
    }
    
    public Tuple<String,String> findByName(String username){
        if(userData.isEmpty())
            readData();
        if(userData.containsKey(username))
            return new Tuple<>(username,userData.get(username));
        else return null;
    }
    
    public void deleteUser(String username){
        userData.remove(username);
        saveAll();
    }
}

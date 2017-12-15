/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agilebowling.utils;

/**
 *
 * @author trident
 */
public class Tuple<K,V> {
    private final K key;
    private final V value;
    
    public Tuple(K key,V value){
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }
    
    
}

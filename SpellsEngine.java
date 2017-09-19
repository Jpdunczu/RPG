/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs4311.homework.pkg6;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author joshuaduncan
 */
public class SpellsEngine {
    List<Player> subscribers = new ArrayList();
    
    public void subscribe(Player p) {
        this.subscribers.add(p);
    }
    
    public void unsubscribe(Player p) {
        this.subscribers.remove(p);
    }
    
    public void publish(String type) {
        int index = 0;
        while(index < subscribers.size()) {
            this.subscribers.get(index).doStuff(type);
            index++;
        }
    }
}

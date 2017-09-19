/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs4311.homework.pkg6;

/**
 *
 * @author joshuaduncan
 */
public class SpellsFactory {
    SpellsFactory instance;
    
    SpellsFactory getInstance() {
        instance = new SpellsFactory();
        return this.instance;
    }
    
    Spell requestSpell(Player p, String type) {
        if(type.equals("ArmorSpell")){
            return new ArmorSpell(p);
        } else if (type.equals("DamageSpell")){
            return new DamageSpell(p);
        } else if (type.equals("HealthSpell")){
            return new HealthSpell(p);
        }
        return null;
    }
}

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
public class ArmorSpell implements Spell {
    
    ArmorSpell(Player p) {
        p.addArmor(3);
    }
    @Override
    public void doSpell() {
        new ArmorSpell(p);
    }

}

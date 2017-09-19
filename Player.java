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
class Player {
    
    private int armor;
    private int damage;
    private int health;
    
    Player() {
        this.armor = 0;
        this.damage = 1;
        this.health = 10;
    }
    
    void doStuff(String type) {
        SpellsFactory sf = new SpellsFactory().getInstance();
        sf.requestSpell(this, type).doSpell();
    }

    void addArmor(int a) {
        this.armor += a;
    }
    
    int getArmor() {
        return this.armor;
    }
    
    void addDamage(int d) {
        this.damage += d;
    }
    
    int getDamage() {
        return this.damage;
    }
    
    void addHealth(int h) {
        this.health += h;
    }
    
    int getHealth() {
        return this.health;
    }
}

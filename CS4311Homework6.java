/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs4311.homework.pkg6;

import java.util.Scanner;

/**
 *
 * @author joshuaduncan
 */
public class CS4311Homework6 {
    static Scanner input = new Scanner(System.in);
    static SpellsEngine se = new SpellsEngine();
    
    static Player c = new Player();
    static Player m = new Player();
    static Player w = new Player();
    
    static String choice;
    
    public static void main(String[] args) {
        se.subscribe(c);
        se.subscribe(m);
        se.subscribe(w);
        String menu = "Cast a Spell:\n\n(A)rmor\n(D)amage\n(H)ealth\n(Q)uit\n\n\n";
        
        do{
            partyStats(c,m,w);
            System.out.println(menu);
            choice = input.next();
            switch(choice){
                case "a":
                case "A":
                    se.publish("ArmorSpell");
                    break;
                case "d":
                case "D":
                    se.publish("DamageSpell");
                    break;
                case "h":
                case "H":
                    se.publish("HealthSpell");
                    break;
            }
            if(choice.equals("q")||choice.equals("Q")){
                return;
            }
        }while(true);
    }
    
    public static void partyStats(Player a, Player b, Player c){
        System.out.println("Party Stats: \n\t\tCleric\tMage\tWarrior\n\t");
        System.out.println("Armor:\t\t"+a.getArmor()+"\t"+b.getArmor()+"\t"+c.getArmor()+"\n");
        System.out.println("Damage:\t\t"+a.getDamage()+"\t"+
                b.getDamage()+"\t"+
                c.getDamage()+"\n");
        System.out.println("Health:\t\t"+a.getHealth()+"\t"+
                b.getHealth()+"\t"+
                c.getHealth()+"\n");
    }
}

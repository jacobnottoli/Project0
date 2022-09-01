package Model;

import Service.MonsterService;

import java.sql.SQLException;
import java.util.Scanner;

public class FirstEncounter {
    public static void Encounter(Player p) {
        Scanner in = new Scanner(System.in);
        System.out.println("\nOur journey begins on the road that leads west out of the city of Colfax...Queen Elaine warned of troubles...Let's see what type of troubles you encounter first...\n1. Roll for your encounter");
        int selection = in.nextInt();
        if (selection == 1) {
            //do nothing
        } else {
            FirstEncounter.Encounter(p);
        }
        int roll = Roll.d20();
        System.out.println("You rolled a: " + roll +"!");
        MonsterService ms = new MonsterService();
        Monster m = ms.createMonster(ms.chooseMonster(roll));
        System.out.println("Uh oh! While travelling to the Dragon's Lair, you encountered a  " + m.getName() + "! They want to fight. Get ready!");

    }



}

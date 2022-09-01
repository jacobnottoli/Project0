package Model;

import java.util.Scanner;

public class Fight {

    public static void doFight(Player p, Monster m) {
        while (p.getHealth()>0 && m.getHp()>0) {
            System.out.println("\n" + p.getName() + "'s HP: " + p.getHealth());
            System.out.println(p.getName() + "'s AC: " + p.getAC());
            System.out.println("\n"+ m.getName() + "'s HP: " + m.getHp());
            System.out.println(m.getName() + "'s AC: " + m.getAc());
            int selection = Fight.fightPrompt();
            if (selection == 1) {
                int attackroll = Roll.d20() + p.addToRoll;
                System.out.println("You rolled a " + attackroll + " to hit!");
                if (attackroll >= m.getAc()) {
                    int dmg = Damage.addDamage(p);
                    System.out.println("You hit for " + dmg + " damage!");
                    m.setHp(m.getHp()-dmg);
                } else {
                    System.out.println("Your attack missed...");
                }
            } else {
                int heal = Heal.doHeal(p);
                p.setHealth(p.getHealth()+heal);
                System.out.println("You heal yourself " + heal + " hit points!");
            }
            if (m.getHp() > 0) {
                int mattackroll = Roll.d20() + m.getAddtoroll();
                System.out.println("\n" + m.getName() + " attacks! It rolls a " + mattackroll + " to hit!");
                if (mattackroll >= p.getAC()) {
                    int mdmg = Damage.addMonsterDamage(m);
                    System.out.println(m.getName() + " hits for " + mdmg + " damage!");
                    p.setHealth(p.getHealth()-mdmg);
                } else {
                    System.out.println(m.getName() + " missed their attack!");
                }
            }

        }

        if (p.getHealth() <= 0) {
            System.out.println("\nYou have died... Better luck next time...");
        } else {
            System.out.println("\n The " + m.getName() + " has been defeated! Congratulations!");
        }
    }
    public static int fightPrompt() {
        System.out.println("\nWhat would you like to do?");
        System.out.println("1. Attack\n2. Heal");
        Scanner in = new Scanner(System.in);
        int choice = in.nextInt();
        if (choice != 1 && choice != 2) {
            System.out.println("Invalid Input!");
            Fight.fightPrompt();
        } else {
            return choice;
        }
        return 1;
    }
}

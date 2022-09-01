package Model;

import java.util.Scanner;

public class SecondEncounter {
    public static void Encounter (Player p) {
        Scanner in = new Scanner(System.in);
        System.out.println("1. Roll to see what the ring does!");
        int choice = in.nextInt();
        System.out.println("You rolled a " + choice + "!");
        if (choice == 1) {
            int selection = Roll.d20();
            if (selection <=5) {
                System.out.println("\nYou found the Ring of Striking!\nYou now get +5 to your attack rolls!");
                p.setAddToRoll(p.getAddToRoll()+5);
            } else if (selection <=10) {
                System.out.println("\nYou found the Ring of Health!\n You now have 50% more health!");
                p.setHealth(p.getHealth()+(p.getHealth()/2));
            } else if (selection <=15) {
                System.out.println("\nYou found the Ring of Armor!\nYou now have +3 to your AC!");
                p.setAC(p.getAC()+3);
            } else {
                System.out.println("\nYou found the Ring of Attack!\nYou now have +5 to your attack rolls!");
                p.setAddToDMG(p.getAddToDMG()+5);
            }
        }

    }
}

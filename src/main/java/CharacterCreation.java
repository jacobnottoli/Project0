import java.util.Scanner;

public class CharacterCreation {
    public static Scanner in = new Scanner(System.in);
    public static void createCharacter(Player p) {

        System.out.println("Hello adventurer! What is your name?");
        p.setName(in.nextLine());
        System.out.println("Welcome to the world of Ezura, " + p.getName() + "! Your journey begins in the city of Colfax.\n \nQueen Elaine wants to commission someone to go slay the Dragon that rests in a cave at the base of the Hisuain Mountains.");
        System.out.println("\nLet's start with your class...\n \nAre you a Warrior or a Mage?");
        System.out.println("1. Mage\n2. Warrior");
        if (in.nextInt()==1) {
            CharacterCreation.createMage(p);
        } else {
            CharacterCreation.createWarrior(p);
        }
}

    public static void createMage(Player p){
        System.out.println("Ahhh... An adventurer of the arcane!\nWhat type of mage are you?");
        System.out.println("1. Fire\n2. Frost");
        if (in.nextInt()==1) {
            System.out.println("Well! A fire mage sure does know how to do some damage! It looks like you could be the right person for the job!");
            p.setClas("Fire Mage");
            p.setDMG(12);
            p.setHeal(6);
            System.out.println("\nLet's roll for the first time! Let's see how much health you have.");
            System.out.println("\n1. Roll for health!");
            if (in.nextInt()==1) {
                p.setHealth(20+Roll.d12());
            }
            System.out.println("You have " + p.getHealth() + " hit points!");
            System.out.println("\nLet's roll for the second time! Let's see what your armor class is!");
            System.out.println("\n1. Roll for AC!");
            if (in.nextInt()==1) {
                p.setAC(10+Roll.d4());
            }
            System.out.println("You have an armor class of " + p.getAC() + "!");
        } else {
            System.out.println("Well! Frost mages are very well rounded! It looks like you could be the right person for the job!");
            p.setClas("Frost Mage");
            p.setDMG(10);
            p.setHeal(8);
            System.out.println("\nLet's roll for the first time! Let's see how much health you have.");
            System.out.println("\n1. Roll for health!");
            if (in.nextInt()==1) {
                p.setHealth(20+Roll.d12());
            }
            System.out.println("You have " + p.getHealth() + " hit points!");
            System.out.println("\nLet's roll for the second time! Let's see what your armor class is!");
            System.out.println("\n1. Roll for AC!");
            if (in.nextInt()==1) {
                p.setAC(10+Roll.d4());
            }
            System.out.println("You have an armor class of " + p.getAC() + "!");

        }
    }

    public static void createWarrior(Player p) {
        System.out.println("Ahhh... An adventurer of the brawn!\nWhat type of warrior are you?");
        System.out.println("1. One Handed\n2. Two Handed");
        if (in.nextInt()==1) {
            System.out.println("Well! One handed warriors know how to protect themselves with their shield! It looks like you could be the right person for the job!");
            p.setClas("One Handed Warrior");
            p.setDMG(8);
            p.setHeal(4);
            System.out.println("\nLet's roll for the first time! Let's see how much health you have.");
            System.out.println("\n1. Roll for health!");
            if (in.nextInt()==1) {
                p.setHealth(30+Roll.d6());
            }
            System.out.println("You have " + p.getHealth() + " hit points!");
            System.out.println("\nLet's roll for the second time! Let's see what your armor class is!");
            System.out.println("\n1. Roll for AC!");
            if (in.nextInt()==1) {
                p.setAC(12+Roll.d6());
            }
            System.out.println("You have an armor class of " + p.getAC() + "!");
        } else {
            System.out.println("Well! Two handed warriors are excellent! It looks like you could be the right person for the job!");
            p.setClas("Two Handed Warrior");
            p.setDMG(10);
            p.setHeal(4);
            System.out.println("\nLet's roll for the first time! Let's see how much health you have.");
            System.out.println("\n1. Roll for health!");
            if (in.nextInt()==1) {
                p.setHealth(30+Roll.d6());
            }
            System.out.println("You have " + p.getHealth() + " hit points!");
            System.out.println("\nLet's roll for the second time! Let's see what your armor class is!");
            System.out.println("\n1. Roll for AC!");
            if (in.nextInt()==1) {
                p.setAC(10+Roll.d6());
            }
            System.out.println("You have an armor class of " + p.getAC() + "!");
        }
    }
}

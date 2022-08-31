import java.util.Scanner;

public class FirstEncounter {
    public static void Encounter(Player p) {
        Scanner in = new Scanner(System.in);
        System.out.println("\nOur journey begins on the road that leads west out of the city of Colfax...Queen Elaine warned of troubles...Let's see what type of troubles you encounter first...\n1. Roll for your encounter");
        int roll = in.nextInt();
        System.out.println("You rolled a: " + roll +"!");

    }



}

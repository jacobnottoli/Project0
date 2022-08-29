import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Player player = new Player();
        System.out.println("Hello adventurer! What is your name?");
        player.setName(in.nextLine());
        System.out.println("Welcome to the world of Ezura, " + player.getName() + "! Your journey begins in the city of Colfax.\n \nQueen Elaine has commissioned you to go slay the Dragon that rests in the Hisuain Mountains.");

    }
}

package Model;

import Model.FirstEncounter;
import Model.Player;
import Service.CharacterCreation;

public class Main {
    public static void main(String[] args) {
        Player player = new Player();
        CharacterCreation.createCharacter(player);
        FirstEncounter.Encounter(player);
    }

}

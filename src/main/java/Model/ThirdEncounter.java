package Model;

import Service.MonsterService;

public class ThirdEncounter {

    public static void Encounter (Player p) {
        System.out.println("\nArriving at the Dragon's Lair, the air around you starts to cool. \nStepping into the room, a large hoard of treasures sits before you. \nCountless gold pieces lay strewn about the floor. \nWeapons of all types are shoved into crevices in the seemingly infinite mountains of golden coins. Pillars stand strong holding up the ceiling of the cavern that must be a hundred feet tall. \nA moment passes before a large, hulking creature leaps into the air before you. \n It's time to slay the dragon. ");

        MonsterService ms = new MonsterService();
        Monster m = ms.createMonster(5);
        Fight.doFight(p,m);
    }
}

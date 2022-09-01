package Model;

public class Fight {

    public static void doFight(Player p, Monster m) {
        while (p.getHealth()>0 && m.getHp()>0) {
            System.out.println();
        }
    }
}

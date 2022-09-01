package Model;

public class Heal {
    public static int doHeal (Player p) {
        if (p.getHeal() == 8) {
            return Roll.d8();
        } else if (p.getHeal() == 6) {
            return Roll.d6();
        } else if (p.getHeal()==4) {
            return Roll.d4();
        }
        return 0;
    }
}

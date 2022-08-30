public class Damage {
    public int addDamage(int d, Player p) {
        if (d == 12) {
            return Roll.d12() + p.addToDMG;
        } else if (d == 10) {
            return Roll.d10() + p.addToDMG;
        } else if (d==8) {
            return Roll.d8() + p.addToDMG;
        }
        return 0;
    }
}

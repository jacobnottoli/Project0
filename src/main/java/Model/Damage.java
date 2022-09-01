package Model;

import Model.Player;
import Model.Roll;

public class Damage {
    public static int addDamage(Player p) {
        if (p.getDMG() == 12) {
            return Roll.d12() + p.getAddToDMG();
        } else if (p.getDMG() == 10) {
            return Roll.d10() + p.getAddToDMG();
        } else if (p.getDMG()==8) {
            return Roll.d8() + p.getAddToDMG();
        }
        return 0;
    }

    public static int addMonsterDamage (Monster m) {
        if (m.getAtk() == 12) {
            return Roll.d12() + m.getAddtoattack();
        } else if (m.getAtk() == 10) {
            return Roll.d10() + m.getAddtoattack();
        } else if (m.getAtk() == 8) {
            return Roll.d8() + m.getAddtoattack();
        } else if (m.getAtk() == 6) {
            return  Roll.d6() + m.getAddtoattack();
        } else if (m.getAtk() == 4) {
            return Roll.d4() + m.getAddtoattack();
        }
        return 0;
    }
}

package Model;

import Util.ConnectionUtil;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Monster {
    String name;
    int hp;
    int ac;
    int atk;
    int addtoattack;
    int addtoroll;




    public Monster(String name, int hp, int ac, int atk, int addtoattack, int addtoroll) {
        this.name = name;
        this.hp = hp;
        this. ac = ac;
        this.atk = atk;
        this.addtoattack = addtoattack;
        this.addtoroll = addtoroll;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getAc() {
        return ac;
    }

    public void setAc(int ac) {
        this.ac = ac;
    }

    public int getAtk() {
        return atk;
    }

    public void setAtk(int atk) {
        this.atk = atk;
    }

    public int getAddtoattack() {
        return addtoattack;
    }

    public void setAddtoattack(int addtoattack) {
        this.addtoattack = addtoattack;
    }

    public int getAddtoroll() {
        return addtoroll;
    }

    public void setAddtoroll(int addtoroll) {
        this.addtoroll = addtoroll;
    }
}

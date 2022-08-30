public class Player {
    String name;
    int health;
    int ac;
    String clas;
    int dmg;
    int heal;
    int addToRoll;
    int addToDMG;

    public Player() {
        addToRoll = 0;
        addToDMG = 0;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getHealth() {
        return this.health;
    }

    public void setAC(int ac) {
        this.ac = ac;
    }

    public int getAC() {
        return this.ac;
    }

    public void setClas(String clas) {
        this.clas = clas;
    }

    public String getClas() {
        return this.clas;
    }

    public void setDMG(int dmg) {
        this.dmg = dmg;
    }

    public int getDMG() {
        return this.dmg;
    }

    public void setHeal(int heal) {
        this.heal = heal;
    }

    public int getHeal() {
        return this.heal;
    }

    public void setAddToRoll(int addToRoll) {this.addToRoll=addToRoll;}

    public int getAddToRoll() {return this.addToRoll;}

    public void setAddToDMG(int addToDMG) {this.addToDMG=addToDMG;}

    public int getAddToDMG() {return this.addToDMG;}
}



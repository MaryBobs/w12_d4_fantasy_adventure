package player;

import behaviours.IHealth;
import skill.Skill;
import valuables.Valuable;

import java.util.ArrayList;

public abstract class Player implements IHealth {

    private int health;
    private Skill skill;
    private ArrayList<Valuable> treasures;

    public Player(int health, Skill skill) {
        this.health = health;
        this.skill = skill;
        this.treasures = new ArrayList<Valuable>();
    }

    public int getHealth() {
        return health;
    }

    public Skill getSkill() {
        return skill;
    }

    public ArrayList<Valuable> getTreasures() {
        return treasures;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void setSkill(Skill skill) {
        this.skill = skill;
    }

    public void collectTreasure(Valuable treasure) {
        treasures.add(treasure);
    }
}

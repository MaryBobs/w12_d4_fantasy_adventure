package player;

import behaviours.IHealth;
import enemies.Enemy;
import skill.Skill;
import valuables.Valuable;

import java.util.ArrayList;

public abstract class Player implements IHealth {

    protected int health;
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

    public void defend(int damage) {
        health -= damage;
    }

    public void activateSkill(IHealth target) {
        target.setHealth(target.getHealth() + skill.getValue());
    }
}

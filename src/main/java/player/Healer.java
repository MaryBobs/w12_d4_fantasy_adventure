package player;

import behaviours.IHealth;
import skill.Skill;

public class Healer extends Player {

    public Healer(int health, Skill skill) {
        super(health, skill);
    }

    @Override
    public void activateSkill(IHealth target) {
        target.setHealth(target.getHealth() + skill.getValue());
    }
}

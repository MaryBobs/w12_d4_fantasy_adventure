package player;

import mythical_creatures.MythicalCreature;
import skill.Skill;

public class Magician extends Player {

    private MythicalCreature companion;

    public Magician(int health, Skill skill, MythicalCreature companion) {
        super(health, skill);
        this.companion = companion;
    }

    public MythicalCreature getCompanion() {
        return companion;
    }
}

package mythical_creatures;

public class MythicalCreature {

    private String name;
    private int defenceValue;

    public MythicalCreature(String name, int defenceValue) {
        this.name = name;
        this.defenceValue = defenceValue;
    }

    public String getName() {
        return name;
    }

    public int getDefenceValue() {
        return defenceValue;
    }
}

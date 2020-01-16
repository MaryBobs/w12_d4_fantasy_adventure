package valuables;

public class Valuable {

    private String name;
    private int value;

    public Valuable(String name, int value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public int getValue() {
        return value;
    }
}

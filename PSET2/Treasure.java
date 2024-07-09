package PSET2;
public class Treasure {
    private String name;
    private String description;
    private boolean takeable;
    private boolean moveable;
    private int value;
    public Treasure(String n, String d, boolean t, boolean m, int v) {
        this.name = n;
        this.description = d;
        this.takeable = t;
        this.moveable = m;
        this.value = v;
    }
    public boolean isTakeable() {
        return takeable;
    }

    public boolean isMovable() {
        return moveable;
    }
    public int getValue() {
        return value;
    }
    public String toString() {
        return name + " " + description;
    }
}

package PSET3;

public class Treasure extends Thing{
    private boolean takeable;
    private boolean moveable;
    private int value;
    public Treasure(String n, String d, boolean t, boolean m, int v) {
        super(n, d);
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
}

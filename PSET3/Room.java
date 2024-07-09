package PSET3;

public class Room extends Thing{
    private int n, e, s, w;

    public Room (String name, String description, int n, int s, int e, int w) {
        super(name, description);
        this.n = n;
        this.e = e;
        this.s = s;
        this.w = w;
    }
    public int getN() {
        return n;
    }
    public int getE() {
        return e;
    }
    public int getS() {
        return s;
    }
    public int getW() {
        return w;
    }
}

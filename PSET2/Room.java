package PSET2;
public class Room {
    private int n, e, s, w;
    private String name;
    private String description;

    public Room (String name, String description, int n, int s, int e, int w) {
        this.name = name;
        this.description = description;
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
    public String toString() {
        return name +" "+ description;
    }
}

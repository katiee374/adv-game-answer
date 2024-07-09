package PSET3;

public class Thing {
    private String description;
    private String name;
    public Thing(String d, String n) {
        this.description = d;
        this.name = n;
    }
    public String toString() {
        return name + " " + description;
    }
    public String getName() {
        return name;
    }
    public String getDescription() {
        return description;
    }
}
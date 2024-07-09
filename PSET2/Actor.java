package PSET2;
public class Actor {
    private Room location;
    private String name;
    private String description;
    public Actor(String n, String d) {
        this.name = n;
        this.description = d;
    }
    public void setLocation(Room r) {
        this.location = r;
    }
    public Room getLocation() {
        return location;
    }
    public String toString() {
        return name +" "+ description;
    }
}

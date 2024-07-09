package PSET3;

public class Actor extends Thing {
    private Room location;
    public Actor(String n, String d) {
        super(n, d);
    }
    public void setLocation(Room r) {
        this.location = r;
    }
    public Room getLocation() {
        return location;
    }
}

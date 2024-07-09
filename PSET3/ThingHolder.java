package PSET3;
import java.util.ArrayList;
public class ThingHolder extends Thing{
    ArrayList<Thing> things;
    public ThingHolder(String n, String d) {
        super(n, d);
    }
    public void addThing(Thing t) {
        things.add(t);
    }
    public void removeThing(Thing t) {
        things.remove(t);
    }
    public void setThings(ArrayList<Thing> t) {
        things = t;
    }
    public Thing getThing(int i) {
        return things.get(i);
    }
}

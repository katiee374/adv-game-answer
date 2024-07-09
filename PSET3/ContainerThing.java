package PSET3;

public class ContainerThing extends ThingHolder{
    boolean openable;
    boolean open;
    public ContainerThing(String n, String d, boolean openable, boolean open) {
        super(n, d);
        this.openable = openable;
        this.open = open;
    }
    public void open() {
        open = true;
    }
    public void close() {
        open = false;
    }
    public boolean isOpen() {
        return open;
    }
    public boolean isOpenable() {
        if (open) {
            return false;
        }
        if (openable) {
            return true;
        } else {
            return false;
        }
    }
}

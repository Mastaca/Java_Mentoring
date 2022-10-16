package HomeOwners;

public class Bedroom {

    public double area;
    public int numberOfWindows;
    public int numberOfBeds;
    public Door door;

    public Bedroom(double area, int numberOfWindows, int numberOfBeds, Door door) {
        this.area = area;
        this.numberOfWindows = numberOfWindows;
        this.numberOfBeds = numberOfBeds;
        this.door = door;
    }
}

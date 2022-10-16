package HomeOwners;

public class Home {

    public String name;
    public String address;
    public Owner owner;
    public Door entranceDoor;
    public Bedroom bedroom;
    public Kitchen kitchen;

    public Home(String name, String address, Owner owner, Door entranceDoor, Bedroom bedroom, Kitchen kitchen) {
        this.name = name;
        this.address = address;
        this.owner = owner;
        this.entranceDoor = entranceDoor;
        this.bedroom = bedroom;
        this.kitchen = kitchen;
        numberOfHomes++;
    }

    public static int numberOfHomes;

}

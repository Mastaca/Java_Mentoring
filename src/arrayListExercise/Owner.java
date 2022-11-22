package arrayListExercise;

import java.util.*;

public class Owner {

    private Scanner scan;

    private List<Car> ownersCars = new ArrayList<>();

    private String name;

    private int id;
    private static int idCount = 0;
    public Owner(Scanner scan, String name) {
        this.scan = scan;
        this.name = name;
        this.id = ++Owner.idCount;
    }

    public List<Car> getOwnersCars() {
        return ownersCars;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }



    public void addCar() {
        //TODO works
        System.out.println("Enter car Brand: ");
        String brand = scan.next();
        System.out.println("Enter car power: ");
        int power = scan.nextInt();
        Car car = new Car(brand, power);
        ownersCars.add(car);
    }

    public void deleteCar() {
        //TODO works
        System.out.println("Enter car Brand: ");
        String brand = scan.next();
        System.out.println("Enter car power: ");
        int power = scan.nextInt();
        Car car = new Car(brand, power);
        ownersCars.remove(car);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Owner)) return false;
        Owner owner = (Owner) o;
        return name.equals(owner.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, id);
    }
}

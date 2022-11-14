package bookProjects.chapter3;

public final class Car {

    private final String brand = "BMW";
    private final Motor motor;

    public Car(Motor motor) {
//        this.brand = brand;
        this.motor = motor;
    }

    public String getBrand() {
        return brand;
    }

    public Motor getMotor() {
        return motor;
    }
}

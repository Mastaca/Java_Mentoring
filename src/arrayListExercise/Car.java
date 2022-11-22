package arrayListExercise;

import java.util.Objects;

public class Car {

    private String brand;
    private int power;

    public Car(String brand, int power) {
        this.brand = brand;
        this.power = power;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Car)) return false;
        Car car = (Car) o;
        return power == car.power && brand.equals(car.brand);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, power);
    }
}

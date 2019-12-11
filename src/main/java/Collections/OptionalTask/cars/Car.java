package Collections.OptionalTask.cars;

import java.util.Objects;

public abstract class Car {
    private int id;
    private int price;
    private int maxSpeed;
    private int fuelConsumption;
    private CarTypes type;

    public Car(int id, int price, int maxSpeed, int fuelConsumption, CarTypes type) {
        this.id = id;
        this.price = price;
        this.maxSpeed = maxSpeed;
        this.fuelConsumption = fuelConsumption;
        this.type = type;
    }

    public CarTypes getType() {
        return type;
    }

    public int getId() {
        return id;
    }

    public int getPrice() {
        return price;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public int getFuelConsumption() {
        return fuelConsumption;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return fuelConsumption == car.fuelConsumption;
    }

    @Override
    public int hashCode() {
        return Objects.hash(fuelConsumption);
    }

    @Override
    public String toString() {
        return  getType() + "{id=" + id +
                '\'' + ", price=" + price +
                ", maxSpeed=" + maxSpeed +
                ", fuelConsumption=" + fuelConsumption +
                '}';
    }

}

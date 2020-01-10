package collections.optionalTask.cars;

import collections.optionalTask.models.MinivansModels;

public class Minivan extends Car {
    private int loadCapacity;
    private int passengersCapacity;
    private MinivansModels model;

    public Minivan(int id, int price, int maxSpeed, int fuelConsumption, int loadCapacity, int passengersCapacity, MinivansModels model) {
        super(id, price, maxSpeed, fuelConsumption, CarTypes.MINIVAN);
        this.loadCapacity = loadCapacity;
        this.passengersCapacity = passengersCapacity;
        this.model = model;
    }

    public int getLoadCapacity() {
        return loadCapacity;
    }

    public int getPassengersCapacity() {
        return passengersCapacity;
    }

    @Override
    public String toString() {
        return super.toString().replace("}", ", loadCapacity=") + loadCapacity +
                ", passengersCapacity=" + passengersCapacity + ", model=" + model + '}';
    }
}

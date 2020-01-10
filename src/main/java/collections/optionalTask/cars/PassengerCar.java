package collections.optionalTask.cars;

import collections.optionalTask.models.PassengerCarsModels;

public class PassengerCar extends Car {
    private int passengersCapacity;
    private PassengerCarsModels model;

    public PassengerCar(int id, int price, int maxSpeed, int fuelConsumption, int passengerCapacity, PassengerCarsModels model) {
        super(id, price, maxSpeed, fuelConsumption, CarTypes.PASSENGER_CAR);
        this.passengersCapacity = passengerCapacity;
        this.model = model;
    }

    public int getPassengerCapacity() {
        return passengersCapacity;
    }

    @Override
    public String toString() {
        return super.toString().replace("}", ", passengersCapacity=")
                + passengersCapacity + ", model=" + model + '}';
    }
}

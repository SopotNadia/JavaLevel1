package Collections.OptionalTask.cars;

import Collections.OptionalTask.models.LorriesModels;

public class Lorry extends Car {
    private int loadCapacity;
    private LorriesModels model;

    public Lorry(int id, int price, int maxSpeed, int fuelConsumption, int loadCapacity, LorriesModels model){
        super(id, price, maxSpeed, fuelConsumption, CarTypes.LORRY);
        this.loadCapacity = loadCapacity;
        this.model = model;
    }

    public int getLoadCapacity() {
        return loadCapacity;
    }

    @Override
    public String toString() {
        return super.toString().replace("}", ", loadCapacity=") + loadCapacity + ", model=" + model + '}';
    }
}

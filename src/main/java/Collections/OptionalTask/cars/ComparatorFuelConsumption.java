package Collections.OptionalTask.cars;

import java.util.Comparator;

public class ComparatorFuelConsumption implements Comparator<Car> {
    @Override
    public int compare(Car o1, Car o2) {
        return o1.getFuelConsumption() - o2.getFuelConsumption();
    }
}

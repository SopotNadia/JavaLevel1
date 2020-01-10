package collections.optionalTask;

import collections.optionalTask.cars.*;
import collections.optionalTask.models.LorriesModels;
import collections.optionalTask.models.MinivansModels;
import collections.optionalTask.models.PassengerCarsModels;

import java.util.ArrayList;

public class Runner {
    public static void main(String[] args) {
        ArrayList<Car> cars = new ArrayList<>();
        cars.add(new PassengerCar(2122, 19800, 280, 4, 11, PassengerCarsModels.BMW_I8));
        cars.add(new PassengerCar(1345, 13200, 250, 9, 5, PassengerCarsModels.KIA_RIO));
        cars.add(new PassengerCar(3256, 15700, 260, 10, 5, PassengerCarsModels.FORD_FOCUS));
        cars.add(new Lorry(5674, 25800, 180, 14, 1900, LorriesModels.MERCEDES_BENZ_ATEGO));
        cars.add(new Lorry(1352, 30800, 190, 13, 1300, LorriesModels.FOTON_BJ));
        cars.add(new Lorry(3240, 45900, 210, 14, 2100, LorriesModels.RENAURLT_MIDLUM));
        cars.add(new Minivan(1367, 23000, 210, 13, 200, 7, MinivansModels.TOYOTA_HIACE));
        cars.add(new Minivan(1908, 26500, 240, 12, 100, 8, MinivansModels.NISSAN_SERENA));
        cars.add(new Minivan(7408, 20500, 220, 11, 150, 6, MinivansModels.PEUGEOT_TRAVELLER));
        TaxiPark taxiPark = new TaxiPark(cars);

        System.out.println("Cost of all cars in the taxi park - " + taxiPark.getCostOfAllCarsInTaxiPark());
        System.out.println(CarTypes.ALL.getName() + " were sorted by fuel consumption - " + taxiPark.sortCarsByFuelConsumption(CarTypes.ALL));
        System.out.println("Cars with speed from defined gap " + taxiPark.getCarsWithDefinedMaxSpeed(250));


    }
}

package Collections.OptionalTask;

import Collections.OptionalTask.cars.*;

import java.util.ArrayList;

public class TaxiPark {
    //Определить иерархию автомобилей. Создать таксопарк. Подсчитать стоимость автопарка. Провести сортировку автомобилей парка по расходу топлива.
    // Найти автомобиль в компании, соответствующий заданному диапазону параметров скорости.

    private ArrayList<Car> taxiPark;

    public TaxiPark(ArrayList<Car> listCars) {
        this.taxiPark = listCars;
    }

    public ArrayList<Car> getAllCars() {
        return taxiPark;
    }

    public ArrayList<PassengerCar> getPassengerCars(){
        ArrayList<PassengerCar> listPassengerCars = new ArrayList<>();
        for(Car car: taxiPark){
            if(car.getType() == CarTypes.PASSENGER_CAR){
                listPassengerCars.add((PassengerCar) car);
            }
        }
        System.out.println(listPassengerCars);
        return listPassengerCars;
    }

    public ArrayList<Lorry> getLorries(){
        ArrayList<Lorry> listLorries = new ArrayList<>();
        for(Car car: taxiPark){
            if(car.getType() == CarTypes.LORRY){
                listLorries.add((Lorry) car);
            }
        }
        return listLorries;
    }

    public ArrayList<Minivan> getMinivans(){
        ArrayList<Minivan> listMinivans = new ArrayList<>();
        for(Car car: taxiPark){
            if(car.getType() == CarTypes.MINIVAN){
                listMinivans.add((Minivan) car);
            }
        }
        return listMinivans;
    }

    public int getCostOfAllCarsInTaxiPark() {
        int cost = 0;
        for(Car car: taxiPark){
            cost = cost + car.getPrice();
        }
        return cost;
    }

    public ArrayList<? extends Car> sortCarsByFuelConsumption(CarTypes carType){
        ArrayList<? extends Car> listAfterSortingByFuelConsumption = new ArrayList<>();
        switch (carType){
            case LORRY:
                listAfterSortingByFuelConsumption = getLorries();
                listAfterSortingByFuelConsumption.sort(new ComparatorFuelConsumption());
                break;
            case PASSENGER_CAR:
                listAfterSortingByFuelConsumption = getPassengerCars();
                listAfterSortingByFuelConsumption.sort(new ComparatorFuelConsumption());
                break;
            case MINIVAN:
                listAfterSortingByFuelConsumption = getMinivans();
                listAfterSortingByFuelConsumption.sort(new ComparatorFuelConsumption());
                break;
            case ALL:
                listAfterSortingByFuelConsumption = getAllCars();
                listAfterSortingByFuelConsumption.sort(new ComparatorFuelConsumption());
                break;
        }
        return listAfterSortingByFuelConsumption;
    }

    public ArrayList<Car> getCarsWithDefinedMaxSpeed(int minValue) throws IllegalArgumentException{
        return getCarsWithDefinedMaxSpeed(minValue, Integer.MAX_VALUE);
    }

    public ArrayList<Car> getCarsWithDefinedMaxSpeed(int minValue, int maxValue) throws IllegalArgumentException{
        ArrayList<Car> listCarsWithSpeedFromSelectedGap = new ArrayList<>();
        if(maxValue < minValue){
            int value = minValue;
            minValue = maxValue;
            maxValue = value;
        } else if(maxValue < 0 || minValue < 0) {
            throw new IllegalArgumentException();
        }
        for(Car car: taxiPark){
            if(car.getMaxSpeed() <= maxValue && car.getMaxSpeed() >= minValue){
                listCarsWithSpeedFromSelectedGap.add(car);
            }
        }
        return listCarsWithSpeedFromSelectedGap;
    }
}

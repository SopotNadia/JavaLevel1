package Threads.Main;

public class Runner {
    public static void main(String[] args) {
        //Автостоянка. Доступно несколько машиномест. На одном месте может находиться только один автомобиль.
        // Если все места заняты, то автомобиль не станет ждать больше определенного времени и уедет на другую стоянку.

        Parking parking = new Parking(5);
        parking.addCarIntoQueue(new Car("Volvo"));
        parking.addCarIntoQueue(new Car("Kea"));
        parking.addCarIntoQueue(new Car("BMV"));
        parking.addCarIntoQueue(new Car("Ford"));
        parking.addCarIntoQueue(new Car("Lada"));
        parking.addCarIntoQueue(new Car("Mazda"));

        while(!parking.getCarsQueue().isEmpty()){
            Car car = parking.getCarsQueue().poll();
            new Thread(() -> car.tryToPark(parking)).start();
        }
    }
}

package Threads.Main;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class Car {
    private String marka;

    private ReentrantLock locker = new ReentrantLock(true);
    private Condition condition = locker.newCondition();

    public Car(String marka) {
        this.marka = marka;
    }

    public void tryToPark(Parking parking) {
        locker.lock();
        while(parking.getAvailablePlaces() == 0){
            try {
                condition.await();
                System.out.println("after await");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
//            try {
//                if (!condition.await(10, TimeUnit.SECONDS)){
//                    //если время истекло - заходит
//                    System.out.println(marka + " can't wait more. Car's leaving the queue ");
//                    return;
//                }else{
//                    System.out.println();
//                }
//            } catch (InterruptedException e) {
//                //e.printStackTrace();
//            }
        }

        try {
            parking.decreaseAvailablePlaces();
            System.out.println(marka + " is parking");
            //new Thread(() ->

        } finally {
            locker.unlock();
        }
        leaveParking(parking);
    }

    public void leaveParking(Parking parking){

        try {
            Thread.sleep((long) (4000 + (Math.random()*2000)));
        } catch (InterruptedException e) {
            //e.printStackTrace();
        }
        locker.lock();
        System.out.println(marka + " leaving the parking");
        parking.increaseAvailablePlases();
        condition.signalAll();
        //System.out.println("out locker");
        locker.unlock();
    }
}

package level_2.threads.mainTask;
//Разработать консольное многопоточное приложение.
//Использовать возможности, предоставляемые пакетом java.util.concurrent.
//Все сущности, желающие получить доступ к ресурсу, должны быть потоками.
//Автостоянка. Доступно несколько машиномест. На одном месте может находиться только
// один автомобиль. Если все места заняты, то автомобиль не станет ждать больше определенного
// времени и уедет на другую стоянку.

import java.util.Arrays;
import java.util.List;

public
class Runner {
    public static
    void main(String[] args) {
        List<Car> carList = Arrays.asList(
                new Car(1, 5000, 1000),
                new Car(2, 5000, 1000),
                new Car(3, 8000, 5000),
                new Car(4, 5000, 3000),
                new Car(5, 10000, 1000),
                new Car(6, 5000, 3000),
                new Car(7, 5000, 1000)
        );
        List<ParkingPlace> parkingPlace = Arrays.asList(
                new ParkingPlace(1, ParkingPlaceAvailability.AVAILABLE),
                new ParkingPlace(2, ParkingPlaceAvailability.AVAILABLE),
                new ParkingPlace(3, ParkingPlaceAvailability.AVAILABLE)
        );
        CarsQueue carsQueue_1 = new CarsQueue(parkingPlace, carList.get(0));
        CarsQueue carsQueue_2 = new CarsQueue(parkingPlace, carList.get(1));
        CarsQueue carsQueue_3 = new CarsQueue(parkingPlace, carList.get(2));
        CarsQueue carsQueue_4 = new CarsQueue(parkingPlace, carList.get(3));
        CarsQueue carsQueue_5 = new CarsQueue(parkingPlace, carList.get(4));
        CarsQueue carsQueue_6 = new CarsQueue(parkingPlace, carList.get(5));
        CarsQueue carsQueue_7 = new CarsQueue(parkingPlace, carList.get(6));
        try {
            carsQueue_1.start();
            Thread.sleep(1000);
            carsQueue_2.start();
            Thread.sleep(1000);
            carsQueue_3.start();
            Thread.sleep(1000);
            carsQueue_4.start();
            Thread.sleep(1000);
            carsQueue_5.start();
            Thread.sleep(1000);
            carsQueue_6.start();
            Thread.sleep(1000);
            carsQueue_7.start();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

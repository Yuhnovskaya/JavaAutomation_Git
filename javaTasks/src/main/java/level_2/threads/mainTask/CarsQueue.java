package level_2.threads.mainTask;

import java.util.List;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

public
class CarsQueue extends Thread {
    Semaphore SEMAPHORE;
    private List<ParkingPlace> parkingPlaceList;
    private Car car;

    public
    CarsQueue(Semaphore SEMAPHORE, List<ParkingPlace> parkingPlaceList, Car car) {
        this.SEMAPHORE = SEMAPHORE;
        this.parkingPlaceList = parkingPlaceList;
        this.car = car;
    }

    @Override
    public
    void run() {
        System.out.println(String.format("The car %s is arriving the parking", car.getCarNumber()));
        int counter = -1;
        try {
            if (SEMAPHORE.tryAcquire(car.getWaitingTime(), TimeUnit.MILLISECONDS)) {
                for (int i = 0; i < parkingPlaceList.size(); i++) {
                    synchronized (parkingPlaceList) {
                        if (parkingPlaceList.get(i).getStatus() == ParkingPlaceAvailability.AVAILABLE) {
                            parkingPlaceList.get(i).setStatus(ParkingPlaceAvailability.UNAVAILABLE);
                            counter = i;
                            System.out.println(String.format("The car %s is taking up parking place %s", car.getCarNumber(), parkingPlaceList.get(i).getParkingPlaceNumber()));
                            break;
                        }
                    }
                }
                Thread.sleep(car.getParkingTime());
                System.out.println(String.format("The car %s is leaving parking place %s\nThe parking place %s is available", car.getCarNumber(), parkingPlaceList.get(counter).getParkingPlaceNumber(), parkingPlaceList.get(counter).getParkingPlaceNumber()));
                parkingPlaceList.get(counter).setStatus(ParkingPlaceAvailability.AVAILABLE);
                SEMAPHORE.release();
            } else {
                System.out.println(String.format("The car %s left the parking", car.getCarNumber()));
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

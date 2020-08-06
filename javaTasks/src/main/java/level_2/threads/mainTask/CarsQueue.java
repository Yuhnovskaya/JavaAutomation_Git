package level_2.threads.mainTask;

import java.util.List;

public
class CarsQueue extends Thread {
    private List<ParkingPlace> parkingPlaceList;
    private Car car;

    public
    CarsQueue(List<ParkingPlace> parkingPlaceList, Car car) {
        this.parkingPlaceList = parkingPlaceList;
        this.car = car;
    }

    @Override
    public
    void run() {
        int num = 0;
        for (int i = 0; i < parkingPlaceList.size(); i++) {
            if (parkingPlaceList.get(i).getStatus() == ParkingPlaceAvailability.AVAILABLE) {
                takeStayLeavePlace(parkingPlaceList.get(i));
                num += 1;
                break;
            }
        }
        if (num == 0) {
            try {
                System.out.println(String.format("The car %s is waiting for the place", car.getCarNumber()));
                Thread.sleep(car.getWaitingTime());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            for (int i = 0; i < parkingPlaceList.size(); i++) {
                if (parkingPlaceList.get(i).getStatus() == ParkingPlaceAvailability.AVAILABLE) {
                    takeStayLeavePlace(parkingPlaceList.get(i));
                    break;
                } else {
                    System.out.println(String.format("The car %s left parking", car.getCarNumber()));
                    break;
                }
            }
        }
    }

    public
    void takeStayLeavePlace(ParkingPlace parkingPlace) {
        System.out.println(String.format("The car %s is taking up parking place %s", car.getCarNumber(), parkingPlace.getParkingPlaceNumber()));
        parkingPlace.setStatus(ParkingPlaceAvailability.UNAVAILABLE);
        try {
            Thread.sleep(car.getParkingTime());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(String.format("The car %s is leaving parking place %s\nThe parking place %s is available", car.getCarNumber(), parkingPlace.getParkingPlaceNumber(), parkingPlace.getParkingPlaceNumber()));
        parkingPlace.setStatus(ParkingPlaceAvailability.AVAILABLE);
    }
}


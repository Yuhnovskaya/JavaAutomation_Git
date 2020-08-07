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
        int freePlace=checkTakeLeavePlace(this.parkingPlaceList);
        if (freePlace == 0) {
            try {
                System.out.println(String.format("The car %s is waiting for the place", car.getCarNumber()));
                Thread.sleep(car.getWaitingTime());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            freePlace=checkTakeLeavePlace(this.parkingPlaceList);
            if(freePlace==0) {
                    System.out.println(String.format("The car %s left parking", car.getCarNumber()));
                //    break;
                }
            }
        }

    public
    int checkTakeLeavePlace(List<ParkingPlace> parkingPlaceList) {
        int freePlace = 0;
        for (int i = 0; i < parkingPlaceList.size(); i++) {
            if (parkingPlaceList.get(i).getStatus() == ParkingPlaceAvailability.AVAILABLE) {
                System.out.println(String.format("The car %s is taking up parking place %s", car.getCarNumber(), parkingPlaceList.get(i).getParkingPlaceNumber()));
                parkingPlaceList.get(i).setStatus(ParkingPlaceAvailability.UNAVAILABLE);
                try {
                    Thread.sleep(car.getParkingTime());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(String.format("The car %s is leaving parking place %s\nThe parking place %s is available", car.getCarNumber(), parkingPlaceList.get(i).getParkingPlaceNumber(), parkingPlaceList.get(i).getParkingPlaceNumber()));
                parkingPlaceList.get(i).setStatus(ParkingPlaceAvailability.AVAILABLE);
                freePlace += 1;
                break;
            }
        }
        return freePlace;
    }
}



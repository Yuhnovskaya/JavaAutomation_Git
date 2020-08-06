package level_2.threads.mainTask;

public
class ParkingPlace {
    private int parkingPlaceNumber;
    private ParkingPlaceAvailability status;

    public
    ParkingPlace(int parkingPlaceNumber, ParkingPlaceAvailability status) {
        this.parkingPlaceNumber = parkingPlaceNumber;
        this.status = status;
    }

    public
    int getParkingPlaceNumber() {
        return parkingPlaceNumber;
    }

    public
    void setParkingPlaceNumber(int parkingPlaceNumber) {
        this.parkingPlaceNumber = parkingPlaceNumber;
    }

    public
    ParkingPlaceAvailability getStatus() {
        return status;
    }

    public
    void setStatus(ParkingPlaceAvailability status) {
        this.status = status;
    }
}

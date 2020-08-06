package level_2.threads.mainTask;

public
class Car {
    private int carNumber;
    private int parkingTime;
    private int waitingTime;

    public
    Car(int carNumber, int parkingTime, int waitingTime) {
        this.carNumber = carNumber;
        this.parkingTime = parkingTime;
        this.waitingTime = waitingTime;
    }

    public
    int getCarNumber() {
        return carNumber;
    }

    public
    int getParkingTime() {
        return parkingTime;
    }

    public
    int getWaitingTime() {
        return waitingTime;
    }
}

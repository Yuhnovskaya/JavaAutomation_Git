package level_2.threads.optionalTask;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Semaphore;

public
class Runner {
    public static
    void main(String[] args) throws InterruptedException {
        Semaphore SEMAPHORE = new Semaphore(5);
        int[] planeID = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        List<Runway> runwayList = Arrays.asList(
                new Runway(1, RunwayAvailability.AVAILABLE),
                new Runway(2, RunwayAvailability.AVAILABLE),
                new Runway(3, RunwayAvailability.AVAILABLE),
                new Runway(4, RunwayAvailability.AVAILABLE),
                new Runway(5, RunwayAvailability.AVAILABLE)
        );
        PlaneQueue planesPlaneQueue_1 = new PlaneQueue(SEMAPHORE, planeID[0], runwayList);
        PlaneQueue planesPlaneQueue_2 = new PlaneQueue(SEMAPHORE, planeID[1], runwayList);
        PlaneQueue planesPlaneQueue_3 = new PlaneQueue(SEMAPHORE, planeID[2], runwayList);
        PlaneQueue planesPlaneQueue_4 = new PlaneQueue(SEMAPHORE, planeID[3], runwayList);
        PlaneQueue planesPlaneQueue_5 = new PlaneQueue(SEMAPHORE, planeID[4], runwayList);
        PlaneQueue planesPlaneQueue_6 = new PlaneQueue(SEMAPHORE, planeID[5], runwayList);
        PlaneQueue planesPlaneQueue_7 = new PlaneQueue(SEMAPHORE, planeID[6], runwayList);
        PlaneQueue planesPlaneQueue_8 = new PlaneQueue(SEMAPHORE, planeID[7], runwayList);
        PlaneQueue planesPlaneQueue_9 = new PlaneQueue(SEMAPHORE, planeID[8], runwayList);
        PlaneQueue planesPlaneQueue_10 = new PlaneQueue(SEMAPHORE, planeID[9], runwayList);
        planesPlaneQueue_1.start();
        //Thread.sleep(500);
        planesPlaneQueue_2.start();
        //Thread.sleep(500);
        planesPlaneQueue_3.start();
        //Thread.sleep(500);
        planesPlaneQueue_4.start();
        //Thread.sleep(500);
        planesPlaneQueue_5.start();
        //Thread.sleep(500);
        planesPlaneQueue_6.start();
        //Thread.sleep(500);
        planesPlaneQueue_7.start();
        //Thread.sleep(500);
        planesPlaneQueue_8.start();
        //Thread.sleep(500);
        planesPlaneQueue_9.start();
        //Thread.sleep(500);
        planesPlaneQueue_10.start();
    }
}

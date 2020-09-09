package level_2.threads.optionalTask;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Semaphore;

public
class Runner {
    public static
    void main(String[] args) throws InterruptedException {
        int[] planeID = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        List<Runway> runwayList = Arrays.asList(
                new Runway(1, RunwayAvailability.AVAILABLE),
                new Runway(2, RunwayAvailability.AVAILABLE),
                new Runway(3, RunwayAvailability.AVAILABLE),
                new Runway(4, RunwayAvailability.AVAILABLE),
                new Runway(5, RunwayAvailability.AVAILABLE)
        );
        Semaphore SEMAPHORE = new Semaphore(runwayList.size());
        PlanesQueue planesPlanesQueue_1 = new PlanesQueue(SEMAPHORE, planeID[0], runwayList);
        PlanesQueue planesPlanesQueue_2 = new PlanesQueue(SEMAPHORE, planeID[1], runwayList);
        PlanesQueue planesPlanesQueue_3 = new PlanesQueue(SEMAPHORE, planeID[2], runwayList);
        PlanesQueue planesPlanesQueue_4 = new PlanesQueue(SEMAPHORE, planeID[3], runwayList);
        PlanesQueue planesPlanesQueue_5 = new PlanesQueue(SEMAPHORE, planeID[4], runwayList);
        PlanesQueue planesPlanesQueue_6 = new PlanesQueue(SEMAPHORE, planeID[5], runwayList);
        PlanesQueue planesPlanesQueue_7 = new PlanesQueue(SEMAPHORE, planeID[6], runwayList);
        PlanesQueue planesPlanesQueue_8 = new PlanesQueue(SEMAPHORE, planeID[7], runwayList);
        PlanesQueue planesPlanesQueue_9 = new PlanesQueue(SEMAPHORE, planeID[8], runwayList);
        PlanesQueue planesPlanesQueue_10 = new PlanesQueue(SEMAPHORE, planeID[9], runwayList);
        planesPlanesQueue_1.start();
        //Thread.sleep(500);
        planesPlanesQueue_2.start();
        //Thread.sleep(500);
        planesPlanesQueue_3.start();
        //Thread.sleep(500);
        planesPlanesQueue_4.start();
        //Thread.sleep(500);
        planesPlanesQueue_5.start();
        //Thread.sleep(500);
        planesPlanesQueue_6.start();
        //Thread.sleep(500);
        planesPlanesQueue_7.start();
        //Thread.sleep(500);
        planesPlanesQueue_8.start();
        //Thread.sleep(500);
        planesPlanesQueue_9.start();
        //Thread.sleep(500);
        planesPlanesQueue_10.start();
    }
}

package level_2.threads.optionalTask;

import java.util.List;
import java.util.concurrent.Semaphore;

public
class PlanesQueue extends Thread {
    Semaphore SEMAPHORE;
    private int planeID;
    private List<Runway> runwayList;

    public
    PlanesQueue(Semaphore SEMAPHORE, int planeID, List<Runway> runwayList) {
        this.SEMAPHORE = SEMAPHORE;
        this.planeID = planeID;
        this.runwayList = runwayList;
    }

    @Override
    public
    void run() {
        try {
            int counter = -1;
            SEMAPHORE.acquire();
            for (int i = 0; i < runwayList.size(); i++) {
                synchronized (runwayList.get(i)) {
                    if (runwayList.get(i).getStatus() == RunwayAvailability.AVAILABLE) {
                        runwayList.get(i).setStatus(RunwayAvailability.UNAVAILABLE);
                        counter = i;
                        System.out.println(String.format("Самолет %s выходит на взлетную полосу %s", planeID, runwayList.get(i).getRunwayNumber()));
                        break;
                    }
                }
            }
            Thread.sleep(1000);
            System.out.println(String.format("Самолет %s взлетает", planeID));
            Thread.sleep(1000);
            System.out.println(String.format("Полоса %s 'принимает' самолет %s", runwayList.get(counter).getRunwayNumber(), planeID));
            Thread.sleep(1000);
            System.out.println(String.format("Полоса %s освободилась", runwayList.get(counter).getRunwayNumber()));
            runwayList.get(counter).setStatus(RunwayAvailability.AVAILABLE);
            SEMAPHORE.release();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

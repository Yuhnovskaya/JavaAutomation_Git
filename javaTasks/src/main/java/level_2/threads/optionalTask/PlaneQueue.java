package level_2.threads.optionalTask;

import java.util.List;
import java.util.concurrent.Semaphore;

public
class PlaneQueue extends Thread {
    Semaphore SEMAPHORE;
    private int planeID;
    private List<Runway> runwayList;

    public
    PlaneQueue(Semaphore SEMAPHORE, int planeID, List<Runway> runwayList) {
        this.SEMAPHORE = SEMAPHORE;
        this.planeID = planeID;
        this.runwayList = runwayList;
    }

    @Override
    public
    void run() {
        try {
            int num = -1;
            SEMAPHORE.acquire();
            for (int i = 0; i < runwayList.size(); i++) {
                synchronized (runwayList.get(i)) {
                    if (runwayList.get(i).getStatus() == RunwayAvailability.AVAILABLE) {
                        runwayList.get(i).setStatus(RunwayAvailability.UNAVAILABLE);
                        num = i;
                        System.out.println(String.format("Самолет %s выходит на взлетную полосу %s", planeID, runwayList.get(i).getRunwayNumber()));
                        break;
                    }
                }
            }
            Thread.sleep(1000);
            System.out.println(String.format("Самолет %s взлетает", planeID));
            Thread.sleep(1000);
            System.out.println(String.format("Полоса %s 'принимает' самолет %s", runwayList.get(num).getRunwayNumber(), planeID));
            Thread.sleep(1000);
            System.out.println(String.format("Полоса %s освободилась", runwayList.get(num).getRunwayNumber()));
            synchronized (runwayList) {
                runwayList.get(num).setStatus(RunwayAvailability.AVAILABLE);//Освобождаем место
            }
            SEMAPHORE.release();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

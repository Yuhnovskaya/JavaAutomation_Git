package level_2.threads.optionalTask;

public
class
PlanesQueue extends Thread {
    private int runwayNumber;
    private int[] planesNumber;

    public
    PlanesQueue(int runwayNumber, int... planesNumber) {
        this.runwayNumber = runwayNumber;
        this.planesNumber = planesNumber;
    }

    @Override
    public
    void run() {
        for (int i = 0; i < planesNumber.length; i++) {
            System.out.println(String.format("самолет %s вышел на взлетную полосу %s", planesNumber[i], runwayNumber));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.err.print(e);
            }
            System.out.println(String.format("самолет %s взлетел", planesNumber[i]));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.err.print(e);
            }
            System.out.println(String.format("полоса %s приняла самолет %s", runwayNumber, planesNumber[i]));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.err.print(e);
            }
            System.out.println(String.format("полоса %s освободилась", runwayNumber));
        }
    }
}

package level_2.threads.optionalTask;

public
class Runway {
    public static
    void main(String[] args) {
        PlanesQueue queue1 = new PlanesQueue(1, 1, 6);
        PlanesQueue queue2 = new PlanesQueue(2, 2, 7);
        PlanesQueue queue3 = new PlanesQueue(3, 3, 8);
        PlanesQueue queue4 = new PlanesQueue(4, 4, 9);
        PlanesQueue queue5 = new PlanesQueue(5, 5, 10);
        queue1.start();
        queue2.start();
        queue3.start();
        queue4.start();
        queue5.start();
    }
}

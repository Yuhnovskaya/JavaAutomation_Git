package level_1.collections.mainTask.flowers.types;

import level_1.collections.mainTask.flowers.Flower;
import level_1.collections.mainTask.flowers.characteristic.Color;
import level_1.collections.mainTask.flowers.characteristic.Freshness;

public
class Rose extends Flower {
    private static final String ROSE_NAME = "ROSE";
    private static final double ROSE_PRICE = 3.5;

    public
    Rose(Color color, int stalkLength, Freshness freshness) {
        super(color, stalkLength, freshness);
    }

    @Override
    public
    String getName() {
        return ROSE_NAME;
    }

    @Override
    public
    double getPrice() {
        return ROSE_PRICE;
    }

    @Override
    public
    String toString() {
        return "Flower{" +
                "name='" + ROSE_NAME + '\'' +
                ", color=" + getColor().toString() +
                ", stalkLength=" + getStalkLength() +
                ", freshness=" + getFreshness() +
                ", price=" + ROSE_PRICE +
                "}\n";
    }
}

package level_1.collections.mainTask.flowers.types;

import level_1.collections.mainTask.flowers.Flower;
import level_1.collections.mainTask.flowers.characteristic.Color;
import level_1.collections.mainTask.flowers.characteristic.Freshness;

public
class Lily extends Flower {
    private static final String LILY_NAME = "LILY";
    private static final double LILY_PRICE = 10;

    public
    Lily(Color color, int stalkLength, Freshness freshness) {
        super(color, stalkLength, freshness);
    }

    @Override
    public
    String getName() {
        return LILY_NAME;
    }

    @Override
    public
    double getPrice() {
        return LILY_PRICE;
    }

    @Override
    public
    String toString() {
        return "Flower{" +
                "name='" + LILY_NAME + '\'' +
                ", color=" + getColor().toString() +
                ", stalkLength=" + getStalkLength() +
                ", freshness=" + getFreshness() +
                ", price=" + LILY_PRICE +
                "}\n";
    }
}

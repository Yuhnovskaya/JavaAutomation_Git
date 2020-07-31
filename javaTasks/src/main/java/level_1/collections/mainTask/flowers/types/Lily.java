package level_1.collections.mainTask.flowers.types;

import level_1.collections.mainTask.flowers.Flower;
import level_1.collections.mainTask.flowers.characteristic.Color;
import level_1.collections.mainTask.flowers.characteristic.Freshness;

public
class Lily extends Flower {
    private static final String lilyName = "LILY";
    private static final double lilyPrice = 10;

    public
    Lily(Color color, int stalkLength, Freshness freshness) {
        super(color, stalkLength, freshness);
    }

    @Override
    public
    String getName() {
        return lilyName;
    }

    @Override
    public
    double getPrice() {
        return lilyPrice;
    }

    @Override
    public
    String toString() {
        return "Flower{" +
                "name='" + lilyName + '\'' +
                ", color=" + getColor().toString() +
                ", stalkLength=" + getStalkLength() +
                ", freshness=" + getFreshness() +
                ", price=" + lilyPrice +
                "}\n";
    }
}

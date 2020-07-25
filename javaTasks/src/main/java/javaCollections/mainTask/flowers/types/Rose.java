package javaCollections.mainTask.flowers.types;

import javaCollections.mainTask.flowers.Flower;
import javaCollections.mainTask.flowers.characteristic.Color;
import javaCollections.mainTask.flowers.characteristic.Freshness;

public
class Rose extends Flower {
    private static final String roseName = "ROSE";
    private static final double rosePrice=3.5;

    public
    Rose(Color color, int stalkLength, Freshness freshness) {
        super(color, stalkLength, freshness);
    }
@Override
    public
    String getName() {
        return roseName;
    }

    @Override
    public
    double getPrice() {
        return rosePrice;
    }
    @Override
    public
    String toString() {
        return "Flower{" +
                "name='" + roseName + '\'' +
                ", color=" + getColor().toString() +
                ", stalkLength=" + getStalkLength() +
                ", freshness=" + getFreshness() +
                ", price=" + rosePrice +
                "}\n";
    }
}

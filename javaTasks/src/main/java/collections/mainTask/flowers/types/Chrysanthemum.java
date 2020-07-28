package collections.mainTask.flowers.types;

import collections.mainTask.flowers.Flower;
import collections.mainTask.flowers.characteristic.Color;
import collections.mainTask.flowers.characteristic.Freshness;

public
class Chrysanthemum extends Flower {
    private static final String chrysanthemumName = "CHRYSANTEMUM";
    private static final double chrysanthemumPrice = 5;

    public
    Chrysanthemum(Color color, int stalkLength, Freshness freshness) {
        super(color, stalkLength, freshness);
    }

    @Override
    public
    String getName() {
        return chrysanthemumName;
    }

    public
    double getPrice() {
        return chrysanthemumPrice;
    }

    @Override
    public
    String toString() {
        return "Flower{" +
                "name='" + chrysanthemumName + '\'' +
                ", color=" + getColor().toString() +
                ", stalkLength=" + getStalkLength() +
                ", freshness=" + getFreshness() +
                ", price=" + chrysanthemumPrice +
                "}\n";
    }
}


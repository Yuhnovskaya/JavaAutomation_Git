package level_1.collections.mainTask.flowers.types;

import level_1.collections.mainTask.flowers.Flower;
import level_1.collections.mainTask.flowers.characteristic.Color;
import level_1.collections.mainTask.flowers.characteristic.Freshness;

public
class Chrysanthemum extends Flower {
    private static final String CHRYSANTEMUM_NAME = "CHRYSANTEMUM";
    private static final double CHRYSANTEMUM_PRICE = 5;

    public
    Chrysanthemum(Color color, int stalkLength, Freshness freshness) {
        super(color, stalkLength, freshness);
    }

    @Override
    public
    String getName() {
        return CHRYSANTEMUM_NAME;
    }

    public
    double getPrice() {
        return CHRYSANTEMUM_PRICE;
    }

    @Override
    public
    String toString() {
        return "Flower{" +
                "name='" + CHRYSANTEMUM_NAME + '\'' +
                ", color=" + getColor().toString() +
                ", stalkLength=" + getStalkLength() +
                ", freshness=" + getFreshness() +
                ", price=" + CHRYSANTEMUM_PRICE +
                "}\n";
    }
}


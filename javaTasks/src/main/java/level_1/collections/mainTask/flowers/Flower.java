package level_1.collections.mainTask.flowers;

import level_1.collections.mainTask.flowers.characteristic.Color;
import level_1.collections.mainTask.flowers.characteristic.Freshness;

public abstract
class Flower {
    private String name;
    private Color color;
    private int stalkLength;
    private Freshness freshness;
    private double price;

    public
    Flower(Color color, int stalkLength, Freshness freshness) {
        this.color = color;
        this.stalkLength = stalkLength;
        this.freshness = freshness;
    }

    public
    String getName() {
        return name;
    }

    public
    Color getColor() {
        return color;
    }

    public
    int getStalkLength() {
        return stalkLength;
    }

    public
    Freshness getFreshness() {
        return freshness;
    }

    public
    double getPrice() {
        return price;
    }

    @Override
    public
    String toString() {
        return "Flower{" +
                "name='" + name + '\'' +
                ", color=" + color +
                ", stalkLength=" + stalkLength +
                ", freshness=" + freshness +
                ", price=" + price +
                "}";
    }

}

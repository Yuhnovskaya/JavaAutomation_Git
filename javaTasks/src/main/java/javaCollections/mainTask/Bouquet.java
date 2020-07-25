package javaCollections.mainTask;

import javaCollections.mainTask.accessories.Paper;
import javaCollections.mainTask.flowers.Flower;

import java.util.ArrayList;
import java.util.List;

public
class Bouquet {
    private List<Flower> flowers;
    private Paper paper;

    public
    Bouquet(List<Flower> flowers, Paper paper) {
        this.flowers = flowers;
        this.paper = paper;
    }

    @Override
    public
    String toString() {
        return "Bouquet{" +
                "flower=" + flowers +
                ", paper=" + paper +
                '}';
    }

    public
    double getPrice() {
        double flowersPrice = 0;
        for (Flower flower : this.flowers) {
            flowersPrice += flower.getPrice();
        }
        return flowersPrice + this.paper.getPrice();
    }

    public
    List<Flower> getFlowerInStalkLengthsRange(int minStalkLength, int maxStalkLength) {
        List<Flower> flowers = new ArrayList<>();
        for (Flower flower : this.flowers) {
            if (flower.getStalkLength() >= minStalkLength & flower.getStalkLength() <= maxStalkLength) {
                flowers.add(flower);
            }
        }
        return flowers;
    }
}

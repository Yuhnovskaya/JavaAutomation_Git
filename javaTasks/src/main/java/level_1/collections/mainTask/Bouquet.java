package level_1.collections.mainTask;

import level_1.collections.mainTask.accessories.Paper;
import level_1.collections.mainTask.flowers.Flower;

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
        for (Flower flower : flowers) {
            flowersPrice += flower.getPrice();
        }
        return flowersPrice + paper.getPrice();
    }

    public
    List<Flower> getFlowerInStalkLengthsRange(int minStalkLength, int maxStalkLength) {
        List<Flower> flowersList = new ArrayList<>();
        for (Flower flower : flowers) {
            if (flower.getStalkLength() >= minStalkLength & flower.getStalkLength() <= maxStalkLength) {
                flowersList.add(flower);
            }
        }
        return flowersList;
    }
}

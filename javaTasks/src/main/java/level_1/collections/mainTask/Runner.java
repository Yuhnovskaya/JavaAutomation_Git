package level_1.collections.mainTask;

import level_1.collections.mainTask.accessories.Paper;
import level_1.collections.mainTask.accessories.PaperType;
import level_1.collections.mainTask.flowers.Flower;
import level_1.collections.mainTask.flowers.characteristic.Color;
import level_1.collections.mainTask.flowers.characteristic.Freshness;
import level_1.collections.mainTask.flowers.types.Chrysanthemum;
import level_1.collections.mainTask.flowers.types.Lily;
import level_1.collections.mainTask.flowers.types.Rose;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

//Задание. Создать консольное приложение, удовлетворяющее следующим требованиям:
//Каждый класс должен иметь отражающее смысл название и информативный состав.
//Использовать возможности ООП: классы, наследование, полиморфизм, инкапсуляция.
//Наследование должно применяться только тогда, когда это имеет смысл.
//При кодировании должны быть использованы соглашения об оформлении кода java code convention.
//Классы должны быть грамотно разложены по пакетам
//Консольное меню должно быть минимальным.
//Для хранения параметров инициализации можно использовать файлы.
//1. Цветочница. Определить иерархию цветов. Создать несколько объектов-цветов.
// Собрать букет (используя аксессуары) с определением его стоимости.
// Провести сортировку цветов в букете на основе уровня свежести.
// Найти цветок в букете, соответствующий заданному диапазону длин стеблей.
public
class Runner {
    public static
    void main(String[] args) {
        int minStalkLength = 48;
        int maxStalkLength = 54;
        List<Flower> flowers = Arrays.asList(
                new Rose(Color.YELLOW, 50, Freshness.HIGH_FRESH),
                new Rose(Color.YELLOW, 48, Freshness.HIGH_FRESH),
                new Rose(Color.YELLOW, 54, Freshness.MIDDLE_FRESH),
                new Rose(Color.YELLOW, 55, Freshness.LOW_FRESH),
                new Rose(Color.YELLOW, 50, Freshness.MIDDLE_FRESH),
                new Lily(Color.WHITE, 42, Freshness.HIGH_FRESH),
                new Lily(Color.WHITE, 46, Freshness.MIDDLE_FRESH),
                new Chrysanthemum(Color.WHITE, 40, Freshness.LOW_FRESH)
        );
        Paper paper = new Paper(PaperType.CORRUGATED);
        Bouquet bouquet = new Bouquet(flowers, paper);
        System.out.println(bouquet);
        System.out.println("The price of the bouquet is " + bouquet.getPrice());
        flowers.sort(Comparator.comparing(Flower::getFreshness));
        System.out.println("The bouquet flowers sorted by freshness:\n" + flowers);
        System.out.println("The bouquet flowers with stalk length from " + minStalkLength + " to " + maxStalkLength + ":\n" + bouquet.getFlowerInStalkLengthsRange(minStalkLength, maxStalkLength));
    }
}


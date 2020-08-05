package level_2.threads.optionalTask;
//В аэропорту есть 5 взлетно-посадочных полос. Самолету требуется 3 минуты чтобы
// выйти на полосу, набрать скорость и взлететь. После этого полоса свободна для
// вылета следующего самолета. Реализовать симуляцию вылета 10 самолетов используя
// все доступные полосы. 1 минуту реально времени заменить на 1 секунду в симуляции.
// Вывести в консоль информацию о следующих событиях:
//
//Самолет начал выход на полосу
//Самолет взлетел
//Полоса "приняла" самолет
//Полоса освободилась
public
class Runner {
    public static
    void main(String[] args) {
        PlanesQueue queue1 = new PlanesQueue(1, 1, 6);
        PlanesQueue queue2 = new PlanesQueue(2, 2, 7);
        PlanesQueue queue3 = new PlanesQueue(3, 3, 8);
        PlanesQueue queue4 = new PlanesQueue(4, 4, 9);
        PlanesQueue queue5 = new PlanesQueue(5, 5, 10);
        queue1.start();
        queue2.start();
        queue3.start();
        queue4.start();
        queue5.start();
    }
}

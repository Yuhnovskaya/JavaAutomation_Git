package javaClasses.mainTask4;

//4. Abiturient: id, Фамилия, Имя, Отчество, Адрес, Телефон, Оценки.
//Создать массив объектов. Вывести:
//a) список абитуриентов, имеющих неудовлетворительные оценки;
//b) список абитуриентов, у которых сумма баллов выше заданной;
//c) выбрать заданное число n абитуриентов, имеющих самую высокую сумму баллов
// Определить конструкторы и методы setТип(), getТип(), toString().
// Определить дополнительно методы в классе, создающем массив объектов.
// Задать критерий выбора данных и вывести эти данные на консоль.
// В каждом классе, обладающем информацией, должно быть объявлено несколько конструкторов.
public class Runner {
    public static void main(String[] args) {
        DataArray dataArray = new DataArray();
        CheckingGrades checkingGrades = new CheckingGrades();
        int passingScore = 9;
        dataArray.abiturient[0] = new Abiturient(1, "firstName1", "middleName1", "lastName1", "address1", 1111111, 5, 3, 2);
        dataArray.abiturient[1] = new Abiturient(2, "firstName2", "middleName2", "lastName2", "address2", 2222222, 4, 4, 4);
        dataArray.abiturient[2] = new Abiturient(3, "firstName3", "middleName3", "lastName3", "address3", 3333333, 2, 2, 3);
        dataArray.abiturient[3] = new Abiturient(4, "firstName4", "middleName4", "lastName4", "address4", 4444444, 3, 5, 5);
        dataArray.abiturient[4] = new Abiturient(5, "firstName5", "middleName5", "lastName5", "address5", 5555555, 2, 3, 2);
        for (int i = 0; i < dataArray.abiturient.length; i++) {
            System.out.println(dataArray.abiturient[i]);
        }
        System.out.println("Abiturients with bad grades:");
        checkingGrades.findBadAbiturients(dataArray.abiturient);
        System.out.println("Abiturients with total grade more than passing score:");
        checkingGrades.findGoodAbiturient(dataArray.abiturient, passingScore);
    }
}

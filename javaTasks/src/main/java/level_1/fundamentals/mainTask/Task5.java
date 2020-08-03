package level_1.fundamentals.mainTask;

import java.time.Month;
import java.util.Scanner;

//Ввести число от 1 до 12. Вывести на консоль название месяца,
// соответствующего данному числу. Осуществить проверку корректности ввода чисел
public
class Task5 {
    public static
    void main(String[] args) {
        int lastMonthNumber = 12;
        int firtstMonthNumber = 1;
        System.out.println("Enter number from 1 to 12:");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        if (num >= firtstMonthNumber & num < lastMonthNumber) {
            System.out.print("Month number " + num + " is " + Month.of(num));
        } else {
            System.out.println("Number is not correct!");
        }
        scanner.close();
    }
}

package javaFundamentals.mainTask;

import java.time.Month;
import java.util.Scanner;

//Ввести число от 1 до 12. Вывести на консоль название месяца,
// соответствующего данному числу. Осуществить проверку корректности ввода чисел
public
class Task5 {
    public static
    void main(String[] args) {
        System.out.println("Enter number from 1 to 12:");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        System.out.print("Month number " + num + ": " + Month.of(num));
    }
}

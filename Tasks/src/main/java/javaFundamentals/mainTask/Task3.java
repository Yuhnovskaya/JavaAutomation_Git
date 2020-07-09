package javaFundamentals.mainTask;

//Вывести заданное количество случайных чисел с переходом и без перехода на новую строку
public class Task3 {
    public static void main(String[] args) {
        int number = 5;

        System.out.println("random numbers with a new line transition:");
        for (int i = 1; i <= number; i++) {
            System.out.println((int)(Math.random()*10));
        }
        System.out.println("random numbers without a new line transition:");
        for (int i = 1; i <= number; i++) {
            System.out.print((int)(Math.random()*10)+" ");
        }
    }
}

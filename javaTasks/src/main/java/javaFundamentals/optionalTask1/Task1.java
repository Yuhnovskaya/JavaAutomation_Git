package javaFundamentals.optionalTask1;

import java.util.Scanner;

//Ввести n чисел с консоли. Найти самое короткое и самое длинное число. Вывести найденные числа и их длину.
public class Task1 {
    public static void main(String[] args) {
        int n = 5;
        System.out.println("Enter " + n + " numbers:");
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        int lengthMax = Integer.toString(array[0]).length();
        int lengthMin = Integer.toString(array[0]).length();
        for (int i = 1; i < n; i++) {
            if (Integer.toString(array[i]).length() > lengthMax) {
                lengthMax = Integer.toString(array[i]).length();
            }
            if (Integer.toString(array[i]).length() < lengthMin) {
                lengthMin = Integer.toString(array[i]).length();
            }
        }
        for (int i = 0; i < n; i++) {
            if (Integer.toString(array[i]).length() == lengthMax) {
                System.out.println("number with max length: " + array[i]);
                System.out.println("Max length: "+Integer.toString(array[i]).length());
            }
            if (Integer.toString(array[i]).length() == lengthMin) {
                System.out.println("number with max length: " + array[i]);
                System.out.println("Min length: "+Integer.toString(array[i]).length());
            }
        }
    }
}

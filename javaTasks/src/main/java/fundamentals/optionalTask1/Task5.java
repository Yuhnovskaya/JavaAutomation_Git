package fundamentals.optionalTask1;

import java.util.Scanner;

// Ввести n чисел с консоли. Найти количество чисел, содержащих только четные цифры,
// а среди оставшихся — количество чисел с равным числом четных и нечетных цифр.
public
class Task5 {
    public static
    void main(String[] args) {
        int n = 6;
        System.out.println("Enter " + n + " numbers:");
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        int numEven = 0;
        int numEvenOdd = 0;
        for (int i = 0; i < n; i++) {
            char[] i_array = Integer.toString(array[i]).toCharArray();
            int i_numEven = 0;
            for (int j = 0; j < i_array.length; j++) {
                if (i_array[j] % 2 == 0) {
                    i_numEven += 1;
                }
            }
            if (i_numEven == i_array.length) {
                numEven += 1;
            } else if (i_array.length % 2 == 0 & i_numEven == i_array.length / 2) {
                numEvenOdd += 1;
            }
        }
        System.out.println("the number of numbers that consists only of even numbers: " + numEven);
        System.out.println("the number of numbers that consists of equal number of even and odd numbers: " + numEvenOdd);
    }
}

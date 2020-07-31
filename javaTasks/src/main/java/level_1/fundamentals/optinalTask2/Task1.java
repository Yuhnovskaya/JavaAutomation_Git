package level_1.fundamentals.optinalTask2;

import java.util.Scanner;

//Ввести с консоли n - размерность матрицы a [n] [n]. Задать значения элементов матрицы
// в интервале значений от -M до M с помощью генератора случайных чисел (класс Random).
//Упорядочить строки (столбцы) матрицы в порядке возрастания значений элементов k-го столбца (строки).
public
class Task1 {
    public static
    void main(String[] args) {
        System.out.println("Enter array size n:");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println("Enter M:");
        int M = scanner.nextInt();
        System.out.println("Enter k:");
        int k = scanner.nextInt();
        int[][] array = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                array[i][j] = -M + (int) (Math.random() * (2 * M + 1));
            }
        }
        System.out.println("Random array:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }

        int[][] arrayStrings = new int[n][n];
        int[][] arrayColums = new int[n][n];
        System.arraycopy(array, 0, arrayStrings, 0, array.length);
        System.arraycopy(array, 0, arrayColums, 0, array.length);

        System.out.println("Result arraySwapStrings:");
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arrayStrings[i][k] > arrayStrings[j][k]) {
                    int[] temp = arrayStrings[i];
                    arrayStrings[i] = arrayStrings[j];
                    arrayStrings[j] = temp;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arrayStrings[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("Result arraySwapColums:");
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arrayColums[k][i] > arrayColums[k][j]) {
                    swapColumns(arrayColums, i, j);
                }
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arrayColums[i][j] + "\t");
            }
            System.out.println();
        }
    }

    private static
    void swapColumns(int[][] array, int first, int second) {
        for (int r = 0; r < array.length; r++) {
            int temp = array[r][first];
            array[r][first] = array[r][second];
            array[r][second] = temp;
        }
    }

    int mas7[][] = new int[4][];
}

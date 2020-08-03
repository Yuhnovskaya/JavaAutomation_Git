package level_1.collections.optionalTask;

import java.util.*;

//2.   Ввести число, занести его цифры в стек. Вывести число, у которого цифры идут в обратном порядке.
public
class Task2 {
    public static
    void main(String[] args) {
        System.out.println("Enter number:");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        char[] numberArray = Integer.toString(number).toCharArray();
        Stack stack = new Stack();
        for (int i = 0; i < numberArray.length; i++) {
            stack.push(numberArray[i]);
        }
        while (!stack.isEmpty()) {
            System.out.print(stack.pop());
        }
        scanner.close();
    }
}



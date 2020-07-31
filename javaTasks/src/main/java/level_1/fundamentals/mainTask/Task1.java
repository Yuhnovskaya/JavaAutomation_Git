package level_1.fundamentals.mainTask;
//Приветствовать любого пользователя при вводе его имени через командную строку.

import java.util.Scanner;

public
class Task1 {
    public static
    void main(String[] args) {
        System.out.println("Enter user name:");
        Scanner scanner = new Scanner(System.in);
        String username = scanner.nextLine();
        System.out.println("Message: \"Hellow," + username + "!\"");
    }
}

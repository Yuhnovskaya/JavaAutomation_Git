package level_1.fundamentals.mainTask;

//Отобразить в окне консоли аргументы командной строки в обратном порядке.
public
class Task2 {
    public static
    void main(String[] args) {
        for (int i = args.length - 1; i >= 0; i--) {
            System.out.print(args[i]);
        }
    }
}

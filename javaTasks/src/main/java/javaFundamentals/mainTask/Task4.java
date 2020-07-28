package javaFundamentals.mainTask;

//Ввести целые числа как аргументы командной строки,
// подсчитать их сумму (произведение) и вывести результат на консоль.
public
class Task4 {
    public static
    void main(String[] args) {
        int sum = 0;
        int multiplication = 1;
        for (int i = 0; i < args.length; i++) {
            sum += Integer.valueOf(args[i]);
            multiplication *= Integer.valueOf(args[i]);
        }
        System.out.print("sum=" + sum + "\nmultiplication=" + multiplication);
    }
}

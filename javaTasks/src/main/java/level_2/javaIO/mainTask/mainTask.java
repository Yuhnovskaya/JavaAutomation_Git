package level_2.javaIO.mainTask;

import java.io.*;
import java.util.Scanner;

//Реализовать программу которая будет получать в качестве аргумента командной строки путь к директории,
// например "D:/movies". Записать в текстовый файл структуру папок и файлов в виде, похожем на выполнение
// программы tree /F.
/*Если в качестве параметра в программу передается не путь к директории, а путь к txt файлу по образцу выше -
прочитать файл и вывести в консоль следующие данные:
        Количество папок
        Количество файлов
        Среднее количество файлов в папке
        Среднюю длинну названия файла*/
public
class mainTask {
    public static
    void main(String[] avgs) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter path's name:");
        String pathName = scanner.nextLine();//src\main\java\level_1\fundamentals
        File data = new File(pathName);
        FileWriter writer = new FileWriter("src\\main\\java\\level_2\\javaIO\\mainTask\\catalog.txt");
        BufferedWriter bufferedWriter = new BufferedWriter(writer);
        bufferedWriter.write(data.getName() + "\n");
        bufferedWriter.flush();
        int foldersNumber = 0;
        int filesNumber = 0;
        int totalFilesNameLength = 0;
        for (File folder : data.listFiles()) {
            bufferedWriter.write("    |\n    |----" + folder.getName() + "\n");
            bufferedWriter.flush();
            foldersNumber += 1;
            for (File file : folder.listFiles()) {
                bufferedWriter.write("    |    " + file.getName() + "\n");
                bufferedWriter.flush();
                filesNumber += 1;
                totalFilesNameLength += file.getName().length();
            }
        }
        System.out.println("Number of folders: " + foldersNumber);
        System.out.println("Number of files: " + filesNumber);
        System.out.println("Averade number of files in folder: " + Math.round(filesNumber / foldersNumber));
        System.out.println("Average length of file's name: " + Math.round(totalFilesNameLength / filesNumber));
    }
}

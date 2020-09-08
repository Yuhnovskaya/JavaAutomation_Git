package level_2.javaIO.mainTask;

import java.io.*;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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
        String catalogPath = "src\\main\\java\\level_2\\javaIO\\mainTask\\catalog.txt";
        FileWriter writer = new FileWriter(catalogPath);
        BufferedWriter bufferedWriter = new BufferedWriter(writer);
        bufferedWriter.write(data.getName() + "\n");
        bufferedWriter.flush();
        int foldersNumber = 0;
        int filesNumber = 0;
        int totalFilesNameLength = 0;
        if (data.isDirectory()) {
            for (File item : data.listFiles()) {
                if (item.isDirectory()) {
                    bufferedWriter.write("    |\n    |----" + item.getName() + "\n");
                    bufferedWriter.flush();
                    for (File file : item.listFiles()) {
                        bufferedWriter.write("    |    " + file.getName() + "\n");
                        bufferedWriter.flush();
                    }
                } else {
                    bufferedWriter.write("    |    " + item.getName() + "\n");
                    bufferedWriter.flush();
                }
            }
        }
        FileReader fileReader = new FileReader(catalogPath);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String line = bufferedReader.readLine();
        String catalogText = new String();
        while (line != null) {
            catalogText += line + "\n";
            if (line.contains("    |----")) {
                foldersNumber += 1;
            }
            if (line.contains("    |    ")) {
                filesNumber += 1;
                line = line.replaceFirst("    \\|    ", "");
                totalFilesNameLength += line.length();
            }
            line = bufferedReader.readLine();
        }
        System.out.println(catalogText);
        System.out.println("Number of folders: " + foldersNumber);
        System.out.println("Number of files: " + filesNumber);
        System.out.println("Averade number of files in folder: " + Math.round(filesNumber / foldersNumber));
        System.out.println("Average length of file's name: " + Math.round(totalFilesNameLength / filesNumber));
    }
}

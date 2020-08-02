package level_2.javaIO.optionalTask.task11;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//11.  Ввести из текстового файла, связанного с входным потоком, последовательность строк.
// Выбрать и сохранить m последних слов в каждой из по-следних n строк.
public
class Task11 {
    public static
    void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of last lines n=");
        int n = scanner.nextInt();
        System.out.print("Enter number of last words m=");
        int m = scanner.nextInt();
        try (FileReader fileReader = new FileReader("src\\main\\java\\level_2\\javaIO\\optionalTask\\task11\\data")) {
            FileWriter fileWriter = new FileWriter("src\\main\\java\\level_2\\javaIO\\optionalTask\\task11\\result");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            String line = bufferedReader.readLine();
            List<String> lineList = new ArrayList<>();
            String stringOfWords = new String();
            while (line != null) {
                lineList.add(line);
                line = bufferedReader.readLine();
            }
            for (int i = lineList.size() - 1; i > lineList.size() - 1 - n; i--) {
                Pattern wordsPattern = Pattern.compile(String.format("( +\\w+\\p{Punct}*){%s}$",m));
                Matcher wordsMatcher = wordsPattern.matcher(lineList.get(i));
                while (wordsMatcher.find()) {
                    stringOfWords = lineList.get(i).substring(wordsMatcher.start(), wordsMatcher.end());
                }
                bufferedWriter.write(stringOfWords.replaceAll("\\p{Punct}", "")+"\n");
                bufferedWriter.flush();
            }
        } catch (FileNotFoundException fileNotFoundException) {
            fileNotFoundException.printStackTrace();
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
    }
}
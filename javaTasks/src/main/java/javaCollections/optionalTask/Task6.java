package javaCollections.optionalTask;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

//6. Ввести строки из файла, записать в список ArrayList.
// Выполнить сортировку строк, используя метод sort() из класса Collections.
public class Task6 {
    private static final Comparator<String> LINE_COMPARATOR=new Comparator<String>() {
        @Override
        public
        int compare(String o1, String o2) {
            return o1.length() - o2.length();
        }
    };
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        try {
            File file = new File("javaTasks/src/main/resources/text");
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = bufferedReader.readLine();
            while (line != null) {
                list.add(line);
                line = bufferedReader.readLine();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.fillInStackTrace();
        }
        Collections.sort(list,LINE_COMPARATOR);
        System.out.println(list);
 }
}

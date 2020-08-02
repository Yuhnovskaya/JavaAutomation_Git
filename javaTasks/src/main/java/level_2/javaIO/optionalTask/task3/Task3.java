package level_2.javaIO.optionalTask.task3;

import java.io.*;

//3.  Прочитать текст Java-программы и записать в другой файл в обратном порядке символы каждой строки.
public
class Task3 {
    public static
    void main(String[] args) {
        try (FileReader fileReader = new FileReader("src\\main\\java\\level_2\\javaIO\\optionalTask\\task3\\data.java");) {
            FileWriter fileWriter = new FileWriter("src\\main\\java\\level_2\\javaIO\\optionalTask\\task3\\result");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            String line = bufferedReader.readLine();
            while (line != null) {
                String lineRevers = new StringBuffer(line).reverse().toString();
                bufferedWriter.write(lineRevers + "\n");
                bufferedWriter.flush();
                line = bufferedReader.readLine();
            }
        } catch (FileNotFoundException fileNotFoundException) {
            fileNotFoundException.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


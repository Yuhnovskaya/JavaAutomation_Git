package level_2.javaIO.optionalTask.task9;

//9.     Из текста Java-программы удалить все виды комментариев.

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public
class Task9 {
    public static
    void main(String[] args) {
        try (FileReader fileReader = new FileReader("src\\main\\java\\level_2\\javaIO\\optionalTask\\task9\\data.java")) {
            FileWriter fileWriter = new FileWriter("src\\main\\java\\level_2\\javaIO\\optionalTask\\task9\\result");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            String line = bufferedReader.readLine();
            String text = new String();
            while (line != null) {
                text += line + "\n";
                line = bufferedReader.readLine();
            }
            Pattern pattern = Pattern.compile("//.+|\\/\\*.*(\\n+[^\\*\\/]*)*?\\*\\/|\\/\\*{2}.*(\\n+[^\\*\\/]*)*?\\*\\/");
            Matcher matcher = pattern.matcher(text);
            text = matcher.replaceAll("");
            bufferedWriter.write(text);
            bufferedWriter.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

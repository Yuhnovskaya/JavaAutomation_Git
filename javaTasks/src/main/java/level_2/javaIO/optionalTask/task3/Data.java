package level_2.javaIO.optionalTask.task3;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public
class Data {

//Comment

    private static final Comparator<String> LINE_COMPARATOR = new Comparator<String>() {
        @Override
        public
        int compare(String o1, String o2) {
            return o1.length() - o2.length();//Comment
        }
    };
/*Comment*/
    public static
    void main(String[] args) {
        List<String> list = new ArrayList<>();
        try {
            File file = new File("javaTasks/src/main/resources/text");
            FileReader fileReader = new FileReader(file);
            BufferedReader /*Comment*/bufferedReader = new BufferedReader(fileReader);
            String line = bufferedReader.readLine();
            while (line != null) {
                list.add(line);
                line = bufferedReader.readLine();
            }
            /**Comment comment
             comment
             comment*/
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {/*Comment
        comment*/
            e.fillInStackTrace();
        }
        Collections.sort(list, LINE_COMPARATOR);
        System.out.println(list);
    }
}

//Comment
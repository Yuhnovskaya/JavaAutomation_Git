package javaCollections.optionalTask;

import java.lang.reflect.Array;
import java.util.*;


//4.   Занести стихотворение в список. Провести сортировку по возрастанию длин строк.
public class Task4 {
    private static final String POEM=
    "There is another sky,\n"+
    "Ever serene and fair,\n"+
    "And there is another sunshine,\n"+
    "Though it be darkness there;\n"+
    "Never mind faded forests, Austin,\n"+
    "Never mind silent fields -\n"+
    "Here is a little forest,\n"+
    "Whose leaf is ever green;\n"+
    "Here is a brighter garden,\n"+
    "Where not a frost has been;\n"+
    "In its unfading flowers\n"+
    "I hear the bright bee hum:\n"+
    "Prithee, my brother,\n"+
    "Into my garden come!\n";
    private static final Comparator<String> LINE_COMPARATOR=new Comparator<String>() {
        @Override
            public int compare(String o1, String o2){
                return o1.length()-o2.length();
            }
    };
    public static void main (String[]args){
        List<String> lines= Arrays.asList(POEM.split("\n"));
        Collections.sort(lines,LINE_COMPARATOR);
        System.out.println(lines);
    }
}

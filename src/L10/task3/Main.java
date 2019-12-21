package L10.task3;

import java.util.*;
import java.util.function.*;

public class Main {
    public static void main(String[] args) {
        String[] array1 = {"мама", "мыла", "раму"};
        String[] array2 = {"я", "очень", "люблю", "java"};
        String[] array3 = {"мир", "труд", "май"};

        List<String[]> arrays = new ArrayList<>();
        arrays.add(array1);
        arrays.add(array2);
        arrays.add(array3);

//        Comparator<String[]> sortByLength = (o1, o2) -> o1.length - o2.length;
        arrays.sort((o1, o2) -> o1.length - o2.length);
//        Comparator<String[]> sortByLength = new Comparator<String[]>() {
//            @Override
//            public int compare(String[] o1, String[] o2) {
//                return o1.length - o2.length;
//            }
//        };
        arrays.forEach(sarr -> Arrays.asList(sarr).forEach(ss -> System.out.println(ss + " " + sarr)));
    }
}

package L10.task3;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String[] array1 = {"мама", "мыла", "раму"};
        String[] array2 = {"я", "очень", "люблю", "java"};
        String[] array3 = {"мир", "труд", "май"};

        List<String[]> arrays = new ArrayList<>();
        arrays.add(array1);
        arrays.add(array2);
        arrays.add(array3);

        Comparator<String[]> sortByLength = (o1, o2) -> o1.length - o2.length;
        arrays.sort(sortByLength);
//        Comparator<String[]> sortByLength = new Comparator<String[]>() {
//            @Override
//            public int compare(String[] o1, String[] o2) {
//                return o1.length - o2.length;
//            }
//        };

        arrays.forEach(s -> {
            for (String ss: s) System.out.println(ss);
            System.out.println();
        });
    }
}

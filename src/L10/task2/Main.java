package L10.task2;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("a", "b", "c");
        for (String e: strings) {
            System.out.println(e);
        }
        strings.forEach(e -> System.out.println(e));
    }
}

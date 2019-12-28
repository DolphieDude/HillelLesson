package L11.task1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("One");
        list.add("Two");
        list.add("Three");
        list.add("Four");
        list.add("Five");
        list.add("Six");
        list.add("Seven");
        list.add("Eight");
        list.add("Nine");
        list.add("Ten");
        Stream<String> stream = list.stream();
        stream.filter(x -> x.length() > 4)
                .forEach(System.out::println);

        //Пустой стрим: Stream.empty()
        //Стрим из List: list.stream()
        //Стрим из Map: map.entrySet().stream()
        //Стрим из массива: Arrays.stream(array)
        //Стрим из указанных элементов: Stream.of("1", "2", "3")


    }
}

package L10.task6;

import java.util.function.BiFunction;

public class Main {
    public static void main(String[] args) {
        BiFunction<String, String, String> lambda = (first, second) -> {
            if (first.length() > second.length()) return first;
            else if (first.length() == second.length()) return null;
            else return second;
        };
        System.out.println(lambda.apply("Hello", "World"));
        System.out.println(lambda.apply("Hello", "Andrii"));
        System.out.println(lambda.apply("Bye", "World"));
    }
}

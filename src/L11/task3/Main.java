package L11.task3;

import java.util.UUID;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        System.out.println(Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9)
                .reduce((acc, x) -> acc + x).orElse(0)); //orElse for Optional (data type)
        System.out.println(Stream.of("1", "2", "3", "4", "5", "6", "7", "8", "9")
                .reduce((acc, x) -> acc + x).orElse("no"));
//        UUID.randomUUID()
    }
}

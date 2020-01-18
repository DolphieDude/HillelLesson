package L11.task2;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        String[] cars = new String[] {"Sedan", "sedAn", "tRuck", "Roadster", "hatchback", "sedan", "truck", "Pickup", "SEDAN"};
        List<String> list = Arrays.asList(cars);
        System.out.println(list.stream().filter(c -> c.toLowerCase().equals("sedan"))
                .count());
    }
}

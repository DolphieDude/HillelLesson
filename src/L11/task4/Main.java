package L11.task4;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map map = new HashMap<>();
        for (int i = 0; i < 10; i++) {
            map.putIfAbsent(i, "val" + i);
        }
        map.forEach((id, val) -> System.out.println(val));
        map.computeIfPresent(9, (num, val) -> null);
        System.out.println(map.containsKey(9));     // false
    }
}

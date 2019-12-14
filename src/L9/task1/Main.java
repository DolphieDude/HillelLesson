package L9.task1;

import java.util.*;

public class Main {
    private static Map<String, Integer> staticMap = new HashMap<>();
    static {
        staticMap.put("monday", 1);
        staticMap.put("tuesday", 2);
        staticMap.put("wednesday", 3);
        staticMap.put("thursday", 4);
        staticMap.put("friday", 5);
        staticMap.put("saturday", 6);
        staticMap.put("sunday", 7);
    }
    public static void main(String[] args) {
        System.out.println(staticMap.get("tuesday"));
    }
}

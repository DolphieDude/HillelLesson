package L10.task5;

public class Main {
    public static void main(String[] args) {
        Setterer<Robot> lambda = (object, name, age) -> {
            object.setName(name + ":[" + age + "]^");
            object.setAge(age);
        };
        Robot bot = new Robot();
        System.out.println(bot);
        setEntity(bot, lambda, "Atlas", 3);
        System.out.println(bot);
    }

    private static <T extends WithNameAndAge> void setEntity(T object, Setterer<T> setterer, String name, int age) {
        setterer.set(object, name, age);
    }
}

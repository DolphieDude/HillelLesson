package L10.task5;

@FunctionalInterface
public interface Setterer<T extends WithNameAndAge> {
    void set(T object, String name, Integer age);
}

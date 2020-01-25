package L13.task1;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Objects;

public class Main {
    public static void main(String[] args) throws NoSuchMethodException {
        Main main = new Main();
        Class<?> clazz = main.getClass();
        Method method = clazz.getDeclaredMethod("method", String.class, int.class);
        System.out.println(method.isAnnotationPresent(MyAnnotation.class));
        final MyAnnotation annotation = method.getAnnotation(MyAnnotation.class);
        if (Objects.isNull(annotation)) {
            System.out.println("no anno");
        } else {
            System.out.println("anno");
            System.out.println(annotation.value());
            try {
                method.invoke(null, annotation.value(), 2020);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    @MyAnnotation
    public static void method(String str, int val) {
        System.out.println(String.format("%s - %d", str, val));
    }
}

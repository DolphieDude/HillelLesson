package L13.task1;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//@Target(ElementType.)
@Retention(RetentionPolicy.RUNTIME)
public @interface MyAnnotation {
    String value() default "default";
}

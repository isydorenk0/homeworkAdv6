package Ex3;

import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
@Inherited
@Retention(RetentionPolicy.RUNTIME)
public @interface AnnotationAnimal {
    String author() default "isydorenko";
    double version() default 0.1;
    String date() default "02/05/2023";
}

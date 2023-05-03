package Ex2;

import java.lang.annotation.Documented;

@Documented
public @interface AnnotationCalculator {
    String author() default "isydorenko";
    double version() default 0.1;
    String date() default "02/05/2023";
}

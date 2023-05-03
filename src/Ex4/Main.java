package Ex4;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
        Method[] methodMathSums = MathSum.class.getDeclaredMethods();
        for (Method methodMathSum : methodMathSums) {
            if (methodMathSum.isAnnotationPresent(Math.class)) {
                Math annoMaths = methodMathSum.getAnnotation(Math.class);
                System.out.println((int) methodMathSum.invoke(null, annoMaths.num1(), annoMaths.num2()));
            }
        }
    }
}


package Ex3;

import java.lang.annotation.Annotation;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Annotation[] annoCats = cat.getClass().getAnnotations() ;
        for (Annotation annoCat:
             annoCats) {
            System.out.println(annoCat.toString());
        }

        Dog dog = new Dog();
        Annotation[] annoDogs = dog.getClass().getAnnotations() ;
        for (Annotation annoDog:
                annoDogs) {
            System.out.println(annoDog.toString());
        }
    }
}

package Ex3;

@AnimalType(type = "dog")
public class Dog extends Animal{

    @Override
    public void makeNoise() {
        System.out.println("woof-woof");
    }
}

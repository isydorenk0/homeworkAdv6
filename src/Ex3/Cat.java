package Ex3;

@AnimalType(type = "cat")
public class Cat extends Animal{
    @Override
    public void makeNoise() {
        System.out.println("meow-meow");
    }
}

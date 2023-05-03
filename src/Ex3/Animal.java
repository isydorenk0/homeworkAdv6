package Ex3;

@AnnotationAnimal
public class Animal {
    private boolean tail;
    private String foodType;
    private String location;
    public Animal(){
        this.tail = true;
        this.foodType = "meat";
        this.location = "Europe";
    }
    public void makeNoise(){
        System.out.println("SomeNoise");
    }

    @Deprecated
    public void sleep(int hours){
        System.out.println("it sleeps for " + hours + " hours");
    }
}

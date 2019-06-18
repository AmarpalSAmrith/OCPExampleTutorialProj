package AmarpalAmrith.OCP.ExampleMaterial.Animals.Mammals.Canine;

public class Dog extends Canine{

    String name = "dog;";
    int numberOfBones = 0;

    @Override
    public void bark() {
        System.out.println("Woof!");
    }

    @Override
    public void printName() {
        System.out.println(name);
    }

    @Override
    public void addBone() {
        numberOfBones++;
    }


}

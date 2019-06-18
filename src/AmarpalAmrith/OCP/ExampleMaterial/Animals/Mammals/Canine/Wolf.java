package AmarpalAmrith.OCP.ExampleMaterial.Animals.Mammals.Canine;

public class Wolf extends Canine {

    String name = "Wolf";
    int numberOfBones = 0;

    @Override
    public void bark() {
        System.out.println("Wolf Woof!");
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

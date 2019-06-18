package AmarpalAmrith.OCP.ExampleMaterial.Animals.Mammals.Canine;

import AmarpalAmrith.OCP.ExampleMaterial.Animals.Animal;

public abstract class Canine implements Animal {

    protected String name = "Canine";

    protected abstract void bark();

    public void printName(){
        System.out.println(name);
    }

    protected abstract void addBone();
}

package AmarpalAmrith.OCP;

import AmarpalAmrith.OCP.ExampleMaterial.Animals.Animal;
import AmarpalAmrith.OCP.ExampleMaterial.Animals.Mammals.Canine.Canine;
import AmarpalAmrith.OCP.ExampleMaterial.Animals.Mammals.Canine.Dog;
import AmarpalAmrith.OCP.ExampleMaterial.Animals.Mammals.Canine.Wolf;

public class Main {

    public static void main(String[] args) {
	    Animal wolf = new Wolf();

	    ((Wolf) wolf).printName();
        System.out.println(wolf.getClass());
        System.out.println(wolf instanceof Animal);
        System.out.println(wolf instanceof Dog);
        System.out.println(wolf instanceof Canine);
        System.out.println(wolf instanceof Wolf);
    }
}

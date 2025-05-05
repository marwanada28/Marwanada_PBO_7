##marwa nada
package Main;

import Model.Dog;
import Model.Cat;
import Service.PetManager;

public class Main {
    public static void main(String[] args) {
        PetManager<Dog> dogManager = new PetManager<>();
        dogManager.addPet(new Dog(1, "Rex"));
        dogManager.addPet(new Dog(2, "Buddy"));

        PetManager<Cat> catManager = new PetManager<>();
        catManager.addPet(new Cat(3, "Misty"));
        catManager.addPet(new Cat(4, "Whiskers"));

        System.out.println("=== Dogs ===");
        dogManager.listPets();

        System.out.println("\n=== Cats ===");
        catManager.listPets();
    }
}

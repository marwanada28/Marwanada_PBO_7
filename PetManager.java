##marwa nada
package Service;

import Model.Animal;
import java.util.ArrayList;
import java.util.List;

public class PetManager<T extends Animal> {
    private List<T> pets = new ArrayList<>();

    public void addPet(T pet) {
        pets.add(pet);
    }

    public void listPets() {
        for (T pet : pets) {
            System.out.println("ID: " + pet.getId() + ", Name: " + pet.getName());
            pet.speak();
        }
    }
}

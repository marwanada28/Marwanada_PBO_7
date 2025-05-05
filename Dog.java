##marwa nada
package Model;

public class Dog extends Animal {
    public Dog(int id, String name) {
        super(id, name);
    }

    @Override
    public void speak() {
        System.out.println(getName() + " says: Woof!");
    }
}

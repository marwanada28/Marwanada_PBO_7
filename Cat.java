##marwa nada
package Model;

public class Cat extends Animal {
    public Cat(int id, String name) {
        super(id, name);
    }

    @Override
    public void speak() {
        System.out.println(getName() + " says: Meow!");
    }
}

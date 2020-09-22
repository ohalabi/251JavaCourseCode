package SingleInheritance;

/**
 * Created by Osama Halabi on 2020/09/22.
 */

class Animal {
    protected String name;
    void eat() {
        System.out.println("eating...");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("barking...");
    }
}

public class SingleInheritance {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.name = "Sheepdog"; // only if name is public/protected we can access in subclass
        dog.bark();
        dog.eat();
        System.out.println(dog.name);

    }
}

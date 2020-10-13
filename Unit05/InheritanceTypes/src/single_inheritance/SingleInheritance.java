package single_inheritance;

/**
 * Created by Osama Halabi on 2020/09/22.
 */

class Animal extends Object { 
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

        //Superclass can reference subclass object e.g. Animal animal = new Dog()
        // If a method exists in subclass that does not exist in superclass, casting is required.
        //((Dog) animal).bark();
        Animal animal = new Dog(); //superclass Animal referencing subclass Dog
        ((Dog) animal).bark(); //casting animal to Dog to be able to access bark() method!

        Dog dog = new Dog();
        dog.name = "Sheepdog"; // only if name is public/protected we can access in subclass
        dog.bark();
        dog.eat();
        System.out.println(dog.name);
    }
}

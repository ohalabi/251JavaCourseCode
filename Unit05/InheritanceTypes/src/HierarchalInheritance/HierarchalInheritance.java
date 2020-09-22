package HierarchalInheritance;

/**
 * Created by Osama Halabi on 2020/09/22.
 */

class Animal {
    void eat() {
        System.out.println("eating...");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("barking...");
    }
}

class Cat extends Animal {
    void meow () {
        System.out.println("meowing...");
    }
}

public class HierarchalInheritance {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Dog dog = new Dog();
        cat.meow();
        cat.eat();
        dog.bark();
        dog.eat();
    }
}

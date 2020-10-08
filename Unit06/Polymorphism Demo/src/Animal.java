/**
 * Created by Osama Halabi on 2020/10/06.
 */
class Animal { // Generic data type or supertype
    void talk() {
        System.out.println("Unknown Animal cannot talk yet");
    }
}

class Dog extends Animal {
    void talk() {
        System.out.println("Arf Arf");
    }
    void walk() {
        System.out.println("Dog walking...");
    }
}

class BabyDog extends Dog {
    void talk() {
        System.out.println("Woof Woof");
    }
}

class Cat extends Animal {
    void talk() {
        System.out.println("Meow Meow");
    }
}

// create drive test class
class TestPolymorphism {
    public static void main(String[] args) {
        // static binding demo
//        Dog dog = new Dog();
//        BabyDog babyDog = new BabyDog();
//        Cat cat = new Cat();
//
//        dog.talk();
//        babyDog.talk();
//        cat.talk();

        // Dynamic binding demo
        Animal dog = new Dog(); //Upcast
        Animal babyDog = new BabyDog(); //Upcast
        Animal cat = new Cat(); //Upcast

        dog.talk();
        babyDog.talk();
        cat.talk();

        //demo of array of supertype
        System.out.printf("%n%s%n", "## Testing Array of Supertype");
        Animal[] zoo = {new Dog(), new BabyDog(), new Cat()};
        zoo[0].talk();
        zoo[1].talk();
        zoo[2].talk();

        //testing with instanceof
        System.out.printf("%n%s%n", "## Testing instanceof");
        System.out.println(dog instanceof Dog);
        System.out.println(dog instanceof Animal);
        System.out.println(dog instanceof Cat);
        System.out.println(dog.getClass().getName());

        //testing with downcasting
        System.out.printf("%n%s%n", "## Testing downcasting");
//        dog.walk //error
        ((Dog)dog).walk(); //downcasting

        if (cat instanceof Dog) {
            ((Dog) cat).walk(); //downcasting
        }else{
            System.err.println("Error: cat is not instance of dog!");
        }
    }
}
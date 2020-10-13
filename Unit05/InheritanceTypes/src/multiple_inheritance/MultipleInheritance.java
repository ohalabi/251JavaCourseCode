package multiple_inheritance;

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

class BabyDog extends Dog {
    void weep() {
        System.out.println("weeping");
    }
}
class HairyDog extends Dog {

}
public class MultipleInheritance {
    public static void main(String[] args) {
        BabyDog bdog = new BabyDog();
        bdog.weep();
        bdog.bark();
        bdog.eat();
    }
}

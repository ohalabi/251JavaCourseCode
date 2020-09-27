/**
 * Created by Osama Halabi on 2020/09/27.
 */
public class AnimalTest {
    public static void main(String[] args) {
        Animal animal = new Animal("Animal", 5, 10);

        Dog dog = new Dog("Akita", 6, 12, 2, 4, 1, 20, "medium silky");
//        dog.eat();
//        dog.walk();
        dog.run();
    }
}

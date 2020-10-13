package animal;

/**
 * Created by Osama Halabi on 2020/09/27.
 */
public class Animal extends Object {
    private String name;
    private int size;
    private int weight;

    public Animal(String name, int size, int weight) {
        //implicit call to Object's default constructor occurs here!

        this.name = name;
        this.size = size;
        this.weight = weight;
    }

    public void eat() {
        System.out.println("Animal.eat() called, Animal eating...");
    }

    public void move(int speed) {
        System.out.println("Animal.move() called, Animal moving...");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}

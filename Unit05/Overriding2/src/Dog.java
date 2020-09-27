/**
 * Created by Osama Halabi on 2020/09/27.
 */
public class Dog extends Animal {
    private int eyes;
    private int legs;
    private int tail;
    private int  teeth;
    private String coat;

    public Dog(String name, int size, int weight, int eyes, int legs, int tail, int teeth, String coat) {
        super(name, size, weight);
        this.eyes = eyes;
        this.legs = legs;
        this.tail = tail;
        this.teeth = teeth;
        this.coat = coat;
    }

    public void chew() {
        System.out.println("Dog.chew() called, Dog chewing...");
    }

    @Override
    public void eat() {
        System.out.println("Dog.eat() called, Dog eating...");
        chew();
        super.eat();
    }

    public void walk() {
        System.out.println("Dog.walk() called, Dog walking...");
        super.move(5);
    }

    public void run() {
        System.out.println("Dog.run() called, Dog running");
        move(5);
    }

    public void moveLegs(int speed) {
        System.out.println("Dog.moveLegs() called, Dog moving legs...");
    }
    @Override
    public void move(int speed) {
        System.out.println("Dog.move() called, Dog moving...");
        moveLegs(speed);
        super.move(speed);
    }

    public int getEyes() {
        return eyes;
    }

    public void setEyes(int eyes) {
        this.eyes = eyes;
    }

    public int getLegs() {
        return legs;
    }

    public void setLegs(int legs) {
        this.legs = legs;
    }

    public int getTail() {
        return tail;
    }

    public void setTail(int tail) {
        this.tail = tail;
    }

    public int getTeeth() {
        return teeth;
    }

    public void setTeeth(int teeth) {
        this.teeth = teeth;
    }

    public String getCoat() {
        return coat;
    }

    public void setCoat(String coat) {
        this.coat = coat;
    }
}

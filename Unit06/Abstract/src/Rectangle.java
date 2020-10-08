/**
 * Created by Osama Halabi on 2020/10/08.
 */
public class Rectangle extends  Shape {
    private double length, width;

    public Rectangle(String color, double length, double width) {
        super(color);
        this.length = length;
        this.width = width;
    }

    @Override
    public String toString() {
        return "Rectangle[" +
                "length=" + length +
                ", width=" + width + ", " +
                super.toString() +
                ']';
    }

    @Override
    public double getArea() {
        return length*width;
    }
}

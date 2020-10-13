package shape;

/**
 * Created by Osama Halabi on 2020/10/08.
 */
public class Rectangle implements Shape {
    private double length, width;
    String color;

    public Rectangle( double length, double width) {
//        super(color);
        this.length = length;
        this.width = width;
    }

    @Override
    public String toString() {
        return "Rectangle[" +
                "length=" + length +
                ", width=" + width + ", " +
//                super.toString() +
                ']';
    }

    @Override
    public double getArea() {
        return length*width;
    }

}

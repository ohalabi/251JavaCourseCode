/**
 * Created by Osama Halabi on 2020/10/08.
 */
public class Circle extends Shape {
    private double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle[" +
                "radius=" + radius + "," +
                super.toString() +
                ']';
    }

    @Override
    public double getArea() {
        return Math.PI*Math.pow(radius,2);
    }
}

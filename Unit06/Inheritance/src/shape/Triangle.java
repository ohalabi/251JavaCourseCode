package shape;

/**
 * Created by Osama Halabi on 2020/10/08.
 */
public class Triangle implements Shape {
    private double base, height;

    public Triangle( double base, double height) {
//        super(color);
        this.base = base;
        this.height = height;
    }

    @Override
    public String toString() {
        return "Triangle[" +
                "base=" + base +
                ", height=" + height + "," +
//                super.toString() +
                ']';
    }

    @Override
    public double getArea() {
        return 0.5 * base * height;
    }
}

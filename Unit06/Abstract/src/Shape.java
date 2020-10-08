/**
 * Created by Osama Halabi on 2020/10/08.
 */
public abstract class Shape {
    private String color;

    public Shape(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Shape[" +
                "color=" + color +
                ']';
    }

    // All shapes must provide a method called getArea()
//    public double getArea() {
//        //We have a problem here!
//        // we need to return some value to compile the progrom.
//        System.err.println("Unknown Shape! Cannot compute area!");
//        return  0;
//    }

    public abstract double getArea();
}

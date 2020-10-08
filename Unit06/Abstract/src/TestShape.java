import java.util.ArrayList;

/**
 * Created by Osama Halabi on 2020/10/08.
 */
public class TestShape {
    public TestShape() {
        ArrayList<Shape> shapesList = new ArrayList<>();
        shapesList.add(new Rectangle("red", 4, 5));
        shapesList.add(new Rectangle("ruby", 5, 6));
        shapesList.add(new Triangle("pink", 1, 2));
        shapesList.add(new Triangle("blue", 3, 3));
        shapesList.add(new Circle("yellow", 4));
        shapesList.add(new Circle("brown", 2));
//        shapesList.add(new Shape("Black"));

        processShapes (shapesList);
        System.out.printf("Sum of area of all shapes %.2f", sumAreas(shapesList));

    }
    public void processShapes (ArrayList<Shape> shapes) {
        System.out.println("Processing Shapes: ");
        for (Shape s: shapes) {
            System.out.println(s);
            System.out.printf("Shape  name: %-10s => ", s.getClass().getName());
            System.out.printf("Area = %.2f %n", s.getArea());
        }
    }

    public double sumAreas(ArrayList<Shape> shapes) {
        double sum = 0;
        for (Shape s: shapes) {
            sum += s.getArea();
        }
        return sum;
    }

    public static void main(String[] args) {
        new TestShape();
    }
}

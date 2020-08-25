public class App {
    public static void main(String[] args) {
        Car toyta = new Car();
        toyta.setModel("Prada");
        toyta.setColor("Red");
        toyta.setWheels(4);
        toyta.setEngine("Turbo");
        toyta.setDoors(4);
        System.out.println("Model is " + toyta.getModel());
        System.out.println("Color is " + toyta.getColor());
        System.out.println("Doors No " + toyta.getDoors());
        System.out.println("Engine is " + toyta.getEngine());
        System.out.println("Wheels is " + toyta.getWheels());

        Car honda = new Car();
        honda.setModel("Civic");
        honda.setColor("Blue");
        honda.setWheels(4);
        honda.setEngine("iVEC");
        honda.setDoors(5);
        System.out.println("Model is " + honda.getModel());
        System.out.println("Color is " + honda.getColor());
        System.out.println("Doors No " + honda.getDoors());
        System.out.println("Engine is " + honda.getEngine());
        System.out.println("Wheels is " + honda.getWheels());

        // test overloading
        System.out.printf("int addition: %d%n", honda.add(2, 3));
        System.out.printf("double addition: %.1f%n", honda.add(2.2, 3.4));
        System.out.printf("double 3 addition: %.1f%n", honda.add(2.3, 3.2, 3.5));
    }
} // end of class

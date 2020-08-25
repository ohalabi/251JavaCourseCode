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

        System.out.println();
        Car honda = new Car();
        honda.setModel("Civic");
        honda.setColor("Blue");
        honda.setWheels(100);
        honda.setEngine("iVEC");
        honda.setDoors(5);
        System.out.println("Model is " + honda.getModel());
        System.out.println("Color is " + honda.getColor());
        System.out.println("Doors No " + honda.getDoors());
        System.out.println("Engine is " + honda.getEngine());
        System.out.println("Wheels is " + honda.getWheels());

        // Testing method overloading
        Car overloading = new Car();
        System.out.printf("%n int addition : %d%n", overloading.add(2, 3));
        System.out.printf("double addition : %.2f%n", overloading.add(2.4, 3.7));
        System.out.printf("double three additions : %.2f%n", overloading.add(2.4, 3.7, 4.5));
    }
} // end of class

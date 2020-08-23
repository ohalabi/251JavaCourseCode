public class App {
    public static void main(String[] args) {
        Car toyta = new Car();
        toyta.setModel("Camry");
        toyta.setColor("Red");
        toyta.setWheels(4);
        toyta.setEngine("Turbo");
        toyta.setDoors(4);

        System.out.println("Model is " + toyta.getModel());
        System.out.println("Color is " + toyta.getColor());
        System.out.println("Doors No " + toyta.getDoors());
        System.out.println("Engine is " + toyta.getEngine());
        System.out.println("Wheels is " + toyta.getWheels());
    }
}

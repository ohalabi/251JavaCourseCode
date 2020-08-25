public class Car {
    private String color;
    private String model;
    private int wheels;
    private String engine;
    private int doors;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public void setModel(String model) {
        String validModel = model.toLowerCase();
        if (validModel.equals("camry") || validModel.equals("prada")) {
            this.model = model;
        } else {
            this.model = "Unkonwn";
        }
    }

    public String getModel() {
        return model;
    }

    // Method Overloading
    private int a;
    private int b;
    private int c;

    // integer addition
    public int add (int a, int b){
        return a + b;
    }
        // double addition
    public double add (double a, double b){
        return a + b;
    }

    public double add(double a, double b, double c) {
        return  a + b + c;
    }
}

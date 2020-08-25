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
        if (wheels <= 5) {
            this.wheels = wheels;
        } else {
            this.wheels = 4;
        }
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
        if (validModel.equals("civic") || validModel.equals("prada")) { // Data validation
            this.model = model;
        } else {
            this.model = "Unknown";
        }
    }

    public String getModel() {
        return model;
    }

    // Method Overloading
    public int add(int a, int b) {
        return a + b;
    }
    public double add(double a, double b) {
        return  a + b;
    }
   public double add(double a, double b, double c) {
        return  a + b + c;
    }

}

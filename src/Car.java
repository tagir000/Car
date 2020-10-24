public class Car {
    private String carClass;
    private Engine engine;
    private Driver driver;
    private String marka;

    public Car(String carClass, String marka, Driver driver, Engine engine) {
        this.carClass = carClass;
        this.engine = engine;
        this.driver = driver;
        this.marka = marka;
    }


    public void start() {
        System.out.println("Engine is stared");
    }

    public void stop() {
        System.out.println("Engine is stoped");
    }

    public void turnLRight() {
        System.out.println("Car turn right");
    }

    public void turnLeft() {
        System.out.println("Car turn left");

    }

    public String toString() {
        return "Car class: " + carClass + ", " + marka + ", " + driver + ", "  + engine;
    }
}


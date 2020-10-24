public class SportCar extends Car {
    private double speed;

    public SportCar(String carClass, String marka, Driver driver, Engine engine, double speed) {
        super(carClass, marka, driver, engine);
        this.speed = speed;
    }

    public String toString() {
        return super.toString() + ", " + this.speed + " km/h";
    }
}

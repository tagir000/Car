public class Lorry extends Car {
    private int carrying;

    public Lorry(String carClass, String marka, Driver driver, Engine engine, int carrying) {
        super(carClass, marka, driver, engine);
        this.carrying = carrying;
    }

    public String toString() {
        return super.toString() + " " + this.carrying;
    }
}

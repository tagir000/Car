public class MyClass {
    public static void main(String[] args) {

        Driver driver = new Driver("Bob", 36, 10);
        Engine engine = new Engine(211, "M247");

        SportCar car = new SportCar("Sedan", "BMW", driver, engine, 280);

        System.out.println(car);

    }
}

public class Engine {
    private int power;
    private String model;

    public Engine (int power, String model) {
        this.power = power;
        this.model = model;

    }

    public String toString () {
        return "    Engine model: " + this.model + ", " + this.power+"hp";
    }
 }

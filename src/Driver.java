public class Driver extends Person {
    private int experience;



    public Driver(String name, int age, int experience) {
        super(name, age);
        this.experience = experience;
    }

    public String getInfo() {
        return toString();
    }

    public String toString () {
        return super.toString() + ", " + "experience " + this.experience + " year";
    }
}

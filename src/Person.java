public class Person {

    private int age;
    private String name;

    public Person (String name, int age) {
        this.name = name;
        this.age = age;

    }

    public String toString () {
        return "    Driver: " + this.name + ", " + this.age;
    }
}

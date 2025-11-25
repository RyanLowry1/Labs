// Name : Ryan Lowry
// Date 24/11/2025
// Student Number : C00305950
public class Animal {
    private String name;
    private int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String vaccinatedMessage() {
        return "Animal vaccinated: " + toString();
    }

    public String toString() {
        return "Name: " + name + " | Age: " + age;
    }
}

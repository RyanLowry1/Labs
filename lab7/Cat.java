// Name : Ryan Lowry
// Date 24/11/2025
// Student Number : C00305950
public class Cat extends Animal {
    private String colour;

    public Cat(String name, int age, String colour) {
        super(name, age);
        this.colour = colour;
    }

    @Override
    public String vaccinatedMessage() {
        return "Cat has been vaccinated: " + toString();
    }

    public String toString() {
        return super.toString() + " | Colour: " + colour + " | ";
    }
}

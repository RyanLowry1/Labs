// Name : Ryan Lowry
// Date 24/11/2025
// Student Number : C00305950
public class Dog extends Animal {
    private String breed;

    public Dog(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
    }

   @Override
    public String vaccinatedMessage() {
        return "Dog has been vaccinated: " + toString();
    }

    public String toString() {
        return super.toString() + " | Breed: " + breed + " | ";
    }
}

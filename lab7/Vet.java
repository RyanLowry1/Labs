// Name : Ryan Lowry
// Date 24/11/2025
// Student Number : C00305950
public class Vet {
    private String name;

    public Vet(String name) {
        this.name = name;
    }

    public void vaccinate(Animal animal) 
    {
        System.out.println(name + " is vaccinating.");
        System.out.println(animal.vaccinatedMessage());
    }
}

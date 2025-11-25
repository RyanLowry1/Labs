// Name : Ryan Lowry
// Date 24/11/2025
// Student Number : C00305950
public class Driver {
    public static void main(String[] args) {
        Dog dog = new Dog("Lily", 4 , "Cavalier");
        Cat cat = new Cat("Mittens", 2 , "Black");

        Vet vet1 = new Vet("Ryan");
        Vet vet2 = new Vet("Luke");

        vet1.vaccinate(dog);   
        vet2.vaccinate(cat);  
    }
}

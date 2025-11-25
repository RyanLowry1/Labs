// Name : Ryan Lowry
// Date : 25/11/2025
// Student Number : C00305950
public class TestPerson
{
    public static void main(String[] args)
    {
        Person[] people = new Person[2];

        people[0] = new Employee("Ryan", 100000);
        people[1] = new Student("Luke", "Software Development");

        for (Person person : people){
            System.out.println("Name: " + person.getName());
            System.out.println("Description: " + person.getDescription());
            System.out.println();
        }
    }
}

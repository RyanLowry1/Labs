// Name : Ryan Lowry
// Date : 25/11/2025
// Student Number : C00305950
public abstract class Person
{
    private String name;

    public Person(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public abstract String getDescription();
}

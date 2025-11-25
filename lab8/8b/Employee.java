// Name : Ryan Lowry
// Date : 25/11/2025
// Student Number : C00305950
public class Employee extends Person
{
    private double salary;

    public Employee(String name, double salary){
        super(name);
        this.salary = salary;
    }

    @Override
    public String getDescription(){
        return "An employee with a salary of " + salary;
    }
}
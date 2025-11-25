// Name : Ryan Lowry
// Date : 25/11/2025
// Student Number : C00305950
public class Circle extends Shape
{
    private double radius;
    private double pi = 3.14;

    public Circle(String name, String colour, double radius)
    {
        super(name, colour);
        this.radius = radius;
    }

    @Override
    public double area()
    {
        return pi * radius * radius;
    }

    @Override
    public String toString()
    {
        return super.toString() + "Radius: " + radius;
    }
}

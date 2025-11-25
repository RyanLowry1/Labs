// Name : Ryan Lowry
// Date : 25/11/2025
// Student Number : C00305950
public class Cylinder extends ThreeDShape
{
    private double radius;
    private double height;
    private double pi = 3.14;

    public Cylinder(String name, String colour, double radius, double height)
    {
        super(name, colour);
        this.radius = radius;
        this.height = height;
    }

    @Override
    public double area()
    {
        return 2 * pi * radius * radius + 2 * pi * radius * height;
    }

    @Override
    public double volume()
    {
        return pi * radius * radius * height;
    }

    @Override
    public String toString()
    {
        return super.toString() + " Radius: " + radius + " Height: " + height;
    }
}

// Name : Ryan Lowry
// Date : 25/11/2025
// Student Number : C00305950
public class Sphere extends ThreeDShape
{
    private double radius;
    private double pi = 3.14;

    public Sphere(String name, String colour, double radius)
    {
        super(name, colour);
        this.radius = radius;
    }

    @Override
    public double area()
    {
        return 4 * pi * radius * radius;
    }

    @Override
    public double volume()
    {
        return (4.0 / 3.0) * pi * radius * radius * radius;
    }

    @Override
    public String toString()
    {
        return super.toString() + " Radius: " + radius;
    }
}

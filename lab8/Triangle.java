// Name : Ryan Lowry
// Date : 25/11/2025
// Student Number : C00305950
public class Triangle extends Shape
{
    private double base;
    private double height;

    public Triangle(String name, String colour, double base, double height)
    {
        super(name, colour);
        this.base = base;
        this.height = height;
    }

    @Override
    public double area()
    {
        return 0.5 * base * height;
    }

    @Override
    public String toString()
    {
        return super.toString() + " Base: " + base + " Height: " + height;
    }
}

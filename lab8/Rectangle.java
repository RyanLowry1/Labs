// Name : Ryan Lowry
// Date : 25/11/2025
// Student Number : C00305950
public class Rectangle extends Shape
{
    private double length;
    private double width;

    public Rectangle(String name, String colour, double length, double width)
    {
        super(name, colour);
        this.length = length;
        this.width = width;
    }

    @Override
    public double area()
    {
        return length * width;
    }

    @Override
    public String toString()
    {
        return super.toString() + " Length: " + length + " Width: " + width;
    }
}

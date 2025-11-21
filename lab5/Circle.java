//Name : Ryan Lowry
//Date : 6/11/2025
//Student Number : C00305950
public class Circle extends Point {

    protected int radius;

    public Circle(int x, int y, int r) {
        super(x, y);
        setRadius(r);
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    // toString
    @Override
    public String toString() {
        return "Circle radius = " + radius +  " " + super.toString() + " ";
    }
}

//Name : Ryan Lowry
//Date : 6/11/2025
//Student Number : C00305950
public class Point {

    protected int x;
    protected int y;

    public Point(int x, int y) {
        setX(x);
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return " Point x = " + x + " , y = " + y + " ";
    }
}

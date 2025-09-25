public class RectangleDriver{

    public static void main(String[]args){

        Rectangle rec = new Rectangle();

        rec.setLength(15.0f);
        rec.setWidth(10.0f);

        System.out.println(rec);

        System.out.println(rec.getArea());
        System.out.println(rec.getPerimeter());

        rec.printRectangle();

    }
}
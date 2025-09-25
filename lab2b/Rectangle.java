//Name : Ryan Lowry
//Date : 25/09/2025
//Student Number : C00305950
public class Rectangle { 

    private float length;
    private float width;

    public Rectangle(){
        setLength(1.0f);
        setWidth(1.0f);
    }

    public float getLength(){
        return length;
    }
    public void setLength(float length){
        if(length > 0.0 && length <= 40){
            this.length = length;
        }
        else{
            System.out.print("Length must be between 0 and 40");
        }
    }
    public float getWidth(){
        return width;
    }
    public void setWidth(float width){
        if(width > 0.0 && width <= 40){
            this.width = width;
        }
        else{
            System.out.print("Width must be between 0 and 40");
        }
    }

    public float getArea(){
        return length * width;
    }

    public float getPerimeter(){
        return (length + width)*2;
    }

    public void printRectangle(){
        String w = "*";
        for(int i = 0; i < width-1; i ++){
            w+= "*";
        }

        System.out.println(w);

        for(int x = 0; x < length-2; x++){
            System.out.print("*");
            for(int y = 0; y < width-2; y++){
                System.out.print(" ");
            }
            System.out.println("*");
        }
        System.out.println(w);
    }

    public String toString(){
        return "Rectangle length = " + length + " , width = " + width;
    }
}
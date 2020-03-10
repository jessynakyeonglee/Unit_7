import java.util.ArrayList;

public class Rectangle {
    private double width;
    private double length;

    public Rectangle(double l, double w){
        length=l;
        width=w;
    }
    public double getWidth(){
        return width;
    }
    public double getLength(){
        return length;
    }
    public double getArea(){
        return width*length;
    }

}


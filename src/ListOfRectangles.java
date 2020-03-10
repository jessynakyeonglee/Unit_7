import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class ListOfRectangles {
        public static ArrayList<Rectangle> getRectangles() throws FileNotFoundException {
            ArrayList<Rectangle> rec = new ArrayList<Rectangle>();
            Scanner rectangle = new Scanner((new File("Rectangle.txt")));
            while (rectangle.hasNext()) {
            String testword = rectangle.nextLine();
            String blank = " ";
            double width = Double.parseDouble(testword.substring(0,testword.indexOf(blank)));
            double length = Double.parseDouble(testword.substring(testword.indexOf(blank)));
            rec.add(new Rectangle(width,length));
            }
            return rec;
        }
    public static double findAverage(ArrayList<Rectangle> rectangles){
            double sum =0;
            for (int count = 0;count<rectangles.size();count++){
                sum+=rectangles.get(count).getArea();
            }
            double output = (sum/rectangles.size())*100;
            int temp = (int)(output);
            output=(double)temp/100;
            return output;
    }
    public static void main(String[] args) throws FileNotFoundException {
            System.out.println("The average area would be"+findAverage(getRectangles()));
    }
}

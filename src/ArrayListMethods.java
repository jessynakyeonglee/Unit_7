import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListMethods {
    public static Scanner scan = new Scanner(System.in);

    public static void main (String[]args){
        numberList();
        firstAndLast();
    }
    public static ArrayList<Integer> numberList(){


        ArrayList<Integer> array = new ArrayList<>();
        array.add(0);
        array.add(-5);
        array.add(7);
        array.add(12);
        array.add(-1);
        System.out.println(array);
        array.add(3,10);
        array.set(1,9);
        System.out.println(array);
        array.remove(4);
        System.out.println(array);
        return array;
    }
    public static ArrayList<Double> firstAndLast(){
        ArrayList<Double> array = new ArrayList<>();
        while (scan.nextDouble()!=0){
            array.add(scan.nextDouble());
        }
        ArrayList<Double> array2=new ArrayList<>();
        array2.add((double)(array.size()));
        array2.add((array.get(0)));
        array2.add(array.get(array.size()));
        return array2;
    }
    public static ArrayList<Double> getNumbers(){

    }
}

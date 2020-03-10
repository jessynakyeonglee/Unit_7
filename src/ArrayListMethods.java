import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListMethods {
    public static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println(numberList());
        System.out.println(firstAndLast());
        System.out.println(arrangeList(getNumbers()));
    }

    public static ArrayList<Integer> numberList() {


        ArrayList<Integer> array = new ArrayList<>();
        array.add(0);
        array.add(-5);
        array.add(7);
        array.add(12);
        array.add(-1);
        System.out.println(array);
        array.add(2, 10);
        array.set(1, 9);
        System.out.println(array);
        array.remove(4);
        System.out.println(array);
        return array;
    }

    public static ArrayList<Double> firstAndLast() {
        ArrayList<Double> array = new ArrayList<>();
        while (true) {
            double value = scan.nextDouble();
            if (value == 0.0)
                break;
            array.add(value);
        }
        ArrayList<Double> array2 = new ArrayList<>();
        array2.add((double) (array.size()));
        array2.add((array.get(0)));
        array2.add(array.get(array.size() - 1));
        return array2;
    }

    public static ArrayList<Double> getNumbers() {
        ArrayList<Double> array = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            array.add(scan.nextDouble());
        }
        return array;
    }
    public static ArrayList<Double> arrangeList(ArrayList<Double> numbers) {
            ArrayList<Double> output = new ArrayList<>();
            double biggest = 0;
            double middle = 0;
            double smallest = 0;
            if (numbers.get(0) > numbers.get(1) && numbers.get(0) > numbers.get(2)) {
                biggest = numbers.get(0);
                numbers.remove(0);
            }

            if (numbers.get(1) > numbers.get(0) && numbers.get(1) > numbers.get(2)) {
            biggest = numbers.get(1);
            numbers.remove(1);
        }
            if (numbers.get(2) > numbers.get(0) && numbers.get(2) > numbers.get(1)) {
             biggest = numbers.get(2);
            numbers.remove(2);
        }
        if (numbers.get(0)>numbers.get(1)){
             smallest = numbers.get(1);
             middle = numbers.get(0);
        }
        if (numbers.get(1)>numbers.get(0)){
             smallest = numbers.get(0);
             middle = numbers.get(1);
        }
        output.add(0,smallest);
        output.add(1,middle);
        output.add(2,biggest);
        return output;
        }



}
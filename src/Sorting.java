import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Sorting {

    public static ArrayList<Integer> getUnsorted() throws IOException {
        Scanner scan = new Scanner(new File("sortedData.txt"));
        ArrayList<Integer> list = new ArrayList<>();
        int counter = 0;
        while (counter < 9) {
            list.add(scan.nextInt());
            counter++;
        }
        return list;
    }

    public static boolean isSorted(ArrayList<Integer> array) {
        for (int count=0;count<array.size()-1;count++) {
            if (array.get(count)>array.get(count + 1)) {
                return false;
            }
        }
            return true;
    }
}
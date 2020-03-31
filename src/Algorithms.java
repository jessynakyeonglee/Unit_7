import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Algorithms {
    public static ArrayList<Integer> fileDuplicates() throws IOException {
        ArrayList <Integer> array1 = new ArrayList<Integer>();
        Scanner file1 = new Scanner (new File("file1.txt"));
        ArrayList <Integer> array2 = new ArrayList<Integer>();
        Scanner file2 = new Scanner (new File("file2.txt"));
        ArrayList<Integer> dups = new ArrayList<>();
        while(file1.hasNext()){
            array1.add(file1.nextInt());
        }
        while(file2.hasNext()){
            array2.add(file2.nextInt());
        }
        for(int count = 0; count<array1.size(); count++){
            int testingnum = array1.get(count);
            if(array2.contains(testingnum)){
                dups.add(testingnum);
            }
        }
        return dups;
    }

    public static ArrayList<String> fileDuplicatesTwo() throws FileNotFoundException {
        ArrayList<String> list = new ArrayList<String>();
        Scanner file = new Scanner(new File("names.txt"));
        while (file.hasNext()){
            list.add(file.next());
        }

        for(int a = 0; a < list.size(); a++){
            String word = list.get(a);
            for(int b = a+1; b < list.size(); b++){
                if(word.equals(list.get(b))){
                    String dup = list.get(b);
                    list.remove(b);
                }
            }
        }
        return list;
    }
    public static ArrayList<Integer> orderedList() throws FileNotFoundException {
        ArrayList<Integer> list = new ArrayList<Integer>();
        Scanner file = new Scanner(new File("file1.txt"));
        list.add(file.nextInt());
        while (file.hasNext()){
            int testingnum = file.nextInt();
            for (int count = list.size()-1; count >= 0; count--){
                if (testingnum > list.get(count)){
                    list.add(count + 1,testingnum);
                    break;
                }
                if (testingnum < list.get(0))
                    list.add(0, testingnum);
            }
        }
        return list;
    }
}
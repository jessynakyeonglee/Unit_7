import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Algorithms {
    public static ArrayList<Integer> fileDuplicates() throws FileNotFoundException {
        ArrayList <Integer> fileone = new ArrayList<Integer>();
        Scanner file1 = new Scanner (new File("file1.txt"));
        ArrayList <Integer> filetwo = new ArrayList<Integer>();
        Scanner file2 = new Scanner (new File("file2.txt"));
        while(file1.hasNext()){
        fileone.add(file1.nextInt());
        }
        while(file2.hasNext()){
            filetwo.add(file2.nextInt());
        }
        ArrayList<Integer> output= new ArrayList<Integer>();
        for (int a = 0; a<20;a++){
            for (int b = 0 ;b<20; b++){
                if (fileone.get(a)==filetwo.get(a)){
                    output.add(fileone.get(a));
                }
            }
        }
        return output;
    }
    public static ArrayList<String> fileDuplicatesTwo() throws FileNotFoundException {
        ArrayList<String> namelist = new ArrayList<String>();
        Scanner namefile = new Scanner (new File("names.txt"));
        String testword = namefile.nextLine();
        String blank = " ";
        int start = 0;
        int end = 0;
        int count =0;
        while (count<testword.length()){
            end = testword.indexOf(blank)

        }
    }
}

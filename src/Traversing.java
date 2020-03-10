import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Traversing {


    public static Scanner scan = new Scanner(System.in);

    public static ArrayList<String> getStates() {
        ArrayList<String> array = new ArrayList<>();
        while (true) {
            String input =scan.next();
            System.out.println("Next state of \"Stop\" to quit");
            if (input.equals("Stop")) {
                break;
            }
            array.add(input);
            }
        return array;
    }
    public static String createList(ArrayList<String> states){
        String output = "";
      for (int i = 0; i < states.size(); i++){
           if (i==states.size()-1){
               output+= states.get(i);
           }
           else
           output+= states.get(i)+" -> ";
        }
        return output;
    }

    public static ArrayList<Integer> largestAndSmallest() throws IOException{
        ArrayList<Integer> array= new ArrayList<Integer>();
        Scanner input = new Scanner (new File("src/numbers.txt"));
        while(input.hasNext()){
            array.add(input.nextInt());
        }
        int indexoflargest = array.get(0);
        int indexofsmallest = array.get(0);
        for (int i = 0; i<array.size();i++) {
            if (array.get(i) >= array.get(indexoflargest)) {
                indexoflargest = i;
            }
        }
        for (int i = 0; i<array.size();i++){
            if (array.get(i)<=array.get(indexofsmallest)){
                indexofsmallest=i;
            }
        }
        int smallestvalue = array.get(indexofsmallest);
        int largestvalue = array.get(indexoflargest);
        array.remove(indexofsmallest);
        array.add(0,smallestvalue);
        array.remove(indexoflargest);
        array.add(largestvalue);
        return array;
    }
    public static void main(String[] args) throws IOException {
        System.out.println("Enter the name of a state or \"Stop\" to quit");
        System.out.println(createList(getStates()));
        System.out.println(largestAndSmallest());
    }
}

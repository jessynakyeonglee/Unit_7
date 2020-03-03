import java.util.ArrayList;
import java.util.Scanner;

public class TraversingArrayLists {
    public static void main(String[] args) {
        System.out.println("Enter the name of a state or \"Stop\" to quit");
        System.out.println(createList(getStates()));
    }

    public static Scanner scan = new Scanner(System.in);

    public static ArrayList<String> getStates() {
        ArrayList<String> array = new ArrayList<>();
        while (true) {
            String input = scan.next();
            if (!input.equals("Stop"))
                break;
            array.add(input);
            }

        return array;
    }
    public static String createList(ArrayList<String> states){
        String output = "";
        for (int i = 0; i < states.size()-1; i++){
            output+= states.get(i)+" ->";
        }
        output+=states.get(states.size()-1);
        return output;
    }

}

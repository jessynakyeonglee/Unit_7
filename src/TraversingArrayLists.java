import java.util.ArrayList;
import java.util.Scanner;

public class TraversingArrayLists {
    public static void main(String[] args) {

    }

    public static Scanner scan = new Scanner(System.in);

    public static ArrayList<String> getStates() {
        ArrayList<String> array = new ArrayList<>();
        while (true) {
            String input = scan.next();
            if (!input.equals("Stop")) {
                break;
            }
            array.add(input);
        }
        return array;
    }
}

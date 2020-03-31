import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class DonorRunner {

    public static ArrayList<Donor> readFile() throws FileNotFoundException {
        Scanner file = new Scanner(new File("donors.txt"));
        ArrayList<Donor> donorlist = new ArrayList<>();
        while(file.hasNext()){
            donorlist.add(new Donor(file.next(),file.nextDouble()));
        }
        System.out.println(donorlist);
        return donorlist;
    }

    public static ArrayList<Donor> sortDonors(ArrayList<Donor>array){
        for(int i = 1; i<array.size(); i++){
            Donor amount = array.get(i);
            int count = i-1;
            while(count>= 0 && amount.getAmount() > array.get(count).getAmount() ){
                array.set(count+1, array.get(count));
                count--;
            }
            array.set(count+1,amount);
        }
        System.out.println(array);
        return array;
    }
}
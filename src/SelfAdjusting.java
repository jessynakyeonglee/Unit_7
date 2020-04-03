/*
* @author Jessy Lee
* @since 3/31/20
* This program self-adjusts an arraylist by adding numbers in the front of an arryalist that consists of even numbers between 2 and 20 and removing a repeatedly appeared number in an arraylist.
* */
import java.util.ArrayList;
public class SelfAdjusting {

    /*This is the private instance part of ArrayList*/
    private ArrayList<Integer> list;

    /*This is a constructor part of SelfAdjusting which takes ArrayList<Integer>list as a parameter*/
    public SelfAdjusting(ArrayList<Integer>list){
        this.list=list;
    }

    /*This will return the numbers in the Arraylist*/
    public ArrayList<Integer>getList(){
        return list;
    }

    /*This part will create a new arraylist that consists of even numbers between 2 and 20 and self-adjust*/
    public void adjustList(){
        /*This part creates a new arraylist called "array" that consists of even integers between 2 and 20*/
        ArrayList<Integer> array = new ArrayList<Integer>();
        array.add(2); array.add(4); array.add(6); array.add(8); array.add(10);array.add(12);array.add(14); array.add(16); array.add(18); array.add(20);

        /*This part will add the numbers from arraylist called array in the front without removing anything*/
        for (int count = 0; count < list.size(); count++) {
            int testingnum = list.get(count);
        while (testingnum != 0) {
            array.add(0, testingnum);
            /*This part will remove the numbers that already exist in array. That's why count2 is 1, not 0. Because we already added the number in the front, it will have to start checking from index 1 to not count the one we just added in the front.*/
            for (int count2 = 1; count2 < array.size(); count2++) {
            if (array.get(count2) == testingnum) {
            array.remove(count2);
                    }
                }
                break;
            }
        }
        /*This part will simply print the self-adjusted array*/
        System.out.println(array);
    }
}

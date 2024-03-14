package Day8.PersonalExcercise.List;

import java.util.ArrayList;
import java.util.List;

public class AutoBoxingArrayToArrayList {

       //main method
       public static void main(String[] args) {
            int[] arr = new int[] {1, 2, 3};
           List<Integer> lists = new ArrayList<Integer>(); //int in array and Integer in Lists
           for(int i = 0; i < arr.length; i++) {
                lists.add(arr[i]);
           }
           System.out.println(lists);
       }
}

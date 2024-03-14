package Day8.PersonalExcercise.List;

import java.util.LinkedList;
import java.util.List;

public class LinkedListAPI {

       //main method
       public static void main(String[] args) {
           LinkedList<Integer> numbers = new LinkedList<>(List.of(1, 2, 3, 4, 5));
           numbers.add(6);
           numbers.add(7);
           System.out.println(numbers);
           System.out.println(numbers.size());
       }
}

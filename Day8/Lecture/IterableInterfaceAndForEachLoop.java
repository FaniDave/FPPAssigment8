package Day8.Lecture;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IterableInterfaceAndForEachLoop {

       //main method
       public static void main(String[] args) {
           List<String> javaList = new ArrayList<>(List.of(
                   "Bob", "Carol", "Steve"
           ));

           javaList.forEach(name -> System.out.println(name.toUpperCase()));

           System.out.println("*".repeat(50));

           Iterator<String> iterator = javaList.iterator();
            while(iterator.hasNext()) {
                System.out.println(iterator.next().toUpperCase());
            }

            System.out.println("*".repeat(50));


       }
}

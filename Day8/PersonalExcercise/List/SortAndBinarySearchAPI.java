package Day8.PersonalExcercise.List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortAndBinarySearchAPI {

       //main method
       public static void main(String[] args) {
           List<String> names = new ArrayList<> ();
           names.add("Maria");
           names.add("Faniel");
           names.add("Sirak");
           names.add("Heran");
           names.add("Luliya");
           names.add("Diana");
           names.add("Petros");
           System.out.println("Names before sorted : " + names);

           System.out.println("*".repeat(50));

           Collections.sort(names);
           System.out.println("Names after sorted : " + names);

           System.out.println("*".repeat(50));

           int indexOfFaniel = Collections.binarySearch(names, "Faniel");
           System.out.println("Faniel's index in " + names + " is : " + indexOfFaniel);

       }
}

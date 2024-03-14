package Day8.PersonalExcercise.List;

import java.util.ArrayList;
import java.util.List;

public class Genericising {

        //main method
        public static void main(String[] args) {
            List<Object> listsOfAnyType  = new ArrayList<Object>(List.of(
                    1,
                    2.3,
                    "Faniel",
                    'F'
            ));
            System.out.println(listsOfAnyType);
            double doubleFromList = (double)(listsOfAnyType.get(1));

            System.out.println("*".repeat(50));

            ArrayList x = new ArrayList<>();
            x.add(1);
            x.add("Faniel");

            String name = (String)(x.get(1));
        }

}

package Day8.PersonalExcercise.List;

import java.util.ArrayList;
import java.util.LinkedList;

public class PrincipleOfProgrammingToInterface {

    //main method
    public static void main(String[] args) {

        //Start with arrayList
        ArrayList x = new ArrayList();
        x.add(5);
        x.add("Faniel");
        x.add('f');
        System.out.println(x);

        //The shift to linkedList if the project needs it
        LinkedList y = new LinkedList();
        y.add(5);
        y.add("Faniel");
        y.add('F');
        System.out.println(y);
    }
}

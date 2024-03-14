package Day8.Assigment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//Main 3 class for problem 3
public class Main3 {

    //main method
    public static void main(String[] args) {
        List<Marketing> marketList = new ArrayList<>();

        //add Method
        marketList.add(new Marketing("Faniel", "AAAA", 1200));
        marketList.add(new Marketing("Sirak", "BBBB", 350));
        marketList.add(new Marketing("Danait", "CCCC", 1210));
        marketList.add(new Marketing("Heran", "DDDD", 125));
        marketList.add(new Marketing("Luliya", "EEEE", 270));

        //remove method
        marketList.remove(1);  //removing object at index 1

        //size method
        System.out.println(marketList.size());

        //toString method
        for (Marketing m : marketList) {
            System.out.println(m.toString());
        }

        //equals method
        Marketing m1 = marketList.get(0);
        Marketing m2 = marketList.get(1);
        System.out.println(m1.equals(m2));

        //Sort the list in natural order for the field salesamount using comparator interface.
        Collections.sort(marketList, new SalesAmountComparator());

        //Sort the list in natural order using employeename with the criteria of the employee who achieves more than $1000
        // of salesamount
        List<Marketing> listAbove1000 = listMoreThan1000(marketList);
        for (Marketing m : listAbove1000) {
            System.out.println(m.toString());
        }
    }

    //listMoreThan1000 method
    public static List<Marketing> listMoreThan1000(List<Marketing> list) {
        List<Marketing> above1000 = new ArrayList<>();
        for (Marketing m : list) {
            if (m.getSalesAmount() > 1000) {
                above1000.add(m);
            }
        }

        Collections.sort(above1000, new EmployeeNameComparator());
        return above1000;
    }
}

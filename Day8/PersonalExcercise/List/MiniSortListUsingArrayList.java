package Day8.PersonalExcercise.List;

import java.util.ArrayList;
import java.util.List;

public class MiniSortListUsingArrayList {

    //main method
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(1);
        numbers.add(0);
        numbers.add(4);
        numbers.add(2);
        numbers.add(3);
        System.out.println(miniSort(numbers));
    }

    //miniSort method
    public static List<Integer> miniSort(List<Integer> list) {
        for (int i = 0; i < list.size() - 1; i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if ((list.get(i) > list.get(j)) && (i < j)) {
                    int temp = list.get(i);
                    list.set(i, list.get(j));
                    list.set(j, temp);
                }
            }
        }
        return list;
    }

}

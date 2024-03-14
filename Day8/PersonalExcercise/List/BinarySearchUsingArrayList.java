package Day8.PersonalExcercise.List;

import java.util.ArrayList;
import java.util.List;

public class BinarySearchUsingArrayList {

    //main method
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(List.of(5, 1, 4, 2, 3, 8, 6, 7));
        System.out.println(binarySearch(numbers, 4));
    }

    //binarySearch method
    public static int binarySearch(List<Integer> numbers, int target) {
        int left = 0, right = 0;
        while (left <= right) {
            int mid = left + ((right - left) / 2);
            if (numbers.get(mid) == target) {
                return mid;
            } else if (numbers.get(mid) < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }
}

package Day8.PersonalExcercise.List;

import java.util.Arrays;

public class InPlaceMiniSortArray {

    //main method
    public static void main(String[] args) {
        System.out.println(Arrays.toString(inPlaceminiSort(new int[]{3, 1, 4, 2, 5})));
    }

    //miniSort method
    public static int[] inPlaceminiSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j] && i < j) {
                    int holder = arr[i];
                    arr[i] = arr[j];
                    arr[j] = holder;
                }
            }
        }
        return arr;
    }
}

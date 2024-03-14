package Day8.PersonalExcercise.List;

import java.util.Arrays;

public class MinSortArray {

    //main method
    public static void main(String[] args) {
        System.out.println(Arrays.toString(miniSort(new int[]{3, 2, 1, 5, 9, 7, 5})));
    }

    //miniSort method
    public static int[] miniSort(int[] arr) {
        int[] sortedArr = new int[arr.length];
        for (int i = 0; i < sortedArr.length; i++) {
            int minIndex = minElementIndex(arr);
            sortedArr[i] = arr[minIndex];
            arr = removeArray(arr, minIndex);
        }
        return sortedArr;
    }

    //minElementIndex method
    public static int minElementIndex(int[] arr) {
        int minIndex = Integer.MAX_VALUE;
        int minElement = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < minElement) {
                minElement = arr[i];
                minIndex = i;
            }
        }
        return minIndex;

    }

    //modifying the array
    public static int[] removeArray(int[] arr, int indexToBeRemoved) {
        int[] newArr = new int[arr.length - 1];

        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (indexToBeRemoved != i) {
                newArr[j] = arr[i];
                j++;
            }
        }
        return newArr;
    }


}

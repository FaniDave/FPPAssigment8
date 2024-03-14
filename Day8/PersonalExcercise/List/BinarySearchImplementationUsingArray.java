package Day8.PersonalExcercise.List;

public class BinarySearchImplementationUsingArray {

    //main method
    public static void main(String[] args) {
        int[] arr = {10, 1, 9, 2, 8, 3, 7, 4, 6, 5};
        System.out.println(binarySearch(arr, 8));
    }

    public static int binarySearch(int[] arr, int target) {
          int left = 0, right = arr.length - 1;
          while(left <= right) {
               int mid = left + ((right - left)/ 2);
               if(arr[mid] == target) {
                   return mid;
               } else if(arr[mid] > target) {
                   right = mid - 1;
               } else {
                   left = mid + 1;
               }
          }

          return -1;
    }
}

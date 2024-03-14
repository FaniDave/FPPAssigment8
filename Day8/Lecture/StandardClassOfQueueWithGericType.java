package Day8.Lecture;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class StandardClassOfQueueWithGericType {

    //main method
    public static void main(String[] args) {
//        Queue<Integer> q = new LinkedList<>();
//        q.add(56);
//        q.add(18);
//        q.add(17);
//        int number = q.remove();
//        System.out.println(number);

        String str = "MAMM";
        System.out.println(isPalindrome(str));

    }

    //isPalindrome method
    public static boolean isPalindrome(String str) {
        Stack<Character> stackList = new Stack<>();
        Queue<Character> queueList = new LinkedList<>();

        for (int i = 0; i < str.length(); i++) {
            stackList.push(str.charAt(i));
            queueList.add(str.charAt(i));
        }

        for (int i = 0; i < str.length(); i++) {
            if (stackList.pop() != queueList.remove()) return false;
        }
        return true;
    }
}

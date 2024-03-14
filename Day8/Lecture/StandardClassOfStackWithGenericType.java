package Day8.Lecture;

import java.util.Stack;

public class StandardClassOfStackWithGenericType {

         //main method
         public static void main(String[] args) {
             Stack<Integer> s = new Stack<>();
             s.push(5);
             s.push(2);
             s.push(-4);

             System.out.println(s.peek());
         }
}

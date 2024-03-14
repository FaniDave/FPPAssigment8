package Day8.Lecture;

public class ArrayStack {

    //private fields
    private Object a[];
    private int top;

    //Constructor
    public ArrayStack(int n) {
        a = new Object[n];
        top = -1;
    }

    //push method
    public void push(Object item) {
        if (top == a.length - 1) {
            System.out.println("Stack is full");
            return;
        }

        top++;
        a[top] = item;
    }

    //pop method
    public Object pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return null;
        }
        Object itemToBeRemoved = a[top];
        top--;
        return itemToBeRemoved;
    }

    //peek method
    public Object peek() {
        if (isEmpty()) {
            System.out.println("Stack in empty");
            return null;
        }
        return a[top];
    }

    //isEmpty method
    public boolean isEmpty() {
        return (top == -1);
    }

    //size method
    public int size() {
        return top + 1;
    }
}

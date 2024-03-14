package Day8.Lecture;

import java.util.Arrays;

public class MyStringList {

    //private fields
    private final int INITIAL_LENGTH = 4;
    private String[] currentArray;
    private int numOfElements;

    //Constructor
    public MyStringList() {
        this.currentArray = new String[INITIAL_LENGTH];
        numOfElements = 0;
    }

    //resize method
    private void resize() {
        System.out.println("Resizing");
        String[] newArray = new String[currentArray.length * 2];
        System.arraycopy(currentArray, 0, newArray, 0, currentArray.length);
        currentArray = newArray;
    }

    // add elements in last to the array using add method
    public void add(String s) {
        if (s == null) return;
        if (numOfElements == currentArray.length) resize();
        currentArray[numOfElements++] = s;
    }

    //get element from the array using get method
    public String get(int i) {
        if (i < 0 || i >= numOfElements) return null;
        return currentArray[i];
    }

    //isEmpty method
    public boolean isEmpty() {
        return (numOfElements == 0);
    }

    //find method
    public boolean find(String s) {
        if (s == null) return false;
        for (int i = 0; i < numOfElements; i++) {
            if (currentArray[i].equals(s)) return true;
        }
        return false;
    }

    //insert method to insert an element by index
    public void insert(String s, int pos) {
        if (s == null) return;
        if (pos < 0 || pos > numOfElements) return;
        if (numOfElements == currentArray.length) resize();
        String[] temp = new String[currentArray.length];
        System.arraycopy(currentArray, 0, temp, 0, pos);
        System.arraycopy(currentArray, pos, temp, pos + 1, currentArray.length - (pos + 1));
        currentArray = temp;
        ++numOfElements;
    }

    //remove method
    public boolean remove(String s) {
        if (numOfElements == 0 || s == null) return false;
        int index = -1;
        for (int i = 0; i < numOfElements; i++) {
            if (currentArray[i].equals(s)) {
                index = i;
                break;
            }
        }

        if (index == -1) return false;

        String[] temp = new String[currentArray.length];
        System.arraycopy(currentArray, 0, temp, 0, index);
        System.arraycopy(currentArray, index + 1, temp, index, currentArray.length - (index + 1));
        currentArray = temp;
        --numOfElements;
        return true;
    }

    //toString method
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < numOfElements; i++) {
            sb.append(currentArray[i] + ", ");
        }
        sb.append(currentArray[numOfElements - 1] + "]");
        return sb.toString();
    }

    //size of the array
    public int size() {
        return numOfElements;
    }

    //clone method
    public Object clone() {
        String[] temp = Arrays.copyOf(currentArray, numOfElements);
        return temp;
    }

    //main method
    public static void main(String[] args) {
        MyStringList m = new MyStringList();
        m.add("A");
        m.add("B");
        m.add("C");
        m.add("D");
        m.insert("E", 2);
        m.insert("G", 3);
        System.out.println("Find: " + m.find("F"));
        System.out.println("At index 3: " + m.get(3));
        m.remove("G");
        m.remove("E");
        System.out.println("*".repeat(50));
        System.out.println(m.toString());
    }
}

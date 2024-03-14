package Day8.PersonalExcercise.List;

import java.util.Arrays;

public class MyStringList {

    //Instance fields
    private final int INITIAL_LENGTH = 4;
    private String[] currentArr;
    private int numberOfElements;

    //Constructor
    public MyStringList() {
        this.currentArr = new String[INITIAL_LENGTH];
        numberOfElements = 0;
    }

    //resize method...1
    public void resize() {
        String[] temp = new String[currentArr.length * 2];
        int j = 0;
        for (int i = 0; i < numberOfElements; i++) {
            temp[j] = currentArr[i];
            j++;
        }
        currentArr = temp;
    }

    //add method...2
    public void add(String s) {
        if (s == null) throw new IndexOutOfBoundsException("Index is out of bound");
        if (currentArr.length == numberOfElements) resize();
        currentArr[numberOfElements++] = s;
    }

    //    //insert method...3
    public void insert(String s, int pos) {
        if (s == null) return;
        if (pos < 0 || pos >= numberOfElements) throw new IndexOutOfBoundsException("Index out of bounds");
        if (currentArr.length == numberOfElements) resize();
        String[] temp = new String[currentArr.length];
        System.arraycopy(currentArr, 0, temp, 0, pos);
        temp[pos] = s;
        System.arraycopy(currentArr, pos, temp, pos + 1, currentArr.length - (pos + 1));
        numberOfElements++;
        currentArr = temp;
    }

    //
//    //get method...4
    public String get(int index) {
        if (index < 0 || index >= numberOfElements) throw new IndexOutOfBoundsException("Index out of bounds");
        return currentArr[index];
    }

    //
//    //printAll method...5
    public void printAll() {
        for (String e : currentArr) {
            System.out.println(e);
        }
    }

    //
//    //isEmpty method...6
    public boolean isEmpty() {
        return (numberOfElements == 0);
    }

    //find method...7
    public boolean find(String s) {
        if (s == null) return false;
        for (int i = 0; i < numberOfElements; i++) {
            if (s.equals(currentArr[i])) return true;
        }
        return false;
    }

    //
//    //remove method...8
    public boolean remove(String s) {
        if (s == null) return false;
        int index = -1;
        for (int i = 0; i < numberOfElements; i++) {
            if (s.equals(currentArr[i])) index = i;
        }
        if (index == -1) return false;
        String[] temp = new String[currentArr.length - 1];
        int j = 0;
        for (int i = 0; i < currentArr.length; i++) {
            if (i != index) {
                temp[j++] = currentArr[i];
            }
        }
        numberOfElements--;
        currentArr = temp;
        return true;
    }

    //
//    //remove method...9
    public boolean remove(int pos) {
        if (pos < 0 || pos >= numberOfElements) return false;
        String[] temp = new String[currentArr.length - 1];
        int j = 0;
        for (int i = 0; i < currentArr.length; i++) {
            if (i != pos) {
                temp[j++] = currentArr[i];
            }
        }
        numberOfElements--;
        currentArr = temp;
        return true;
    }

    //
//    //toString method...10
    public String toString() {
        String str = "MyStringList = [";
        for (int i = 0; i < numberOfElements; i++) {
            str += currentArr[i];
            if (i != numberOfElements - 1) str += ", ";
        }
        str += "]";
        return str;
    }

    //size method...11
    public int size() {
        return numberOfElements;
    }

    //
//    //clone method...12
    public Object clone() {
        String[] temp = new String[numberOfElements];
        for (int i = 0; i < numberOfElements; i++) {
            temp[i] = currentArr[i];
        }
        return Arrays.toString(temp);
    }

    //main method
    public static void main(String[] args) {
        MyStringList m = new MyStringList();

        //add method
        m.add("A");
        m.add("B");
        m.add("C");
        m.add("D");
        m.add("E");  //Doubles the size of the array
        m.printAll();  //prints all the elements of the array

        System.out.println("*".repeat(50));

        //insert method
        m.insert("Z", 1);
        m.printAll();

        System.out.println("*".repeat(50));

        //get method
        String firstLetter = m.get(1);
        System.out.println(firstLetter);

        System.out.println("*".repeat(50));

        //printAll method
        m.printAll();

        System.out.println("*".repeat(50));

        //isEmpty method
        boolean isEmpty = m.isEmpty();
        System.out.println(isEmpty);

        System.out.println("*".repeat(50));

        //find method
        boolean isFound = m.find("F");
        System.out.println(isFound);

        System.out.println("*".repeat(50));

        //remove method
        boolean isRemoved = m.remove("D");   //D is removed
        System.out.println(isRemoved);
        m.printAll();

        System.out.println("*".repeat(50));

        //remove method
        boolean isRemovedd = m.remove(0);
        System.out.println(isRemovedd);
        m.printAll();

        System.out.println("*".repeat(50));
//
        ////break to see all
        m.printAll();

        System.out.println("*".repeat(50));
//
        //size method
        int size = m.size();
        System.out.println(size);
//
//        //toString method
        String strRepresentation = m.toString();
        System.out.println(strRepresentation);

        System.out.println("*".repeat(50));

//        //clone method
        System.out.println(m.clone());

    }
}

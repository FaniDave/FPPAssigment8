package Day8.PersonalExcercise.List;

import java.util.Arrays;

public class GrowableArray {     //GROWABLE ARRAY

    //Instance fields
    private String[] data;
    private int size;

    //Constructor
    public GrowableArray(int initialCapacity) {
        this.data = new String[initialCapacity];
    }

    //growArray method
    public void growArray() {
        String[] newArr = new String[data.length * 2];
        for (int i = 0; i < data.length; i++) {
            newArr[i] = data[i];
        }
        data = newArr;
    }

    //add method to add elements without index
    public void add(String element) {
        if (data.length == size) growArray();
        data[size] = element;
        size++;
    }

    //add method to add elements with index
    public void add(int index, String element) {
        if (index < 0 || index >= data.length) throw new IndexOutOfBoundsException("Index out of bound");
        if (data.length == size) growArray();
        data[index] = element;
        size++;
    }

    //get method to retrieve element
    public String get(int index) {
        if (index < 0 || index >= data.length) throw new IndexOutOfBoundsException("Index out of bound");
        return data[index];
    }

    //size method to know the size of the array
    public int size() {
        return size;
    }

    //contains method to check if an element is found in the array
    public boolean contains(String element) {
        int count = 0;
        for (int i = 0; i < size; i++) {
            if (data[i].equals(element)) count++;
        }
        return (count > 0) ? true : false;
    }

    //is Empty method
    public boolean isEmpty() {
        return data.length == 0;
    }


    //    //remove method using index
    public void remove(int index) {
        if (index < 0 || index >= data.length) throw new IndexOutOfBoundsException("Index out of bound");
        String[] newArr = new String[data.length - 1];
        int j = 0;
        for (int i = 0; i < data.length; i++) {
            if (index != i) {
                newArr[j] = data[i];
                j++;
            }
        }
        data = newArr;
    }

    //    //remove method using object
    public void remove(String element) {
        String[] newArr = new String[data.length - 1];
        int j = 0;
        for (int i = 0; i < data.length; i++) {
            if (data[i] != element) {
                newArr[j] = data[i];
                j++;
            }
        }

        data = newArr;
    }


    //main method
    public static void main(String[] args) {
        GrowableArray l = new GrowableArray(3);

        //Insert elements to the array
        l.add("Faniel");
        l.add("Sirak");
        l.add(2, "Diana");
        l.add("Petros");        /// Size of the array doubles here
        System.out.println(Arrays.toString(l.data));

        System.out.println("*".repeat(50));

        //Retrieve elements using their index
        String name = l.get(1);
        System.out.println(name);

        System.out.println("*".repeat(50));

        //size of the array
        int size = l.size();
        System.out.println(size);
        System.out.println(l.data.length);

        System.out.println("*".repeat(50));

        //check if an element is found in the array
        boolean isFanielFound = l.contains("Faniel");
        System.out.println(isFanielFound);

        System.out.println("*".repeat(50));

        //check if our array is empty or not
        boolean isOurArrEmpty = l.isEmpty();
        System.out.println(isOurArrEmpty);

        System.out.println("*".repeat(50));

        // remove element using their index
        l.remove(1);
        System.out.println(Arrays.toString(l.data));

        System.out.println("*".repeat(50));

        //removeElement using object
        l.remove("Diana");
        l.remove(null);
        l.remove(null);
        System.out.println(Arrays.toString(l.data));
    }

}

package Day8.PersonalExcercise.List;

import java.util.ArrayList;
import java.util.List;

public class ListADT {

    //Instance fields
    private List<Object> data;

    //Constructor
    public ListADT() {
        this.data = new ArrayList<>();
    }

    //insert method to insert elements using their position
    public void insert(Object element, int position) {
        if (position < 0 || position >= data.size()) throw new IndexOutOfBoundsException("Index out of Bounds");
        data.add(position, element);
    }

    //insert method to insert elements
    public void insert(Object o) {
        data.add(o);
    }

    //find element and return it's position
    public int find(Object o) {
        return data.indexOf(o);
    }

    //findKth element and return the object according to it's position
    public Object findKth(int position) {
        if (position < 0 || position >= data.size()) throw new IndexOutOfBoundsException("Index out of bounds");
        return data.get(position);
    }

    //remove method to remove objects from the list
    public void remove(Object o) {
        data.remove(o);
    }

    //remove method using index
    public void remove(int position) {
        if (position < 0 || position >= data.size()) throw new IndexOutOfBoundsException("Index out of bounds");
        data.remove(position);
    }

    //printList method using index
    public void printList() {
        for (Object l : data) {
            System.out.println(l);
        }
    }

    //makeEmpty method
    public void makeEmpty() {
        data.clear();
    }

    //main method
    public static void main(String[] args) {
        ListADT l = new ListADT();

        //insert method  to add elements
        l.insert("Faniel");
        l.insert("Sirak");
        l.insert("Diana");
        l.insert("Petros");
        l.insert("Heran", 2);
        l.printList();

        System.out.println("*".repeat(50));

        //find the index of an elemet
        int index = l.find("Faniel");
        System.out.println(index);

        System.out.println("*".repeat(50));

        //find the element using index
        Object element = l.findKth(2);
        System.out.println(element);

        System.out.println("*".repeat(50));

        //remove element from the list
        l.remove(3);
        l.remove("Petros");
        l.printList();

        System.out.println("*".repeat(50));

        //Making the list empty
        l.makeEmpty();
    }
}



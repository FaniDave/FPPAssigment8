package Day8.PersonalExcercise.List;

public class MyLinkedList {

    //ListNode class
    class ListNode {
        //Instance fields for ListNode
        int val;
        ListNode next;

        //Constructor
        public ListNode(int x) {
            val = x;
        }
    }

    //Instance fields for Outer class
    ListNode head;
    int size;

    //Constructor of the outer class
    public MyLinkedList() {
        head = new ListNode(0);
        size = 0;
    }


    //addAtIndex method
    public void addAtIndex(int index, int val) {
        if (index > size) return;
        if (index < 0) index = 0;

        ListNode pred = head;
        for (int i = 0; i < index; i++) {
            pred = pred.next;
        }
        ListNode toAdd = new ListNode(val);
        toAdd.next = pred.next;
        pred.next = toAdd;
        size++;

    }

    //get
    public int get(int index) {
        if (index < 0 || index >= size) return -1;

        ListNode curr = head;
        for (int i = 0; i < (index + 1); i++) {
            curr = curr.next;
        }
        return curr.val;
    }

    //addAtHead
    public void addAtHead(int val) {
        addAtIndex(0, val);
    }

    //addAtTail
    public void addAtTail(int val) {
        addAtIndex(size, val);
    }

    //deleteAtIndex
    public void deleteAtIndex(int index) {
        if (index < 0 || index >= size) return;

        ListNode pred = head;
        for (int i = 0; i < index; i++) {
            pred = pred.next;
        }
        pred.next = pred.next.next;
        size--;
    }

    //main method
    public static void main(String[] args) {
        MyLinkedList m = new MyLinkedList();
        m.addAtIndex(0, 3);
        m.addAtIndex(0, 8);
        m.addAtIndex(1, 6);
        m.deleteAtIndex(2);
        m.deleteAtIndex(1);

        int element = m.get(0); //8
        System.out.println(element);
    }

}

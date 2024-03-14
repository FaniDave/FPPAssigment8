package Day8.Assigment;

//Person class
public class Person {

    //Instance fields
    private String lastName;
    private String firstName;
    private int age;

    // --------------------------------------------------------------
    public Person(String last, String first, int a) { // constructor
        lastName = last;
        firstName = first;
        age = a;
    }
    // --------------------------------------------------------------

    //getLast method ...1
    public String getLast() // get last name
    {
        return lastName;
    }

    //toString method ...2
    @Override
    public String toString() {
        return "Person [lastName=" + lastName + "\n FirstName=" + firstName +
                "\nAge=" + age + "]";
    }

    //add method ... 3
    public void add(String s) {
        if (s == null) return;
        lastName = lastName + " " + s;
    }

    //isEmpty method ... 4
    public boolean isEmpty() {
        return (lastName == null || lastName.length() == 0);
    }

    //find method ... 5
    public boolean find(char s) {
        for (int i = 0; i < lastName.length(); i++) {
            if (lastName.charAt(i) == s) return true;
        }
        return false;
    }

    //insert method to insert an element by index ... 6
    public void insert(char s, int pos) {
        String temp = "";
        for (int i = 0; i < lastName.length(); i++) {
            if (pos == i) break;
            temp += lastName.charAt(i);
        }
        temp += s;
        for (int i = pos; i < lastName.length(); i++) {
            temp += lastName.charAt(i);
        }
        lastName = temp;
    }

    //remove method ... 7
    public boolean remove(char s) {
        //faniel
        String temp = "";
        int count = 0;
        for (int i = 0; i < lastName.length(); i++) {
            if (lastName.charAt(i) != s) {
                temp += lastName.charAt(i);
            } else {
                count++;
            }
        }
        lastName = temp;
        return (count > 0 ? true : false);
    }

    //size of the array ... 8
    public int size() {
        return lastName.length();
    }

    ////clone method ... 9
    public Object clone() {
        String lastNameClone = new String(lastName);
        return lastNameClone;
    }

    //main method
    public static void main(String[] args) {
        Person p = new Person("Abraha", "Faniel", 30);

        //toString method
        String strReprsentation = p.toString();
        System.out.println(strReprsentation);

        //add method
        p.add("Zhgta");

        //getLast method
        System.out.println(p.getLast());

        //isEmpty method
        System.out.println(p.isEmpty());

        //find method
        System.out.println(p.find('a'));

        //insert method
        p.insert('m', 6);
        System.out.println(p.getLast());

        //remove method
        System.out.println(p.remove('m'));
        System.out.println(p.getLast());

        //size method
        System.out.println(p.size());

        //clone method
        System.out.println(p.clone());
    }
}

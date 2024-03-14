package Day8.PersonalExcercise.List;

import java.util.ArrayList;
import java.util.List;

public class ListExample {

    //main method
    public static void main(String[] args) {

//           Collection<String> collection = new Collection<String>() {
//               @Override
//               public int size() {
//                   return 0;
//               }
//
//               @Override
//               public boolean isEmpty() {
//                   return false;
//               }
//
//               @Override
//               public boolean contains(Object o) {
//                   return false;
//               }
//
//               @Override
//               public Iterator<String> iterator() {
//                   return null;
//               }
//
//               @Override
//               public Object[] toArray() {
//                   return new Object[0];
//               }
//
//               @Override
//               public <T> T[] toArray(T[] a) {
//                   return null;
//               }
//
//               @Override
//               public boolean add(String s) {
//                   return false;
//               }
//
//               @Override
//               public boolean remove(Object o) {
//                   return false;
//               }
//
//               @Override
//               public boolean containsAll(Collection<?> c) {
//                   return false;
//               }
//
//               @Override
//               public boolean addAll(Collection<? extends String> c) {
//                   return false;
//               }
//
//               @Override
//               public boolean removeAll(Collection<?> c) {
//                   return false;
//               }
//
//               @Override
//               public boolean retainAll(Collection<?> c) {
//                   return false;
//               }
//
//               @Override
//               public void clear() {
//
//               }
//           };


//           List<Integer> names = new List<Integer>() {
//               @Override
//               public int size() {
//                   return 0;
//               }
//
//               @Override
//               public boolean isEmpty() {
//                   return false;
//               }
//
//               @Override
//               public boolean contains(Object o) {
//                   return false;
//               }
//
//               @Override
//               public Iterator<Integer> iterator() {
//                   return null;
//               }
//
//               @Override
//               public Object[] toArray() {
//                   return new Object[0];
//               }
//
//               @Override
//               public <T> T[] toArray(T[] a) {
//                   return null;
//               }
//
//               @Override
//               public boolean add(Integer integer) {
//                   return false;
//               }
//
//               @Override
//               public boolean remove(Object o) {
//                   return false;
//               }
//
//               @Override
//               public boolean containsAll(Collection<?> c) {
//                   return false;
//               }
//
//               @Override
//               public boolean addAll(Collection<? extends Integer> c) {
//                   return false;
//               }
//
//               @Override
//               public boolean addAll(int index, Collection<? extends Integer> c) {
//                   return false;
//               }
//
//               @Override
//               public boolean removeAll(Collection<?> c) {
//                   return false;
//               }
//
//               @Override
//               public boolean retainAll(Collection<?> c) {
//                   return false;
//               }
//
//               @Override
//               public void clear() {
//
//               }
//
//               @Override
//               public Integer get(int index) {
//                   return null;
//               }
//
//               @Override
//               public Integer set(int index, Integer element) {
//                   return null;
//               }
//
//               @Override
//               public void add(int index, Integer element) {
//
//               }
//
//               @Override
//               public Integer remove(int index) {
//                   return null;
//               }
//
//               @Override
//               public int indexOf(Object o) {
//                   return 0;
//               }
//
//               @Override
//               public int lastIndexOf(Object o) {
//                   return 0;
//               }
//
//               @Override
//               public ListIterator<Integer> listIterator() {
//                   return null;
//               }
//
//               @Override
//               public ListIterator<Integer> listIterator(int index) {
//                   return null;
//               }
//
//               @Override
//               public List<Integer> subList(int fromIndex, int toIndex) {
//                   return null;
//               }
//           };

        List<String> students = new ArrayList<>();

        //insert elements
        students.add("Faniel");
        students.add(1, "Sirak");
        students.add(2, "Diana");
        students.add(3, "Petros");
        System.out.println(students);

        System.out.println("*".repeat(50));

        //removing elements
        students.remove(1);
        students.remove("Petros");
        System.out.println(students);

        System.out.println("*".repeat(50));

        //Retrieving element from the list
        String studentOne = students.get(0);
        System.out.println(studentOne);

        System.out.println("*".repeat(50));

        //Size of the list
        int size = students.size();
        System.out.println(size);

        System.out.println("*".repeat(50));

        //check if an element is in the list
        boolean isFound = students.contains("Faniel");
        System.out.println(isFound);

        System.out.println("*".repeat(50));

        //check if an element is empty
        boolean isListEmpty = students.isEmpty();
        System.out.println(isListEmpty);

        System.out.println("*".repeat(50));

        //removing all elements from the list
        students.clear();
        System.out.println(students);

    }
}

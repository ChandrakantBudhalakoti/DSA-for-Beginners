package ArrayList;
import java.util.ArrayList;
import java.util.Collections;

public class SortinginArrayList {
    public static void main(String[] args) {
        // Create an arraylist of integers
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(5);
        list.add(9);
        list.add(3);
        list.add(6);
        System.out.println(list);
        Collections.sort(list);  // sort the elements in ascending order using collections.sort() method
        System.out.println("Sorted List (Ascending order): " + list);

        // To print the elements in descending order, we can use a custom Comparator that sorts the numbers in reverse order
        Collections.sort(list, Collections.reverseOrder());
        System.out.println("Sorted List(Descending Order): " + list);

    }
}

package ArrayList;

import java.util.ArrayList;
// import java.util.List;

public class ProblemsofArrayList {
    // problem 1. reverse arraylist
    public static void reverse(ArrayList<Integer> List) {
        System.out.println("Original List : ");
        for (int i : List) {
            System.out.print(i + " ");
        }
        System.out.println("\nReversed List : ");
        for (int i = List.size()-1; i >= 0; i--) {
            System.out.print(List.get(i) + " ");
        }
        System.out.println();
    }

    //problem 2 find maximum in an arraylist
    public static int maxElement(ArrayList<Integer> List) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < List.size(); i++) {
            // if(max < List.get(i)){
            //     max = List.get(i);
            // }
            max = Math.max(max, List.get(i));
        }
        System.out.println("max element is: " + max);
        return max;
            
    }
    
    //problem 2 swap two numbers in an arraylist
    public static void swap (ArrayList<Integer>list, int idx1, int idx2){
        int temp = list.get(idx1);
        list.set(idx1, list.get(idx2));
        list.set(idx2, temp);
    }

    public static void main(String[] args) {
        ArrayList<Integer> List = new ArrayList<>();
        List.add(1);
        List.add(2);
        List.add(3);
        List.add(4);
        List.add(5);
        List.add(55);
        reverse(List);
        maxElement(List);

        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(5);
        list.add(9);
        list.add(3);
        list.add(6);
        int idx1 = 1, idx2 = 3;
        System.out.println("Before swapping elements " + list );
        swap(list, idx1, idx2);
        System.out.println("After swapping elements " + list );

    }

}

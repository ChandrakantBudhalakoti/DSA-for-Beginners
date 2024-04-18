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
        System.out.println(max);
        return max;
            
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
        // maxElement(List);
    }

}

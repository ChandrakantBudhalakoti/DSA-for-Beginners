// Linear search is used to search a key element from multiple elements. 
// Algorithm ->
// Step 1: Traverse the array
// Step 2: Match the key element with array element
// Step 3: If key element is found, return the index position of the array element
// Step 4: If key element is not found, return -1
package Searching;

public class linearSearch {
    public static int linear(int[] numbers, int key) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == key) {
                return i;
            }

        }
        return -1;
    }

    public static void main(String[] args) {
        int[] numbers = { 2, 4, 6, 8, 10, 12, 14, 16, 18, 20 };
        int key = 10;
        int index = linear(numbers, key);
        if (index == -1){
            System.out.println("ITEM NOT FOUND !!");
        }
        else{
            System.out.println("ITEM FOUND AT INDEX -> "+ index);
        }
    }

}

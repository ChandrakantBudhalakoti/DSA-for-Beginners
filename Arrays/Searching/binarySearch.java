// Binary search is used to search a key element from multiple elements. Binary search is faster than linear search.
// Algorithm ->
// Step 1: Start
// Step 2: Take input array and Target
// Step 3: Initialise start = 0 and end = (array size -1)
// Step 4: Intialise mid variable
// Step 5: mid = (start+end)/2
// Step 6: if array[ mid ] == target then return mid
// Step 7: if array[ mid ] < target then start = mid+1
// Step 8: if array[ mid ] > target then end = mid-1
// Step 9: if start<=end then goto step 5
// Step 10: return -1 as Not element found
// Step 11: Exit

package Searching;

public class binarySearch {
    public static int search(int[] numbers, int key) {
        int start = 0;
        int end = numbers.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (numbers[mid] == key) {
                return mid;
            } 
            if (numbers[mid] < key) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] numbers = {2, 4, 6, 8, 10};
        int key = 10;
        int result = search(numbers, key);
        if (result == -1){
            System.out.println("ITEM NOT FOUND!!");
        } else {
            System.out.println("FOUND AT INDEX: " + result);
        }
    }
}

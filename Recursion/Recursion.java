package Recursion;

/**
 * Recursion
 */
public class Recursion {
    public static void printDec(int n){
        //base case : if the number is 1, just return.
        if (n == 1){
            System.out.print(n);
            return;
        }
        //recursive case: call the function with n-1 and print n in between of that call.
        System.out.print(n + " ");
        printDec(n - 1);

    }
    public static void main(String[] args) {
        int n = 10;
        printDec(n);
    }

    
}
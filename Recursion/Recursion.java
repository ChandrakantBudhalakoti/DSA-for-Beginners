package Recursion;

/**
 * Recursion
 */
public class Recursion {
    // Problem 1: Print numbers in decreasing order
    public static void printDec(int n) {
        // base case : if the number is 1, just return.
        if (n == 1) {
            System.out.print(n);
            return;
        }
        // recursive case: call the function with n-1 and print n in between of that
        // call.
        System.out.print(n + " ");
        printDec(n - 1);
    }

    // Problem 2: Print numbers in increasing order
    public static void printInc(int n) {
        if (n == 1) {
            System.out.print(n + " ");
            return;
        }
        printInc(n - 1);
        System.out.print(n + " ");

    }

    // Problem 3: Print Factorial of a number n
    public static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        if (n < 0) {
            System.out.println("Factorial is not defined for negative numbers");
            return -1;
        }
        int fnm1 = factorial(n - 1);
        int fn = n * fnm1;
        return fn;
    }

    // Problem 4: Print sum of first n natural numbers
    public static int sum(int n) {
        if (n == 1) {
            return 1;
        }
        int snm1 = sum(n - 1);
        int sn = n + snm1;
        return sn;
    }

    // Problem 5: Print Nth Fibbonacci number
    public static int fib(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        int fnm1 = fib(n - 1);
        int fnm2 = fib(n - 2);
        int fn = fnm1 + fnm2;
        return fn;
    }

    // Problem 6: Check if a given array is sorted or not
    public static boolean isSorted(int[] arr, int i) {
        if (i == arr.length - 1) {
            return true;
        }
        if (arr[i] > arr[i + 1]) {
            return false;
        }
        return isSorted(arr, i + 1);
    }

    public static void main(String[] args) {
        int n = 10;
        System.out.print("Decreasing Order: ");
        printDec(n);
        System.out.println();
        System.out.print("Increasing Order: ");
        printInc(n);
        System.out.println();
        // System.out.println("Factorial of n");
        System.out.println("Factorial of " + n + "! = " + factorial(n));
        System.out.println("Sum of first " + n + " natural numbers = " + sum(n));
        System.out.println("The " + n + "-th Fibonacci Number = " + fib(n));
        int[] arr = { 1, 2, 3, 4 };
        System.out.println(isSorted(arr, 0));
    }
}
// Before Starting DSA we imagine you know the basics of Java because we are doing DSA with JAVA.
// First of all what is Array -> Array is the list of element of the same type placed in contiguous memory location.
// Operations in array
// 1. Create 2. Input 3. Output 4. Update

import java.util.*;
public class ArrayCreation {
    public static void main(String[] args) {
        //1. Creation
        int numbers [] = new int [10]; //where we don't know the values exactly.
        int marks [] = {89,78,67}; //here we know the values [java will automatically get the size here].
        String fruits [] = {"Apple", "Mango", "Banana"}; //String type Array

        //2. Input
        //first import java.util package and create an object for Scanner class
        Scanner sc = new Scanner(System.in);
        int randomNumbers [] = new int[10];
        marks[0] = sc.nextInt(); // marks[indexValue where you want to take input (java is 0 based indexing language)]
        //3. Output
        System.out.println("marks -> " + marks [0]);
        //4. Update
        marks [0] = 100;
        randomNumbers[0] = 89;
        fruits[3] = "papaya";
        numbers[0] = 89;
        System.out.println("marks after update -> " + marks[0]);
        sc.close();
    }
}

package Strings;

/**
 * PrintLargestString by Lexicographic order
 */
public class PrintLargestString {
    public static void main(String[] args) {
        String[] fruits = {"apple", "banana", "cherry", "mango", "papaya"};
        String largest = fruits[0];
        for (int i = 0; i< fruits.length; i++){
            if(largest.compareTo(fruits[i]) < 0){
                largest = fruits[i];
            }
        }
        System.out.println("Largest String is -> " + largest);

    }


    
}
/* Check if a number is odd or even by Bit Manipulation  */
package BitManipulation;

public class EvenOdd {
    public static void evenOdd (int n){
        int BitMask = 1;
        if((n & BitMask) == 0){
            System.out.println("THE NUMBER "+n+" IS EVEN");
        }else{
            System.out.println("THE NUMBER "+n+" IS ODD");
        }
    }
    public static void main(String[] args) {
        evenOdd(9);
        evenOdd(22);
        evenOdd(7);
        evenOdd(2);
    }
    
}

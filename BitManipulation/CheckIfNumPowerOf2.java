package BitManipulation;

/**
 * CheckIfNumPowerOf2
 */
public class CheckIfNumPowerOf2 {

    public boolean isPowerOfTwo(int n) {
        return (n & (n-1)) == 0;
    }
    public static void main(String[] args) {
        int num = 8;
        System.out.println("Is " + num + " a power of two? " + new CheckIfNumPowerOf2().isPowerOfTwo(num));

        // Testing for negative numbers and zero
        num = -8;
        System.out.println("\nIs " + num + " a power of two? " + new CheckIfNumPowerOf2().isPowerOfTwo(num));
       
    }
}
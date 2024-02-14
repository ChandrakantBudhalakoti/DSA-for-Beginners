/*Operations for Bit Manipulations 
 * Get ith Bit
 * Set ith Bit
 * clear ith Bit
 * update ith bit
 * clearLastIthBit
 */
package BitManipulation;

public class BitManipulationOperations {
    public static int getIthBit(int n, int i) {
        int bitMask = (1 << i); // Creating a mask with 'i' bit set.
        if ((n & bitMask) == 0) {
            return 0;
        } else {
            return 1;
        }
    }

    public static int setIthBit(int n, int i) {
        int bitMask = (1 << i); // Creating a mask with 'i' bit set.
        return (n | bitMask); // Setting the 'i' th bit of n to 1 using OR operation.
    }

    public static int clearIthBit(int n, int i) {
        int bitMask = ~(1 << i); // Complementing the 'i' th bit of n.
        return (n & bitMask); // Clearing the 'i' th bit of n using AND operation.
    }

    public static int updateIthBit(int n, int i, int newBit) {
        if (newBit == 0) {
            return clearIthBit(n, i);
        } else {
            return setIthBit(n, i);
        }
        /* another way to update */
        /*
         * n = clearIthBit(n, i);
         * int bitMask = newBit << i;
         * return n|bitMask;
         */
    }

    public static int clearLastIthBit(int n, int i) {
        int bitMask = (~0) << i;
        return n & bitMask;
    }

    public static void main(String[] args) {
        System.out.println("Get ith Bit "+getIthBit(10, 2));
        System.out.println("Set ith Bit "+setIthBit(10, 2));
        System.out.println("clear ith Bit "+clearIthBit(10, 1));
        System.out.println("Update ith Bit "+updateIthBit(10, 2, 1));
        System.out.println("Clear Last Bit "+clearLastIthBit(10,2));
    }
}

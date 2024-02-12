/*Operations for Bit Manipulations 
 * Get ith Bit
 * Set ith Bit
 * clear ith Bit
 * update ith bit
 */
package BitManipulation;

public class BitManipulationOperations {
    public static int  getIthBit(int n, int i) {
        int  bitMask = (1 << i); //Creating a mask with 'i' bit set.
        if((n & bitMask) == 0){
            return 0;
        }else{
            return 1;
        }
    }

    public static int  setIthBit(int n, int i) {
        int  bitMask = (1 << i); //Creating a mask with 'i' bit set.
        return (n | bitMask);   //Setting the 'i' th bit of n to 1 using OR operation.
    }
    public static int  clearIthBit(int n, int i) {
        int  bitMask = ~(1 << i); //Complementing the 'i' th bit of n.
        return (n & bitMask);     //Clearing the 'i' th bit of n using AND operation.
    }

    public static int updateIthBit(int n, int i, int newBit){
        if(newBit == 0){
            return clearIthBit(n, i);
        }else{
            return setIthBit(n, i);
        }
        /*another way to update */
        /*n = clearIthBit(n, i);
        int bitMask = newBit << i;
        return n|bitMask;*/
    }
    public static void main(String[] args) {
        System.out.println(getIthBit(10, 2));
        System.out.println(setIthBit(10, 2));
        System.out.println(clearIthBit(10, 1));
        System.out.println(updateIthBit(10, 2, 1));
    }
}

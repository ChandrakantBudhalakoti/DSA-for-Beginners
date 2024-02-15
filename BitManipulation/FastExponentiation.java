package BitManipulation;

public class FastExponentiation {
    public static int FastExpo(int a, int n) {
        int ans = 1;
        while (n > 0) {
            if ((n & 1) != 0) {
                ans *= a;
            }
            a = a * a;
            n = n >> 1;

        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(FastExpo(2, 5)); // 32
        System.out.println(FastExpo(-2, 3)); // -8
        System.out.println(FastExpo(0, 6)); // 0
        System.out.println(FastExpo(4, 0)); // 1
    }
}

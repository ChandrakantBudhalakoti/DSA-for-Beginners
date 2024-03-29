package Recursion;

public class RecursionAdvance {
    // Problem 1: Tilling Porblem
    public static int tillingProblem(int n) {
        // base case
        if (n == 0 || n == 1) {
            return 1;
        }
        // recursive case
        // if vertical direction choice
        int fnm1 = tillingProblem(n - 1);
        // if horizontal direction choice
        int fnm2 = tillingProblem(n - 2);
        int totalWays = fnm1 + fnm2;
        return totalWays;
        // compact way of doing the same thing
        // return tillingProblem(n-1) + tillingProblem(n-2);
    }

    // Problem 2: Remove duplicate Strings
    public static void removeDuplicateStrings(String str, int idx, StringBuilder newStr, boolean[] map) {
        // base case
        if (idx == str.length()) {
            System.out.println(newStr);
            return;
        }
        // recursive case
        char currentChar = str.charAt(idx);
        // check if the character is already added or not
        if (map[currentChar - 'a'] == true) {
            // duplicate so skip this character and move to next index
            removeDuplicateStrings(str, idx + 1, newStr, map);
        } else {
            map[currentChar - 'a'] = true;
            removeDuplicateStrings(str, idx + 1, newStr.append(currentChar), map);
        }
    }

    // Problem 3: Friends Pairing problem
    public static int friendsPairing(int n) {
        // base case
        if (n == 1 || n == 2) {
            return n;
        }
        // recursive case
        // if single choice
        int fnm1 = friendsPairing(n - 1);
        // if pairs choice
        int fnm2 = friendsPairing(n - 2);
        int pairsways = (n - 1) * fnm2;
        // totalWays
        int totalWays = fnm1 + pairsways;
        return totalWays;

        // compact way of doing the same thing
        /* return friendsPairing(n- 1) + (n-1) * friendsPairing(n-2); */
    }

    // Problem 14: Print Binary String
    public static void printBinaryString(int n, int lastPlace, String str) {
        // base case
        if (n == 0) {
            System.out.println(str);
            return;
        }
        // recursive case
        printBinaryString(n - 1, 0, str + "0");
        if (lastPlace == 0) {
            printBinaryString(n - 1, 1, str + "1");
        }
    }

    // Pronlem 15: Tower Of Hanoi
    public static void towerOfHanoi(int n, String src, String helper, String dest) {
        if (n == 1) {
            System.out.println("Move disk " + n + " from " + src + " to " + dest);
            return;
        }
        towerOfHanoi(n - 1, src, dest, helper);
        System.out.println("Move disk " + n + " from " + src + " to " + dest);
        towerOfHanoi(n - 1, helper, src, dest);

    }

    public static void main(String[] args) {
        System.out.println("Number of ways to tile a room with n tiles is : " + tillingProblem(4));
        String str = "appnnacollege";
        boolean[] map = new boolean[26];// assuming only lowercase alphabets are there in string
        removeDuplicateStrings(str, 0, new StringBuilder(), map);
        System.out.println(friendsPairing(3));
        printBinaryString(3, 0, " ");
        towerOfHanoi(3, "S", "H", "D");
    }

}

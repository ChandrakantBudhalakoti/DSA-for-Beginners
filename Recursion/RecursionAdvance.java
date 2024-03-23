package Recursion;

public class RecursionAdvance {
    // Problem 1: Tilling Porblem 
    public static int tillingProblem(int n){
        //base case 
        if(n==0 || n==1){
            return 1;
        }
        //recursive case
        //if vertical direction choice
        int fnm1 = tillingProblem(n-1);
        int fnm2 = tillingProblem(n-2);
        int totalWays = fnm1 + fnm2;
        return totalWays;
    }
    public static void main(String[] args) {
        System.out.println("Number of ways to tile a room with n tiles is : "+tillingProblem(4));
    }
    
}

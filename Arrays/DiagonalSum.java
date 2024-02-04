//Diagonal sum with Bruteforce + Optimize approach  
public class DiagonalSum {
    public static void main(String[] args) {
        int matrix[][] = {
                { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 }

        };
        System.out.println("Diagonal Sum is -> " + printDiagonalSum(matrix));
    }

    public static int printDiagonalSum(int matrix[][]) {
        /* ****************BRUTEFORCE ****************** */
       /* if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            System.out.println("Invalid Matrix");
            return 0;
        }
        int n = matrix.length;//rows
        int m = matrix[0].length;//columns
        int sum = 0;
        for (int i = 0; i<n; i++){
            for (int j = 0; j<m; j++){
                if(i == j){//primary diagonal 
                    sum += matrix[i][j];
                }
                else if (i + j == n - 1) { //secondary diagonal 
                    sum += matrix[i][j];
                }
            } 
        }
       return sum; */

        /* **************** optimize approach  ****************** */
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            System.out.println("Invalid Matrix");
            return 0;
        }

        int n = matrix.length;
        int sum = 0;

        for (int i = 0; i < n; i++) {
            // primary diagonal
            sum += matrix[i][i];
            // secondary diagonal
            if (i != n - 1 - i)
                sum += matrix[i][n - i - 1];
        }
        return sum;
    }
}

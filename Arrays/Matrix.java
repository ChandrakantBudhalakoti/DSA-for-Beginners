import java.util.Scanner;

public class Matrix {
    public static void main(String[] args) {
        int[][] matrix = new int[3][3];
        int n = matrix.length, m = matrix[0].length;
        // input
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the elements of the " + n + "x" + m + " matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        // output
        System.out.print("The entered matrix is:\n");
        printMatrix(matrix);
        searchElement(matrix, 10);
        sc.close();
    }
    // Printing a matrix
    public static void printMatrix(int[][] matrix) {
        int n = matrix.length, m = matrix[0].length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

    }
    // Searching an element in a matrix
    public static boolean searchElement(int[][] matrix, int key) {
        int n = matrix.length, m = matrix[0].length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if(matrix[i][j] == key){
                    System.out.println("KEY FOUND AT CELL  ("+i+" , "+j+")");
                    return true;
                }
            }
        }
        System.out.println("THE KEY IS NOT PRESENT IN THE MATRIX.");
        return false;
    }


}

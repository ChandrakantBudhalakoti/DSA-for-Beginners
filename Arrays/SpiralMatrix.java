public class SpiralMatrix {
    public static void main(String[] args) {
        // Initialize the matrix
        int[][] matrix = {
                { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 }
        };
        // Call the printSpiral method
        printSpiral(matrix);
    }

    public static void printSpiral(int[][] matrix) {
        int startRow = 0; // the starting row index of the current region.
        int endRow = matrix.length - 1; // The ending row index of the current region.
        int startCol = 0; // The starting column index of the current region.
        int endCol = matrix[0].length - 1; // The ending column index of the current region.

        while (startRow <= endRow && startCol <= endCol) {
            // Print top row from left to right.
            for (int col = startCol; col <= endCol; col++) {
                System.out.print(matrix[startRow][col] + " ");
            }
            // Print rightmost column from top to bottom.
            // if (startRow <= endRow){
            for (int row = startRow + 1; row <= endRow; row++) {
                System.out.print(matrix[row][endCol] + " ");
            }
            // }

            // Print bottom row from right to left.
            if (startRow == endRow) {
                break;
            }
            for (int i = endCol - 1; i >= startCol; i--) {
                System.out.print(matrix[endRow][i] + " ");
            }

            // Now we can print the leftmost column from bottom to top.
            if (startCol == endCol) {
                break;
            }
            for (int row = endRow - 1; row >= startRow + 1; row--) {
                System.out.print(matrix[row][startCol] + " ");
            }
            startRow++; // Move down to next row.
            endCol--; // Move left to previous column.
            endRow--; // Move up to previous row.
            startCol++; // Move right one step.
        }
        System.out.println();
    }

}
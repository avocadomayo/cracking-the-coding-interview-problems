package ca.wendyliu.cracking.the.coding.interview.problems.chapter1;

import java.util.HashSet;
import java.util.Set;

public class Problem8 {

    // takes O(N) space
    public static int[][] zeroMatrixMyAttempt(int[][] matrix) {
        int m = matrix.length;
        if (m == 0) {
            throw new IllegalArgumentException();
        }

        int n = matrix[0].length;

        Set<Integer> rowsToPaint = new HashSet<Integer>();
        Set<Integer> colsToPaint = new HashSet<Integer>();

        for (int row = 0; row < m; row++) {
            for (int col = 0; col < n; col++) {
                if (matrix[row][col] == 0) {
                    rowsToPaint.add(row);
                    colsToPaint.add(col);
                }
            }
        }

        for (int row : rowsToPaint) {
            for (int col = 0; col < n; col++) {
                matrix[row][col] = 0;
            }
        }

        for (int col : colsToPaint) {
            for (int row = 0; row < m; row++) {
                matrix[row][col] = 0;
            }
        }

        return matrix;
    }

    // takes O(1) space
    // method: use first row to keep track of which rows to paint; same for the columns.
    public static int[][] setZeroes(int[][] matrix) {
        // flags to see if first row/column has zero(es)
        boolean rowHasZero = false;
        boolean colHasZero = false;

        // check if first row has a zero
        for (int j = 0; j < matrix[0].length; j++) {
            if (matrix[0][j] == 0) {
                rowHasZero = true;
                break;
            }
        }

        // check if first column has a zero
        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i][0] == 0) {
                colHasZero = true;
                break;
            }
        }

        // check for zeroes in the rest of the array
        for (int i = 1; i < matrix.length; i++) {
            for (int j = 1; j < matrix[0].length; j++) {
                if (matrix[i][j] == 0) {
                    matrix[0][j] = 0;
                    matrix[i][0] = 0;
                }
            }
        }

        // nullify rows based on vals in first column
        for (int i = 1; i < matrix.length; i++) {
            if (matrix[i][0] == 0) {
                nullifyRow(matrix, i);
            }
        }

        // nullify columns based on vals in first row
        for (int j = 0; j < matrix[0].length; j++) {
            if (matrix[0][j] == 0) {
                nullifyCol(matrix, j);
            }
        }

        // nullify first row
        if (rowHasZero) {
            nullifyRow(matrix, 0);
        }

        // nullify first col
        if (colHasZero) {
            nullifyCol(matrix, 0);
        }

        return matrix;
    }

    private static int[][] nullifyRow(int[][] matrix, int rowIndex) {
        for (int j = 0; j < matrix[0].length; j++) {
            matrix[rowIndex][j] = 0;
        }

        return matrix;
    }

    private static int[][] nullifyCol(int[][] matrix, int colIndex) {
        for (int i = 0; i < matrix.length; i++) {
            matrix[i][colIndex] = 0;
        }

        return matrix;
    }
}

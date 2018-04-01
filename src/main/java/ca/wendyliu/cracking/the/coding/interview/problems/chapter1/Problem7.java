package ca.wendyliu.cracking.the.coding.interview.problems.chapter1;

public class Problem7 {

    // rotate matrix 90 degrees
    public static int[][] rotateMyAttempt(int[][] matrix) {
        int n = matrix.length;
        int[][] result = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                result[i][j] = matrix[n-1-j][i];
            }
        }

        return result;
    }

    public static int[][] rotateInPlaceMyAttempt(int[][] matrix) {
        int n = matrix.length;

        for (int i = 0; i < n/2; i++) {
            for (int j = i; i + j + 1 < n; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[n-1-j][i];
                matrix[n-1-j][i] = matrix[n-1-i][n-1-j];
                matrix[n-1-i][n-1-j] = matrix[j][n-1-i];
                matrix[j][n-1-i] = temp;
            }
        }

        return matrix;
    }

    public static boolean rotate(int[][] matrix) {
        if (matrix.length == 0 || matrix.length != matrix[0].length) {
            return false;
        }

        int n = matrix.length;
        for (int layer = 0; layer < n/2; layer++) {
            int first = layer; // first item in layer
            int last = n - 1 - layer; // last item in layer
            for (int i = first; i < last; i++) {
                int offset = i - first; // adjusts depending on which layer you're inh  
                int top = matrix[first][i]; // save top

                // left -> top
                matrix[first][i] = matrix[last-offset][first];

                // bottom -> left
                matrix[last-offset][first] = matrix[last][last-offset];

                // right -> bottom
                matrix[last][last-offset] = matrix[i][last];

                // top -> right
                matrix[i][last] = top; // right <- saved top
            }
        }

        return true;
    }
}

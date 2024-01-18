class Solution {
    public void setZeroes(int[][] matrix) {
        int rows = matrix.length, cols = matrix[0].length;
        boolean row0 = false, col0 = false;
        for (int i=0; i<rows; i++) {
            if (matrix[i][0] == 0) {
                col0 = true;
                break;
            }
        }

        for (int j=0; j<cols; j++) {
            if (matrix[0][j] == 0) {
                row0 = true;
                break;
            }
        }

        for (int i = 1; i < rows; i++) {
            for (int j = 1; j < cols; j++) {
                if (matrix[i][j] == 0) {
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }

        for (int i = 1; i < rows; i++) {
            for (int j = 1; j < cols; j++) {
                if (matrix[i][0] == 0 || matrix[0][j] == 0) {
                    matrix[i][j] = 0;
                }
            }
        }

        if (col0) {
            for (int i=0; i<rows; i++) {
                matrix[i][0] = 0;
            }   
        }

        if (row0) {
            for (int j=0; j<cols; j++) {
                matrix[0][j] = 0;
            }   
        }
        
    }

    public void printMatrix(int[][] matrix) {
        int rows = matrix.length, cols = matrix[0].length;
        for (int i=0; i<rows; i++) {
            for (int j=0; j<cols; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println("");
        }
    }
}

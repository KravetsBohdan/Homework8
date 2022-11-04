public class Main {
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}};


        int[][] composedMatrix = transposeMatrix(matrix);

        System.out.println("Original matrix");
        printMatrix(matrix);

        System.out.println("Transposed matrix");

        printMatrix(composedMatrix);

    }

    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int col: row) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }

    public static int[][] transposeMatrix(int[][] matrix) {
        int[][] transposedMatrix = new int[matrix[0].length][matrix.length];


        for (int i = 0; i < transposedMatrix.length; i++) {
            for (int j = 0; j < transposedMatrix[i].length; j++) {
                transposedMatrix[i][j] = matrix[matrix.length - j - 1][i];
            }
        }
        return transposedMatrix;

    }
}

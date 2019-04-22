package dstructure;

import java.lang.*;

public class TwoDimArray {


    public static void main(java.lang.String args[]) {

        //Rectangular Matrix
        int[][] matrix = {{1,2,3,4}, {5,6,7,8}, {9,10,11,12}};
        printMatrix(matrix);

        //Transpose Rectangular Matrix
        int[][] transposed = transposeMatrix(matrix);
        System.out.println("Transposed Matrix : ");
        printMatrix(transposed);

        //Square Matrix
        int[][] squareMatrix = {{1,2,3}, {4,5,6}, {7,8,9}};
        printMatrix(squareMatrix);

        //Transpose Square Matrix in place
        inplaceSquareTransposeMatrix(squareMatrix);
        System.out.println("Transposed Square Matrix : ");
        printMatrix(squareMatrix);

    }

    //Transpose a m*n matrix
    public static int[][] transposeMatrix(int[][] matrix) {
        int rowCount = matrix.length;
        int colCount = matrix[0].length;

        //rowcount and colcount are interchanged in transposed matrix
        int[][] transposed = new int[colCount][rowCount];

        //Go through each row
        for (int i = 0; i < rowCount ; i++) {
            //Go through each column
            for (int j = 0; j < colCount; j++) {
                //Transpose col and row
                transposed[j][i] = matrix[i][j];
            }
        }
        return transposed;
    }


    public static int[][] inplaceSquareTransposeMatrix(int[][] matrix) {
        //Go through each row
        for (int i = 0; i < matrix.length ; i++) {

            // Start col count as i + 1 since we are swapping
            for (int j = i+1; j < matrix.length; j++) {
                //Swap values to avoid picking overwritten value in next iteration
                int temp = matrix [j][i];
                matrix[j][i] = matrix[i][j];
                matrix[i][j] = temp;
            }
        }
        return matrix;


    }

    public static void printMatrix(int[][] matrix) {

        int rowCount = matrix.length;
        //In java , each row is an array.
        int colCount = matrix[0].length;

        System.out.println("Total Row = " + rowCount + " Total Col =" + colCount);

        for (int i = 0; i < rowCount; i++) {
            for (int j = 0; j < colCount; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}

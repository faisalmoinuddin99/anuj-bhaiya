import java.util.*;

public class Main {
    public static void main(String[] args) {
        /*
            Transpose of a Matrix
         */
        int[] a = {1, 2, 3};
        int[] b = {4, 5, 6};
        int[] c = {7, 8, 9};

        int[][] matrix = {a, b, c};

        int row = matrix.length;
        int col = matrix[0].length;

        for (int i = 0; i < row; i++) {
            // inner for loop with runs till diagonal of a matrix
            for (int j = 0; j <= i; j++) {
                swap(matrix, i, j);
            }
        }
        for (int i = 0; i < row; i++) {
            System.out.print("[ ");
            for (int j = 0; j < col; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.print("]");
            System.out.println();
        }
    }

    public static void swap(int[][] x, int i, int j) {
        int temp;
        temp = x[i][j];
        x[i][j] = x[j][i];
        x[j][i] = temp;
    }
}

/*
INPUT:
{1, 2, 3}
{4, 5, 6}
{7, 8, 9}
OUTPUT:
[ 1 4 7 ]
[ 2 5 8 ]
[ 3 6 9 ]
 */
import java.util.*;

public class Main {
    public static void main(String[] args) {
        /* Best Time to Buy and Sell Stock */
        int[] a = {6, 5, 4};
        int[] b = {1, 2, 5};
        int[] c = {7, 9, 7};

        int[][] matrix = {a, b, c};

        int row = matrix.length;
        int col = matrix[0].length;

        // row : 3, col: 3

        int upperSum = 0;
        int lowerSum = 0;
        for (int i = 0; i < row; i++) {
            System.out.print("[ ");
            for (int j = i; j < col; j++) {
                System.out.print(matrix[i][j] + " ");
                upperSum += matrix[i][j];

            }
            System.out.print("]");
            System.out.println();
        }
        System.out.println();
        for (int i = 0; i < row; i++) {
            System.out.print("[ ");
            for (int j = 0; j <= i; j++) {
                System.out.print(matrix[i][j] + " ");
                lowerSum += matrix[i][j];
            }
            System.out.print("]");
            System.out.println();
        }

        System.out.println("UpperSum: " + upperSum);
        System.out.println("LowerSum: " + lowerSum);
    }


}
/*
[ 6 5 4 ]
[ 2 5 ]
[ 7 ]

[ 6 ]
[ 1 2 ]
[ 7 9 7 ]
UpperSum: 29
LowerSum: 32
 */


import java.util.*;

public class Main {
    public static void main(String[] args) {
        /*
            Transpose of a Matrix
         */
        int[] a = {1,3,5,7};
        int[] b = {10,11,16,20};
        int[] c = {23,30,34,50};


        int[][] matrix = {a, b, c};

        int row = matrix.length;
        int col = matrix[0].length;
        int target = 34 ;

        int i = 0 ;
        int j = col - 1 ;

        while (i < row && j>= 0){
            if (matrix[i][j] == target){
                System.out.println("found at index " + i + " " + j);
            }
            if (matrix[i][j] > target){
                // move j towards left
                j-- ;
            }else {
                // move to below row
                i++ ;
            }
        }
    }
}

/*
found at index 2 2
 */
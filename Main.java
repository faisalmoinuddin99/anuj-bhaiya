import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        int[] interval1 = {0, 1, 2, 0};
        int[] interval2 = {3, 4, 5, 2};
        int[] interval3 = {1, 3, 1, 5};
//        int[] interval4 = {0,0,0,1};

        int[][] matrix = {interval1, interval2, interval3};


        int rows = matrix.length;
        int col = matrix[0].length;
        // Optimal approach with constant space... improved version of better solution

        boolean firstCol = false ;
        for (int i = 0 ; i < rows; i++){
            if (matrix[i][0] == 0) firstCol = true ;
            for (int j = 1; j < col; j++){
                if (matrix[i][j] == 0){
                    matrix[i][0] = 0 ;
                    matrix[0][j] = 0 ;
                }
            }
        }

        // fill-up the 0 in backward direction
            for (int i = rows - 1 ; i>= 0 ; i--){
                for (int j = col - 1; j >= 1; j-- ){
                    if (matrix[i][0] == 0 || matrix[0][j] == 0){
                        matrix[i][j] = 0 ;
                    }
                }
                if (firstCol){
                    matrix[i][0] = 0 ;
                }
            }
            for (int i[] : matrix){
                for (int j: i){
                    System.out.print(j + " ");
                }
                System.out.println();
            }
    }
}

/*
0 0 0 0
0 4 5 0
0 3 1 0
 */
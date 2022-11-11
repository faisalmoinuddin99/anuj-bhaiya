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
        int target = 13 ;
        boolean ans = false ;
        for (int i = 0 ; i < row; i++){
            for (int j = 0; j < col; j++){
                if (matrix[i][j] == target){
                    ans = true ;
                    break ;
                }
            }
        }
        System.out.println(ans);
    }
}

/*
false
 */
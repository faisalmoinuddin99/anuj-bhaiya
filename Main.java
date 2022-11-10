import java.util.*;

public class Main {
    public static void main(String[] args) {
        /* snakePattern */
        int[] a = {45,48,54};
        int[] b = {21, 89, 87};
        int[] c = {70, 78, 15};

        int[][] matrix = {a, b, c};

        int row = matrix.length;
        int col = matrix[0].length;
        int cnt = 0 ;
       for(int i = 0 ; i < row; i++){

               if (cnt != 0){
                   System.out.print("[");
                   for(int j = col - 1; j >= 0; j--){
                       System.out.print(matrix[i][j] + " ");
                       cnt-- ;
                   }
                   System.out.print("]");
                   System.out.println();
               }else{
                   System.out.print("[");
                   for(int j = 0; j < col; j++){
                       System.out.print(matrix[i][j] + " ");
                       cnt++ ;
                   }
                   System.out.print("]");
                   System.out.println();
               }

       }

    }
}
/*
[45 48 54 ]
[87 89 21 ]
[70 78 15 ]
 */
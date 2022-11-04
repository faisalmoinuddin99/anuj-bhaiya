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

        boolean dummyRows[] = new boolean[rows];
        boolean dummyCols[] = new boolean[col];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < col; j++) {
                if (matrix[i][j] == 0) {
                    dummyRows[i] = true;
                    dummyCols[j] = true;
                }
            }
        }

        // trace backword
        for (int i = rows - 1; i >= 0; i--) {
            for (int j = col - 1; j >= 0; j--) {
                if (dummyRows[i] || dummyCols[j]) {
                    matrix[i][j] = 0;
                }
            }

        }
        for (int i[] : matrix){
            for (int j : i){
                System.out.print(j+ " ");
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
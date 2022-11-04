import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        int[] interval1 = {0,1,2,0};
        int[] interval2 = {3,4,5,2};
        int[] interval3 = {1,3,1,5};

        int[][] intervals = {interval1, interval2, interval3};


        int rows = intervals.length;
        int col = intervals[0].length;


        for (int i = 0 ; i < rows; i++){
            for (int j =0 ; j < col; j++){
                if (intervals[i][j] == 0){
                    // set -1
                    for (int k = 0; k < rows; k++){
                        if (intervals[k][j] != 0){
                            intervals[k][j] =  -1;
                        }

                    }
                    for (int k = 0 ; k < col; k++){
                            if (intervals[i][k] != 0){
                                intervals[i][k] = -1 ;
                            }


                    }
                }
            }
        }
        // replace -1 to 0
        for (int i = 0; i < rows; i++){
            for (int j = 0; j < col; j++){
                if (intervals[i][j] == -1){
                    // set back to 0
                    intervals[i][j] = 0 ;
                }
            }
        }
    }
}

/*
0 0 0 0
0 4 5 0
0 3 1 0
 */
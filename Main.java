import java.util.*;

import static java.util.Arrays.stream;

public class Main {
    public static void main(String[] args) {
        // 2D-Array

        Scanner sc = new Scanner(System.in) ;
        int row = sc.nextInt() ;
        int col = sc.nextInt() ;

        // declaration
        int [][] matrix1 = new int[row][col] ;

        // control rows
        for(int i = 0 ; i<row; i++){
            // control col
            for(int j = 0 ; j < col; j++){
                matrix1[i][j] = sc.nextInt();
            }
        }

        // output

        for(int i = 0 ; i < row; i++){

            for(int j = 0 ; j < col ; j++){
                System.out.print(matrix1[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("which number you want to search: ");
        int searchElement = sc.nextInt() ;
        boolean flag = false ;
        for (int i = 0 ; i < row; i++){
            for(int j = 0 ; j < col; j++){
                if(matrix1[i][j] == searchElement){
                    flag = true ;
                    System.out.println("("+i+","+j+")");
                }
            }
        }
        if (flag == false){
            System.out.println("element not found");
        }
    }
}

/*
CASE1:
2
3
1 2 3
3 2 1
1 2 3
3 2 1
which number you want to search:
6
element not found

CASE2:
2
3
1 2 3
3 2 1
1 2 3
3 2 1
which number you want to search:
1
(0,0)
(1,2)
 */
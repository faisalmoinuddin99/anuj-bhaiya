import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
      // pascal triangle question 1
       trianglePattern(5);


        // question 2
        int pascalValue = findPascalValue(5,3) ;
        System.out.println(pascalValue);

        // question 3
        /*
        Given nth term print all the possible value of pascal
         */
        printAllPossiblePascalValue(5);
    }

    public static void trianglePattern(int line){
        int i, j, r;
        boolean k = true ;

        for (i = 1; i <= line; i++){
            r = 0 ;
            for (j = 1; j <= 2 * line -1; j++){
                if (j>=line+1-i && j <= line-1+i && k){
                    System.out.printf("%2d",combination(i - 1, r));
                    r++ ;
                    k = false ;
                }else{
                    System.out.print("  ");
                    k = true ;
                }
            }
            System.out.println();
        }

    }
    public static int factorial(int n){
        if (n ==  0){
            return 1 ;
        }
        return n * factorial(n-1) ;
    }
    public static int combination(int n, int r){
//        nCr = n! / (n - r) ! * r!

        return (factorial(n) / (factorial( n - r) * factorial(r))) ;
    }


    public static int findPascalValue(int row, int col){
        int n = row - 1 ;
        int r = col - 1 ;
        return (factorial(n) / (factorial( n - r) * factorial(r)) );
    }

    public static void printAllPossiblePascalValue(int n){
        int r = 0 ;
        for (int i = 1; i <= n; i++){
            System.out.print(combination(n-1,r) + " ");
            r++ ;
        }
    }
}

/*
         1
       1   1
     1   2   1
   1   3   3   1
 1   4   6   4   1

question2: 6
question3: 1 4 6 4 1
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
      // pascal triangle
       trianglePattern(5);



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

}

/*
         1
       1   1
     1   2   1
   1   3   3   1
 1   4   6   4   1
 */
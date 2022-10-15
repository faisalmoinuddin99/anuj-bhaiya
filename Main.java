import java.util.HashSet;
import java.util.Set;

import static java.util.Arrays.stream;

public class Main {
    public static void main(String[] args) {
    // Mathmatics algorithm

        /*
        Factorial Trailing Zeros
         */

       int n = 100 ;
       int result = 0 ;
       for(int i = 5; i <= n; i = i * 5){
           result += n / i ;
       }
        System.out.println(result);
    }
}

/*
OUTPUT: 24
 */
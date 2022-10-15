import java.util.HashSet;
import java.util.Set;

import static java.util.Arrays.stream;

public class Main {
    public static void main(String[] args) {
    // Mathmatics algorithm

        /*
        Factorial
         */

        int n = 5 ;
        int fact = 1 ;
        while(n != 0){
            fact = fact * n ;
            n = n - 1 ;
        }
        System.out.println(fact);
    }
}
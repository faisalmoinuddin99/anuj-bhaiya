import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import static java.util.Arrays.stream;

public class Main {
    public static void main(String[] args) {
        /*
            Important Properties:
            Playing with rightmost set bits of a number
         */

       // 1.  Check if a positive integer is a power of 2 without using any branching or loop.
        int n = 31 ;
        boolean ans = isPowerOf2(n) ;
        if(ans){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
    public static boolean isPowerOf2(int n){
        return (n != 0) && (n &(n-1)) == 0 ;
    }
}

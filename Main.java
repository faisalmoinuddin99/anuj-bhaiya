import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import static java.util.Arrays.stream;

public class Main {
    public static void main(String[] args) {
     /*
     Given n, print the xor of all no b/w 1 to n

     i/p: n = 5

     1 ^ 2 ^ 3 ^ 4 ^ 5
      */

        // Naive approach
        int n = 100 ;
        int xor = 0 ;
        for(int i = 1; i <= n; i++){
            xor = xor ^ i ;
        }
        System.out.println(xor); // TC: O(n)

        int ans = findXor(n) ;
        System.out.println(ans); // TC: O(1)


    }
    // using bit manipulation approach
    public static int findXor(int n){

        int mod = n % 4 ;

        if(mod == 0){
            return n ;
        }
        else if(mod == 1){
            return 1 ;
        }
        else if(mod == 2){
            return  n + 1 ;
        }
        else if(mod == 3){
            return 0 ;
        }
        return 1 ;
    }
}

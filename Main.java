import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import static java.util.Arrays.stream;

public class Main {
    public static void main(String[] args) {
     /*
        Given a range (L-R) print all the xor b/w the range L to R

        i/p: L = 2, R = 4
        2 ^ 3 ^ 4 = 5
      */
        int l = 7, r = 5 ;
        int ans = findXor(l,r) ;
        System.out.println(ans); // TC: O(1)
    }
    public static int findXor(int l, int r) {
        return (findXor(l-1) ^ findXor(r)) ;
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

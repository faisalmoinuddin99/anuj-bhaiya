import java.util.*;

import static java.util.Arrays.stream;

public class Main {
    public static void main(String[] args) {
        /* Binary Exponentiation
        Time complexity - O(log(b))
         */

        int approach1 = powerItr(5,2) ;
        System.out.println(approach1);

        int approach2 = powerRec(5,2) ;
        System.out.println(approach2);

    }
    // iterative approach
    public static int powerItr(int a, int n){
        int ans = 1 ;
        while(n > 0){
            if((n & 1) == 1){
                ans = ans * a ;
            }
            n = n >> 1 ;
            a = a * a;
        }
        return ans ;
    }

    // recursive approach
    public static int powerRec(int a, int n){
        if(n == 0){
            return 1 ;
        }
        int x = powerRec(a, n / 2);
        if(n % 2 == 0){
            return x * x ;
        }else{
            return a * x * x ;
        }
    }
}

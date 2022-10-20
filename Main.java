import java.util.*;

import static java.util.Arrays.stream;

public class Main {
    public static void main(String[] args) {
/*


        Input: N = 4
        Output: 5
        Explanation:
        For numbers from 1 to 4.
        For 1: 0 0 1 = 1 set bits
        For 2: 0 1 0 = 1 set bits
        For 3: 0 1 1 = 2 set bits
        For 4: 1 0 0 = 1 set bits
        Therefore, the total set bits is 5.

 */


       int ans = countNoOfSetBits(17) ;
        System.out.println(ans);

    }

    public static int countNoOfSetBits(int n) {
        if(n == 0){
            return 0;
        }

        int x = largestPowerOf2InRange(n) ;
        int noOfOnesBeforeLargestPowerOf2 = x * (1 << (x - 1)) ;
        int noOfOnesAfterLargestPowerOf2 = (n - (1 << x) + 1) ;
        int rest = (n - (1<<x)) ;

        int ans = noOfOnesBeforeLargestPowerOf2 + noOfOnesAfterLargestPowerOf2 + countNoOfSetBits(rest) ;

        return ans ;

    }

    public static int largestPowerOf2InRange(int n) {
        int x = 0 ;
        while ((1<<x) <= n){
            x++ ;
        }
        return x - 1;
    }

}
/*
35
 */

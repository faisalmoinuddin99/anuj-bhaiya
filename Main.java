import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import static java.util.Arrays.stream;

public class Main {
    public static void main(String[] args) {
        /*
         LeetCode: Power of Two

            Input: n = 1
            Output: true
            Explanation: 20 = 1

            Input: n = 16
            Output: true
            Explanation: 24 = 16

            Input: n = 3
            Output: false
         */

        int n = -2147483648 ;
        if(isPowerOfTwo(n)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }

    }


    public static boolean isPowerOfTwo(int n) {
        return (n > 0) && (n & (n-1)) == 0 ;
    }
}

/*


 */
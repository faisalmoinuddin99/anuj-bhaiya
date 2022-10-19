import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import static java.util.Arrays.stream;

public class Main {
    public static void main(String[] args) {
        /*
            Important Properties:
            Round up to the next highest power of 2

            Input:  n = 20
            Output: 32

            Input:  n = 16
            Output: 16
         */


        int n = 127 ;
        int nextPowerOf2 = findNextPowerOf2(n) ;
        System.out.println(nextPowerOf2);
    }
    public static int findNextPowerOf2(int n){
        n = n - 1;
        while((n & (n - 1)) != 0){
            n = n & n - 1;
        }
        return n << 1 ;
    }


}

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

        // Brian Kernighan’s Algorithm to count set bits in an integer
        int n = -1 ;
        int cnt = 0 ;

        while (n != 0){

            n = n & n-1 ;
            cnt++;
        }
        System.out.println(cnt); // 32
    }
}

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

        // 2.  Find the position of the rightmost set bit
        int n = 20 ;
        int cnt = 0 ;

        while(n != 0) {
            if((n & 1) == 1){
                break ;
            }
            n = n >> 1 ;
            cnt++ ;
        }
        System.out.println(cnt);
    }
}

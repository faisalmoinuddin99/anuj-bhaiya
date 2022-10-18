import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import static java.util.Arrays.stream;

public class Main {
    public static void main(String[] args) {
        /*
            Important Properties:
         */

        // 1. Turn off the kth bit of a number
      int n = 13 ;
      int kthBit = 3 ;
      int mask = ~ (1<< (kthBit - 1 ) ) ;
      int ans = n & mask ;
        System.out.println(ans);
    }
}

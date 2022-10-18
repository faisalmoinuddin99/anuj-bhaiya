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
      int n = 20 ;
      int kthBit = 4 ;
      int maskForTurnOff = ~ (1<< (kthBit - 1 ) ) ;
      int p1 = n & maskForTurnOff ;
        System.out.println(p1);

        // 2. Turn on the kth bit of a number

        int maskForTurnOn = 1<< (kthBit - 1) ;
        int p2 = n | maskForTurnOn ;
        System.out.println(p2);


    }
}

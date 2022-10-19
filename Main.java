import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import static java.util.Arrays.stream;

public class Main {
    public static void main(String[] args) {
        /*
            Important Properties:
         Part 6 (Find the total number of bits needed to be flipped)
         */
        int ans = minBitFlips(65,80) ;
        System.out.println(ans);

    }

    public static int minBitFlips(int start, int goal) {

        int XOR = start ^ goal ;

      // using Brain Keringhan Algorithm
        int cnt = 0 ;
        while (XOR != 0) {

            XOR = XOR & (XOR - 1) ;
            cnt++ ;
        }
        return cnt ;
    }
}

/*


 */
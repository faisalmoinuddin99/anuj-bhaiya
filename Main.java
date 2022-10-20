import java.util.*;

import static java.util.Arrays.stream;

public class Main {
    public static void main(String[] args) {

        /*

        Input: A = 10, B = 20
        Output: 4
        Explanation:
        A  = 01010
        B  = 10100
        As we can see, the bits of A that need
        to be flipped are 01010. If we flip
        these bits, we get 10100, which is B.

         */

        int A = 20, B = 25   ;
        int xor = A ^ B ;

        // Brains Algorithm
        int cntDifferBits = 0 ;
        while(xor != 0){
            xor = xor & (xor - 1) ;
            cntDifferBits++ ;
        }

        System.out.println(cntDifferBits);



    }
}


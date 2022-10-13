import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

    /*
    Bit manipulation: reverse bit
     */

        long n = 3 ;
        long result = 0 ;
        for(int i = 1 ; i <= 32 ; i++){
            long lsb = n & 1 ;
            long reveserLSB = lsb << (32 - i) ;
            result =  result | reveserLSB ;
            n = n >> 1 ;
        }
        System.out.println(result);

    }

}

/*
OUTPUT: 3221225472
TN: O(n)
SC: O(1)
 */
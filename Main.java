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

        // 3.  Computing parity of a number -> Parity means no. of set bits
        int n = 15 ;
        int cnt = 0 ;

        while (n != 0){

            n = n & n-1 ;
            cnt++;
        }
        System.out.println(cnt);
    }
}

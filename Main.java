import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import static java.util.Arrays.stream;

public class Main {
    public static void main(String[] args) {
        int n = 198 ;
        long result = reverse(n) ;
        System.out.println(result);
    }
    public static long reverse(int n){
        int lastDigit = 0 ;
        boolean isNegative = n < 0 ;
        long  ans = 0;
        n = Math.abs(n) ;
        while(n != 0){
            lastDigit = n % 10 ;
            ans = ans * 10 + lastDigit ;
            n = n / 10 ;
        }
        if (ans > Integer.MAX_VALUE) return 0 ;
        if (isNegative) return -(int) ans ;

        return (int) ans ;
    }
}
/*
OUTPUT: -891
 */
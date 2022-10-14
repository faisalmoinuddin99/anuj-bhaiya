import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

    /*
    Bit manipulation: Divide Integer without using mul, div, mod operator
     */

    }

    public static long divide(long dividend, long divisor){
        long sign = ((dividend < 0) ^ (divisor < 0)) ? -1 : 1 ;

        // remove the sign of the operand
        dividend = Math.abs(dividend) ;
        divisor = Math.abs(divisor) ;

        // initialize the quotient
        long q = 0, temp = 0 ;
        for(int i = 31 ; i >= 0 ; i--){
            if(temp + (divisor << i) <= dividend){
                temp = temp + divisor << i ;
                q |= 1L << i;
            }
        }
        if(sign == -1){
            q =-q ;
        }
        return q ;
    }
}

/*
OUTPUT: 5

 */
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

        // 1. check if ith bit is set or not
       int n = 6 ;
       int i = 1 ;

       if((n & (1<<i)) != 0){
           System.out.println("bit is set");
       }else{
           System.out.println("bit is not set");
       }

       // detect two integer have opposite signs or not

        int x = -4 ;
       int y = 8 ;

       boolean isOppositeSign = (x ^ y) < 0 ;
       if(isOppositeSign){
           System.out.println("signs are differ");
       }else{
           System.out.println("both are positive");
       }


    }
}

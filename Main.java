import java.util.*;

import static java.util.Arrays.stream;

public class Main {
    public static void main(String[] args) {
        /*
            Find position of set bit
         */
        int ans = findPosition(1) ;
        System.out.println(ans);
    }

   public static int findPosition(int N) {
        // code here
       int cnt = 0 ;
       if (!isPowerOf2(N)){
           return -1 ;
       }else{
           while(N != 0){
               if((N & 1) == 1){
                   break ;
               }
               cnt++ ;
               N = N >> 1 ;
           }
       }
       return cnt + 1;
    }
    public static boolean isPowerOf2(int n){
        return n > 0 && (n & (n-1)) == 0 ;
    }
}

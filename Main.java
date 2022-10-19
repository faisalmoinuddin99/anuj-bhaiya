import java.util.*;

import static java.util.Arrays.stream;

public class Main {
    public static void main(String[] args) {
        /*
         LeetCode: Counting Bits

        Input: n = 2
        Output: [0,1,1]
        Explanation:
        0 --> 0
        1 --> 1
        2 --> 10

        Input: n = 5
        Output: [0,1,1,2,1,2]
        Explanation:
        0 --> 0
        1 --> 1
        2 --> 10
        3 --> 11
        4 --> 100
        5 --> 101

         */
        int a[] = countBits(2) ;
        for(int x : a){
            System.out.print(x + " ");
        }
    }

    public static  int[] countBits(int n) {
//        List<Integer> list = new ArrayList<>() ;
        int a[] = new int[n+1] ;
        for(int i = 0 ; i <= n; i++){
                a[i]  = i ;
                int cnt = 0 ;
                while (a[i] != 0){
                    a[i] = a[i] & a[i] - 1 ;
                    cnt++ ;
                }
            a[i] = cnt ;

        }
        return a ;
//        return list.stream().mapToInt(i->i).toArray() ;
    }

}

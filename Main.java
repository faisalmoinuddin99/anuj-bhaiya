import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
       /*
       Bit manipulation:
       2. find the two non-repeating element in an array
       where every element repeats twice
        */

        // approach 1:
        int a[] = {2, 4, 7, 9, 2, 4} ;

        int result = 0 ;
        for(int i=0; i<a.length ; i++){
            result = result ^ a[i] ;
        }
        // find right most set bit
        result = (result & -result) ;
        System.out.println(result);

        int sum1 = 0 ;
        int sum2 = 0 ;
        for (int i = 0; i< a.length; i++){
            if((a[i]&result)>0){
                sum1 = sum1 ^ a[i] ;
            }else {
                sum2 = sum2 ^ a[i] ;
            }
        }
        System.out.println(sum1 + " " + sum2);

    }
}

/*
OUTPUT: [7,9]
TN: O(n)
SC: O(1)
 */
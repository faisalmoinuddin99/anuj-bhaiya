import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
       /*
       Bit manipulation:
       1. find the only non-repeating element in an array
       where every element repeats twice
        */

        // approach 2:
        int a[] = {5,4,1,4,3,5,1} ;
        int result = 0 ;

       for(int i = 0 ; i < a.length; i++){
           result = result ^ a[i] ;
       }
        System.out.println(result);

    }
}

/*
OUTPUT: 3
TN: O(n)
SC: O(1)
 */
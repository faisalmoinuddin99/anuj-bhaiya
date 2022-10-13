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

      int n = 14 ;
      int count = 0 ;

      while (n != 0 ){
          count++ ;
          n = (n & (n-1)) ;
      }
        System.out.println(count);

    }
}

/*
OUTPUT: [7,9]
TN: O(n)
SC: O(1)
 */
import java.util.HashSet;
import java.util.Set;

import static java.util.Arrays.stream;

public class Main {
    public static void main(String[] args) {
    // Mathmatics algorithm

        /*
        Palindrom Number
         */

      int n = 125 ;
      int lastDigit = 0;
      int reverse = 0 ;
        int temp = n ;
      while(n != 0){
          lastDigit = n % 10 ;
          reverse = reverse * 10 + lastDigit ;
          n = n / 10 ;
      }
      if(temp == reverse){
          System.out.println("Palindrom");
      }else {
          System.out.println("Not a Palindrom");
      }

    }
}

/*
OUTPUT: 24
 */
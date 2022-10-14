import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

    /*
    Bit manipulation: Divide Integer without using mul, div, mod operator
     */

       int divisor = 8 ;
       int dividend = 43 ;

       int count = 0 ;
       while(dividend >= divisor){
           dividend = dividend - divisor ;
           count++ ;
       }
        System.out.println(count);

    }

}

/*
OUTPUT: 5

 */
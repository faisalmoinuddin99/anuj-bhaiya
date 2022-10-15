import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import static java.util.Arrays.stream;

public class Main {
    public static void main(String[] args) {
        // Mathematics algorithm

        /*
            sieve of eratosthenes: Is used to find prime no from 2 to n
         */
        int n = 50 ;
        boolean result [] = sieveOfEratosthenes(n) ;
        for(int i = 0; i < n ;i++){
           if(result[i]){
               System.out.print(i + " ");
           }
        }

    }
    public static boolean[] sieveOfEratosthenes(int n){
        boolean isPrime[] = new boolean[n+1] ;
        Arrays.fill(isPrime, true);
        isPrime[0] = false ;
        isPrime[1] = false ;
        for(int i = 2; i*i <= n ; i++){

            for(int j = 2 * i; j <= n ; j += i){
//                System.out.print(j + " ");
                isPrime[j] = false ;
            }
        }
        return isPrime ;
    }
}

/*
OUTPUT: Prime no from 2 to 50 : 2 3 5 7 11 13 17 19 23 29 31 37 41 43 47
 */
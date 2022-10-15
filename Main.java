import java.util.HashSet;
import java.util.Set;

import static java.util.Arrays.stream;

public class Main {
    public static void main(String[] args) {
        int[] a = {1,2,5,4,7,8,11,20};
        /*
        Problem statement: sort the number by even odd
        o/p: {2,4,8,20,1,5,7,11}
         */
        sortByEvenOdd(a);
    }
    public static void sortByEvenOdd(int[] a){

        int myArr[] = new int[a.length] ;
        int index = 0 ;
        // even
        for(int i = 0 ; i < a.length; i++){
            if((a[i] & 1) == 0){
                myArr[index] = a[i] ;
                index++ ;
            }

        }
        // odd
        for(int i = 0; i < a.length; i++){
            if ((a[i]& 1) != 0){
                myArr[index] = a[i];
                index++ ;
            }
        }

        for (int i : myArr){
            System.out.print(i + " ");
        }



    }
}
/*
OUTPUT: 2 4 8 20 1 5 7 11
 */
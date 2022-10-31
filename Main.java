import java.util.*;


public class Main {
    public static void main(String[] args) {

        int a[] = {0, 1, 1, 0, 2, 1, 2, 0, 0, 0, 1};
        dutchNationalFlag(a);
    }
    public static void dutchNationalFlag(int[] a){

        int low = 0 ;
        int mid = 0 ;
        int high = a.length - 1 ;
        int temp ;
        while (mid <= high){
            switch (a[mid]){
                case 0: {
                  a[low] = a[low] ^ a[mid] ;
                  a[mid] = a[low] ^ a[mid] ;
                  a[low] = a[low] ^ a[mid] ;
                  low++ ;
                  mid++ ;
                  break ;
                }
                case 1: {
                    mid++ ;
                    break;
                }
                case 2: {
                    a[mid] = a[mid] ^ a[high] ;
                    a[high] = a[mid] ^ a[high] ;
                    a[mid] = a[mid] ^ a[high] ;
                    high-- ;
                    break ;
                }
            }
        }
        for (int i: a){
            System.out.print(i + " ");
        }

    }

}
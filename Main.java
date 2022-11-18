import java.util.*;

import static java.util.Arrays.stream;

public class Main {
    public static void main(String[] args) {
     
     int a[] = {1,2,3,4,5,6,7,8,9,10,12,14,34,78} ;

    int res = findTheElementInInfiniteSortedArray(a,9) ;
    System.out.println(res) ;

    }
    public static int findTheElementInInfiniteSortedArray(int []a, int key){
        int start = 0 ;
        int end = 1 ;

        while(key > a[end]){
            start = end ;
            end = end * 2 ;
        }
       int ans = binarySearchImpl(a,start,end, key) ;

       return ans ;
    }   

    public static int binarySearchImpl(int[] a, int start, int end ,int key){
        while(start <= end){
            int mid = start + (end - start) / 2 ;
            if(a[mid] == key){
                return mid ;
            }
            else if(a[mid] > key){
                end = mid - 1 ;
            }else {
                start = mid + 1 ;
            }
        }
        return -1 ;
    } 
}

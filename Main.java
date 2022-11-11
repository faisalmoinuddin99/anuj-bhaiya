import java.util.*;

public class Main {
    public static void main(String[] args) {

        // Binary search Algorithm
        int a[] = {4,5,6,10,11} ;
        int ans = binarySearch(a,5) ;
        System.out.println(ans);
    }

    public static int binarySearch(int[] a, int target){
        int start = 0 ;
        int end = a.length - 1;
        int mid = 0 ;
        while (start <= end){
             mid = start + ((end - start) / 2);

            if (a[mid] == target){
                return mid ;
            }
            if (target < a[mid]){
                end = mid - 1 ;
            }else {
                start = mid + 1 ;
            }
        }
        return -1 ;
    }
}
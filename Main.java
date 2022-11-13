import java.util.*;

public class Main {
    public static void main(String[] args) {

        // Binary search Algorithm
        int a[] = {11,10,6,5,4} ;
        int ans = binarySearchForDescendingOrder(a,5) ;
        System.out.println(ans);
    }

    public static int binarySearchForAscendingOrder(int[] a, int target){
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
    public static int binarySearchForDescendingOrder(int[] a, int target){
        int start = 0 ;
        int end = a.length - 1 ;
        int mid = 0 ;
        while (start <= end){
            mid = start + ((end - start) / 2);
            if (a[mid] == target){
                return mid ;
            }
            if (a[mid] < target) {
                end = mid - 1 ;
            }else {
                start = mid + 1 ;
            }
        }
        return -1 ;
    }
}
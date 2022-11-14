import java.util.*;

public class Main {


    public static void main(String[] args) {

        // Find Minimum in Rotated Sorted Array
        int[] a = {4,5,6,7,0,1,2};
        int ans = findMin(a, 0) ;
        System.out.println(ans);
    }

    public static int findMin(int[] a, int target) {
        int start = 0 ;
        int end = a.length - 1;
        while (start <= end) {
            int mid = (start + end) >> 1 ;
            if (a[mid] == target){
                return mid ;
            }
            // left part is sorted
            if (a[start] <= a[mid]){
                // now check the position of target
                if(target >= a[start] && target <= a[mid]){
                    end = mid - 1 ;
                }else {
                    start = mid + 1 ;
                }
            }else {
                if (target >= a[mid] && target <= a[end]){
                    start = mid + 1 ;
                }else  {
                    end = mid - 1 ;
                }
            }
        }
        return  -1 ;
    }
}
import java.util.ArrayList;
import java.util.List;

public class Main {


    public static void main(String[] args) {
        // Searching in a Nearly Sorted Array
        int a[] = {5,10,30,20,40} ;
        int ans = modifiedBinarySearch(a,30) ;
        System.out.println(ans);
    }

    public static int modifiedBinarySearch(int[] a, int x){
        int start = 0 ;
        int end = a.length - 1 ;

        while (start <= end){
            int mid = start + (end - start) / 2 ;
            if (x == a[mid]){
                return mid ;
            }
            if (mid - 1 >= start && a[mid - 1] == x){
                return mid - 1;
            }
            if (mid + 1 <= end && a[mid + 1 ] == x){
                return  mid + 1 ;
            }
            else if(a[mid] <= x){
                start = mid + 2 ;
            }else {
                end = mid - 2 ;
            }
        }
        return -1 ;
    }
}
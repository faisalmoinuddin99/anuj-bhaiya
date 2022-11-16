import java.util.ArrayList;
import java.util.List;

public class Main {


    public static void main(String[] args) {
        // find the floor of an element in a sorted array
        int a[] = {1,2,3,4,8,10,10,12} ;
        int ans1 = floorOfAnElementInASortedArray(a,5) ;
        int ans2 = ceilOfAnElementInASortedArray(a,5) ;
        System.out.println("Floor: " + ans1 + " Ceil: " + ans2);
    }

    public static int floorOfAnElementInASortedArray(int [] a, int target){
        int start = 0 ;
        int end = a.length - 1 ;
        int resFloor = -1 ;
        while (start <= end){
            int mid = start + (end - start) / 2 ;

            if (a[mid] == target){
                return mid ;
            }
            else if(a[mid] <= target){
                resFloor = a[mid] ;
                start = mid + 1 ;
            }else {
                end = mid - 1 ;
            }
        }
        return resFloor ;
    }
    public static int ceilOfAnElementInASortedArray(int [] a, int target){
        int start = 0 ;
        int end = a.length - 1 ;

        int ceilRes = -1 ;
        while (start <= end){
            int mid = start + (end - start) / 2 ;

            if (a[mid] == target){
                return mid ;
            }
            else if(a[mid] > target){
                ceilRes = a[mid] ;
                end = mid - 1 ;
            }else {
                start = mid + 1 ;
            }
        }
        return ceilRes ;
    }
}

/*
Floor: 4 Ceil: 8
 */
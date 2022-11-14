import java.util.*;

public class Main {
    public static void main(String[] args) {
        int[] a = {} ;
       int fs = bSFirstOccurance(a,0);
       int ls = lastOccurance(a,0) ;
       int [] result = firstAndLastOccurance(fs,ls) ;
       for (int i : result){
           System.out.print(i + " ");
       }
    }
    public static int bSFirstOccurance(int [] a, int target) {

        int start = 0;
        int end = a.length - 1;
        int mid = 0;
        int firstOccurance = -1 ;

        while (start <= end) {
            mid = start + ((end - start) / 2);
            if (a[mid] == target){
                firstOccurance = mid ;
                end = mid - 1 ;

            }
            else if(a[mid] > target){
                end = mid - 1 ;
            }else{
                start = mid + 1 ;
            }
        }

        return firstOccurance ;
    }
    public static int lastOccurance(int []a, int target){
        int start = 0 ;
        int end = a.length - 1;
        int lastOccurance = -1 ;
        while (start <= end){
            int mid = start + ((end - start) / 2) ;
            if (a[mid] == target){
                lastOccurance = mid ;
                start = mid + 1 ;
            }else if (a[mid] > target){
                end = mid - 1 ;
            }else {
                start = mid + 1 ;
            }
        }
        return lastOccurance ;
    }
    public static int[] firstAndLastOccurance(int fs,int ls){
        List<Integer> list = new ArrayList<>() ;
        list.add(fs) ;
        list.add(ls) ;

        return list.stream().mapToInt(i -> i).toArray() ;
    }
}
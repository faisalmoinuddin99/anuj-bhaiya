import java.util.*;

import static java.util.Arrays.stream;

public class Main {
    public static void main(String[] args) {
    /*
        arr[] = {1, 2, 3, 2, 1, 4}
        Output:
        3 4
        Explanation:
        3 and 4 occur exactly once.

     */
        int arr[] = {14,20,21,2,3,2,21,14};
        int res[] = singleNumber(arr);
      for (int x: res){
          System.out.println(x);
      }
      int ans = firstNonRepeating(arr) ;
//        System.out.println(ans);
    }

    public static int[] singleNumber(int[] nums) {
        // Code here
        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            result = result ^ nums[i];
        }

        // Now check the position of right most set bit / find the differ bit
        result = (result & (-result));
        ArrayList<Integer> a = new ArrayList<>() ;

        // split the array on basis of right most set bit / differ bits
        int xor1 = 0 ;
        int xor2 = 0 ;

        for (int i = 0; i < nums.length; i++){
            if ((nums[i] & result) > 0){
                xor1 = xor1 ^ nums[i] ;

            }else {
                xor2 = xor2 ^ nums[i] ;

            }
        }
        a.add(xor1) ;
        a.add(xor2) ;

        Collections.sort(a);


        return a.stream().mapToInt(i->i).toArray() ;
    }
    public static int firstNonRepeating(int[] a){
        int result = 0 ;
        for (int i = 0; i < a.length; i++){
            result = result ^ a[i] ;
        }
        return result ;
    }
}


import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int a[] = {-2,-3,4,-1,-2,1,5,-3} ;
//        int ans = approach1(a) ;
//        System.out.println(ans);

        int res = kadanesAlgorithm(a) ;
        System.out.println(res);

    }
    public static int approach1(int[] a){
        int n = a.length ;
        int max = Integer.MIN_VALUE  ;
        for (int i = 0 ; i < n; i++){
         int sum = 0 ;
          for (int j = i ; j < n; j++){
              sum += a[j] ;
              if (sum > max){
                  max = sum ;
              }
          }
        }
        return max ;
    }

    public static int kadanesAlgorithm(int[] a){
        int sum = 0 ;
        int max = a[0] ;
        for (int i = 0 ; i < a.length; i++){
            sum += a[i] ;
            // check sum is greater than max, if yes then update max
            if (sum > max) max = sum ;

            // now check sum is lesser than 0, if yes then update sum to 0
            if (sum < 0) sum = 0 ;

        }
        return max ;
    }
}
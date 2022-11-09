import java.util.*;

public class Main {
    public static void main(String[] args) {
        /* Best Time to Buy and Sell Stock */
        int[] a = {7,6,4,3,1};
        bruteForce(a);
    }

    public static void bruteForce(int[] a) {

        List<Integer> list = new ArrayList( );
        int difference = 0;
        int x = 0 ;
        int maxProfit = 0 ;
        for (int i = 0; i < a.length; i++) {

            for (int j = i + 1; j < a.length; j++) {
                if (a[i] < a[j]) {
                    difference = Math.abs(a[j] - a[i]) ;
                    list.add(difference) ;
                }
              if (!list.isEmpty()){
                  maxProfit = (int) Collections.max(list) ;
              }
            }

        }
        System.out.println(maxProfit);
    }

}
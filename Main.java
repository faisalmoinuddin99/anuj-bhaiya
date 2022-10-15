import java.util.HashSet;
import java.util.Set;

import static java.util.Arrays.stream;

public class Main {
    public static void main(String[] args) {

        int a[] = {4,4,4,2,2,2,1,3,3,3};


        int ans = 0 ;
        for(int i = 0; i < 31; i++){
            int sum = 0 ;
            for(int j = 0 ; j < a.length ;j++){
                if(((a[j] >> i) & 1 ) == 1) {
                    // n & 1 == 0 ? even : odd
                    sum++ ;
                }
                sum = sum % 3 ;
            }
            if(sum != 0){
                ans |= sum << i ; // ye bit set kr ne k liye hai
            }
        }
        System.out.println(ans);
    }
}
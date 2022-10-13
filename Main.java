import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
       /*
       Bit manipulation:
       1. find the only non-repeating element in an array
       where every element repeats twice
        */

        // approach 1:
        int a[] = {5,4,1,4,3,5,1} ;

        Set<Integer> s = new HashSet<>() ;
        for(int i = 0; i< a.length; i++){
            if(!s.contains(a[i])){
                s.add(a[i]) ;
            }else {
                s.remove(a[i]) ;
            }
        }
        System.out.println(s);
    }
}

/*
OUTPUT: 3
TN: O(n)
SC: O(n)
 */
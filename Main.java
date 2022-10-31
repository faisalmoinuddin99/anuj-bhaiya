import java.util.*;


public class Main {
    public static void main(String[] args) {

        int a[] = {0,1,1,0,2,1,2,0,0,0,1} ;

        Arrays.sort(a);
        for (int i : a){
            System.out.print(i + " ");
        }
    }
}
/*
Approach 1: Sorting method
TC: O(nlogn)
SC: O(1)

0 0 0 0 0 1 1 1 1 2 2
 */
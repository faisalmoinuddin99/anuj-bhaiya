import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Main {


    public static void main(String[] args) {
        // Next largest element
        int a[] = {4,5,2,10,8} ;
        List<Integer> ll = nearestSmallerElementToLeft(a,a.length) ;
        for (int i : ll){
            System.out.print(i + " "); // -1 4 -1 2 2 correct
        }
    }

    public static List<Integer> nearestSmallerElementToLeft(int[]a, int n){

        List<Integer> vector = new ArrayList<>() ;
        Stack<Integer> s = new Stack<>() ;

        for(int i = 0 ; i < n; i++){
            if (s.empty()){
                vector.add(-1) ;
            }
            else if (!s.empty() && a[i] > s.peek()){
                vector.add(s.peek()) ;
            }
           else if (!s.empty() && a[i] < s.peek()){
               while (!s.empty() && s.peek() >= a[i]){
                   s.pop() ;
               }
               if (s.empty()){
                   vector.add(-1) ;
               }else {
                   vector.add(s.peek()) ;
               }
            }
            s.push(a[i]) ;
        }

        return vector;
    }
}

/*
-1 -1 4 3
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Main {


    public static void main(String[] args) {
        // Next largest element
        int a[] = {1,3,4,2} ;
        List<Integer> ll = nextLargestElement(a,a.length) ;
        for (int i : ll){
            System.out.print(i + " ");
        }
    }

    public static List<Integer> nextLargestElement(int[]a, int n){

        List<Integer> list = new ArrayList<>() ;
        Stack<Integer> s = new Stack<>() ;

       for (int i = n - 1; i >= 0; i--){
           if (s.empty()){
               list.add(-1) ;
           }
            else if(!s.empty() && a[i] < s.peek()){
                list.add(s.peek()) ;
           }
            else if(!s.empty() && a[i] > s.peek()){
                while (s.size() > 0 && s.peek() <= a[i]){
                    s.pop() ;
                }
                if (s.isEmpty()){
                    list.add(-1) ;
                }else {
                    list.add(s.peek()) ;
                }
           }
           s.push(a[i]) ;
       }
        return list ;
    }
}

/*
-1 -1 4 3
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Main {


    public static void main(String[] args) {
        // Next largest element
        int a[] = {1,3,2,4} ;
        List<Integer> ll = nextLargestElementToLeft(a,a.length) ;
        for (int i : ll){
            System.out.print(i + " "); // -1 -1 3 -1 correct
        }
    }

    public static List<Integer> nextLargestElementToLeft(int[]a, int n){

        List<Integer> vector = new ArrayList<>() ;
        Stack<Integer> s = new Stack<>() ;

        for (int i = 0 ; i < n; i++){
            if (s.empty()){
                vector.add(-1) ;
            }
            else if (!s.empty() && a[i] < s.peek()){
                // idhar hum aainge
                vector.add(s.peek()) ;
            }
            else if (!s.empty() && a[i] > s.peek()){
                while (!s.empty() && a[i] >= s.peek()){
                    s.pop() ;
                }
                if (s.empty()){
                    vector.add(-1) ;
                }
                else {
                    // hum aainge
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
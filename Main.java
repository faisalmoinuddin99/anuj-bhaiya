import java.util.*;

public class Main {
    public static void main(String[] args) {

        //  Stock Span Problem
        int[] a = {100,80,60,70,60,75,85} ;

        List<Integer> ans = stockSpanProblem(a,a.length) ;
        for (int i : ans){
            System.out.print(i + " ");
        }
    }

    public static List<Integer> stockSpanProblem(int[] a, int n) {
        Stack<Integer> stack = new Stack<>() ;
        List<Integer> vector = new ArrayList<>() ;
        for (int i = 0 ; i < n; i++){
            int cnt = 1 ;
            if (stack.empty()){
                vector.add(1) ;
            }
            else if (!stack.empty() && a[i] <= stack.peek()){
                vector.add(1) ;
            }else if (!stack.empty() && a[i] >= stack.peek()){
                for (int j = i-1 ; j >= 0; j--) {
                    if (a[i] > stack.get(j)) {
                        cnt++ ;
                    }else break;
                }
                vector.add(cnt) ;
            }
            stack.push(a[i]) ;
        }
       return vector ;
    }
}


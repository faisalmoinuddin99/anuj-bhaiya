import java.util.*;

public class Main {

    static class Pair{
        int first ;
        int second ;

        public Pair(int key, int value){
            this.first = key ;
            this.second = value ;
        }

    }
    public static void main(String[] args) {

        //  Stock Span Problem
        int[] a = {100,80,60,70,60,75,85} ;

        List<Integer> ans = stockSpanProblem(a,a.length) ;
        for (int i : ans){
            System.out.print(i + " "); // 1 1 1 2 1 4 6  ANS
        }
    }
    public static List<Integer> nearestGreatestElementToLeft(int[] a, int n){

        List<Integer> vector = new ArrayList<>() ;
        Stack<Pair> stack = new Stack<>() ;
        for (int i = 0 ; i < n; i++){
            if (stack.empty()){
                vector.add(-1) ;
            }
            else if (!stack.empty() && a[i] < stack.peek().first){
                vector.add(stack.peek().second) ;
            }
            else if(!stack.empty() && a[i] > stack.peek().first){
                while (!stack.empty() && a[i] >= stack.peek().first){


                    stack.pop() ;
                }
                if (stack.empty()){
                    vector.add(-1) ;
                }else {
                    vector.add(stack.peek().second) ;
                }
            }
            stack.push(new Pair(a[i],i)) ;
        }
        return vector ;
    }

    public static List<Integer> stockSpanProblem(int[] a, int n){

        List<Integer> vector1 = nearestGreatestElementToLeft(a,n) ;
        List<Integer> finalVector = new ArrayList<>() ;
        for(int i = 0 ; i < n; i++){
            finalVector.add(i - vector1.get(i)) ;
        }
        return finalVector ;
    }

}


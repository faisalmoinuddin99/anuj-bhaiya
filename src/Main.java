import java.util.*;

public class Main {

    static public class Pair{
        private int first ;
        private int second ;

        public Pair(int first, int second) {
            this.first = first;
            this.second = second;
        }
    }
    public static void main(String[] args) {
        int[] a = {5,5,1,7,1,1,5,2,7,6} ;
        int n = a.length ;

      int maxLengthOfHistogram =  getMaxArea(a,n) ;
        System.out.println();
        System.out.println("Max height: " + maxLengthOfHistogram);
    }
    public static int getMaxArea(int[] arr, int size){
        int width[] = new int[size] ;
        int right[] = new int[size] ;
        int left [] = new int[size] ;
        int height[] = new int[size] ;
        right = NSR(arr,size) ;
        left = NSL(arr,size) ;
        for (int i = 0; i < size; i++){
            width[i] = right[i] - left[i] - 1 ;
            height[i] = arr[i] * width[i] ;
        }
        System.out.println("width: ");
        for (int i: width){
            System.out.print(i + " ");
        }
        System.out.println("Height: ");
        for (int i: height){
            System.out.print(i + " ");
        }

        return Arrays.stream(height).max().getAsInt() ;
    }
    public static int[] NSR(int[] a ,int size){
        Stack<Pair> stack = new Stack<>() ;
        int[] right = new int[size] ;
        for (int i = size - 1; i >= 0 ; i--){
            if (stack.empty()){
                right[i] = size ;
            } else if (!stack.empty() && a[i] > stack.peek().first) {
                right[i] = stack.peek().second ;
            } else if (!stack.empty() && a[i] <= stack.peek().first) {
                while (!stack.empty() && a[i] <= stack.peek().first){
                    stack.pop() ;
                }
                if (stack.empty()){
                    right[i] = size ;
                }else {
                    right[i] = stack.peek().second ;
                }
            }
            stack.push(new Pair(a[i],i)) ;
        }
        System.out.print("Smallest element to Right: ");
        for (int i : right){
            System.out.print(i + " ");
        }
        return right;
    }
    public static int[] NSL(int[] a, int n){
        Stack<Pair> stack = new Stack<>() ;
        int[] left = new int[n] ;
        for (int i = 0 ; i < n; i++){
            if (stack.empty()){
                left[i] = -1 ;
            }
            else if(!stack.empty() && a[i] > stack.peek().first){
                    left[i] = stack.peek().second ;
            }
            else if (!stack.empty() && a[i] <= stack.peek().first){
                while (!stack.empty() && a[i] <= stack.peek().first){
                    stack.pop() ;
                }
                if (stack.empty()){
                    left[i] = -1 ;
                }else {
                    left[i] = stack.peek().second ;
                }
            }
            stack.push(new Pair(a[i], i)) ;
        }
        System.out.print("Smallest element to Left: ");
        for (int i : left){
            System.out.print(i + " ");
        }
        return left ;
    }
}

/*
a = {5,5,1,7,1,1,5,2,7,6} ;
Smallest element to Right Index: 2 2 10 4 10 10 7 10 9 10  here -1 is replaced with = a.length
The Smallest element to Left Index: -1 -1 -1 2 -1 -1 5 5 7 7
width: 2 2 10 1 10 10 1 4 1 2
Height: 10 10 10 7 10 10 5 8 7 12
Max height: 12
 */
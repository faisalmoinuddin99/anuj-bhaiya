import java.util.*;

public class Main {

    public static Stack<Integer> stack = new Stack<>();
    public static Stack<Integer> supportStack = new Stack<>();
    public static void main(String[] args) {

        int[] a = {18,19,29,15,16} ;
        pushElement(-2);
        pushElement(0);
        pushElement(-3);
       int min = getMin() ;
        popElement() ;
        System.out.println(stack.peek());
        min = getMin() ;
        System.out.println("Minimum element: "+min);
        for (int i: stack){
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i : supportStack){
            System.out.print(i + " ");
        }

    }
    public static void pushElement(int x){
        stack.push(x) ;
        if (supportStack.empty() || supportStack.peek() >= x){
            supportStack.push(x) ;
        }
    }

    public static int popElement(){
        int ans = stack.pop() ;
        if (stack.empty()) return -1 ;
         if(supportStack.peek() == ans) {
             supportStack.pop();
         }
        return ans;
    }

    public static int getMin() {
        if (supportStack.empty()){
            return -1 ;
        }
        return supportStack.peek() ;
    }

}

/*
Minimum element: 1
18 19 29 16 1
18 16 1
 */
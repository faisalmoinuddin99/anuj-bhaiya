import java.util.*;

public class Main {

    static public class Pair {
        private int first;
        private int second;

        public Pair(int key, int value) {
            this.first = key;
            this.second = value;
        }
    }

    public static void main(String[] args) {
        // Maximum area of histogram
        int[] a = {5,5,1,7,1,1,5,2,7,6};

        int leet = largestRectangleArea(a) ;
        System.out.println("Max area of histogram: "+ leet);
    }
    public static int largestRectangleArea(int[] heights) {
        List<Integer> ans = maxAreaOfHistogram(heights);
        for (int i : ans){
            System.out.print(i + " ");
        }
        return Collections.max(ans) ;
    }

    public static List<Integer> maxAreaOfHistogram(int []a){
        List<Integer> NSLIndex = NSL(a) ; // -1 -1 1 1 3 -1 5
        List<Integer> NSRIndex = NSR(a) ;
        Collections.reverse(NSRIndex); // 1 5 3 5 5 7 7


        // print NSR and NSL
        System.out.println("Nearest Smallest to Right");
        for (int i : NSRIndex) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("Nearest Smallest to Left");
        for (int i : NSLIndex) {
            System.out.print(i + " ");
        }
        System.out.println();




        // width[i] = NSRIndex[i] - NSLIndex[i] - 1

        List<Integer> width = new ArrayList<>() ;
        for (int i = 0 ; i < NSLIndex.size(); i++){
            int widthOfRectangle = NSRIndex.get(i) - NSLIndex.get(i) ;
            width.add(widthOfRectangle) ;
        }
        List<Integer> heights = new ArrayList<>() ;
        for (int i = 0 ; i < width.size(); i++){
           // calculate area of histogram
            heights.add(width.get(i) * a[i]) ;
        }
        return heights ;
    }

    public static List<Integer> NSR(int[] a) {
        List<Integer> rightList = new ArrayList<>();
        Stack<Pair> stack = new Stack<>();

        for (int i = a.length - 1; i >= 0; i--) {
            if (stack.empty()) {
                rightList.add(a.length);
            } else if (!stack.empty() && a[i] >= stack.peek().first) {
                rightList.add(stack.peek().second);
            } else if (!stack.empty() && a[i] <= stack.peek().first) {
                while (!stack.empty() && a[i] <= stack.peek().first) {
                    stack.pop();
                }
                if (stack.empty()) {
                    rightList.add(a.length);
                } else {
                    rightList.add(stack.peek().second);
                }
            }
            stack.push(new Pair(a[i], i));
        }
        return rightList;
    }

    public static List<Integer> NSL(int[] a) {
        List<Integer> leftList = new ArrayList<>();
        Stack<Pair> stack = new Stack<>();
        int pseudoIndex = -1 ;
        for (int i = 0; i < a.length; i++) {
            if (stack.empty()) {
                leftList.add(pseudoIndex);
            } else if (!stack.empty() && a[i] >= stack.peek().first) {
                leftList.add(stack.peek().second);
            } else if (!stack.empty() && a[i] <= stack.peek().first) {
                while (!stack.empty() && a[i] <= stack.peek().first) {
                    stack.pop();
                }
                if (stack.empty()) {
                    leftList.add(pseudoIndex);
                } else {
                    leftList.add(stack.peek().second);
                }
            }
            stack.push(new Pair(a[i], i));
        }

        return leftList;
    }
}
import java.util.*;


public class Main {
    public static void main(String[] args) {

        int[] a = {9,6,4,2,3,5,7,0,1};
//        findRepeatingElementApproach1(a);
//        findRepeatingAndMissingNumberApproach2(a);
        findRepeatingAndMissingNumberApproach3(a);

    }

    public static void findRepeatingElementApproach1(int[] a) {
        int b[] = new int[a.length + 1];
        int indexPlacer = 0;
        for (int i = 0; i < a.length; i++) {
            int count = 1;
            indexPlacer = a[i];
            if (b[indexPlacer] != count) {
                b[indexPlacer] = count;
            } else {
                b[indexPlacer] = ++count;
            }
        }

        for (int i = 1; i <= a.length; i++) {
            if (b[i] > 1) {
                System.out.println("Reapeated element: " + i);
            } else if (b[i] == 0) {
                System.out.println("Missing element: " + i);
            }
        }
    }

    public static void findRepeatingAndMissingNumberApproach2(int[] a) {
        // 1. calculate sum of a.length natural number
        long n = a.length;

        long S = (n * (n + 1)) / 2;

        // 2. calculate sum of square of a.length natural number
        long S2 = (n * (n + 1) * ((2 * n) + 1)) / 6;

        // 3. S - [4 + 3 + 6 + 2 + 1 + 1]
        long someOfArrayElements = 0;
        for (int i = 0; i < a.length; i++) {
            someOfArrayElements += a[i];
        }


        long eq1 = S - someOfArrayElements;

        // 4. S2 - [sq(4) + sq(3) + sq(6) + sq(2) + sq(1) + sq(1)]
        long someOfArraySquareElement = 0;
        for (int i = 0; i < a.length; i++) {
            someOfArraySquareElement = someOfArraySquareElement + (a[i] * a[i]);
        }


        long eq2 = S2 - someOfArraySquareElement;
        System.out.println("x - y = " + eq1);
        System.out.println("x2 - y2 = " + eq2);

        // eq1: x - y = 4  and eq2: x2 - y2 = 24
        // where x is the missing number and y is the repeating number
        long x = 0;

        x = eq2 / eq1;
        System.out.println("x + y=(24/4) " + x);

        long missingNumber = (eq1 + x) / 2;
        System.out.println("Missing number: " + missingNumber);

        long repeatingNumber = (x - missingNumber);
        System.out.println("Repeating number: " + repeatingNumber);
    }

    public static void findRepeatingAndMissingNumberApproach3(int[] a) {
        // xor method
        int x = 0;
        for (int i = 0; i < a.length; i++) {
            x = x ^ a[i];
        }
        int n = a.length;
        int res = x ^ calOneToNXor(n) ; // (4^3^6^2^1^1) ^ (1^2^3^4^5^6) == 3 ^ 7
        System.out.println("resultant: "+res);

        // check the right most set bit
        int cnt = 0 ;
        int rightMostSetBit = res ;
        while(rightMostSetBit != 0){
            if((rightMostSetBit & 1) == 1){
                break ;
            }
            cnt++ ;
            rightMostSetBit = rightMostSetBit >> 1;
        }

       // now segregate into set bit
        List<Integer> leftBucket = new ArrayList<>() ;
        List<Integer> rightBucket = new ArrayList<>() ;

        for (int i = 0; i < a.length; i++){
            if ((a[i] & res) > 0){
//                leftBucket[i] = a[i] ;
                leftBucket.add(a[i]) ;
            }else {
//                rightBucket[i] = a[i] ;
                rightBucket.add(a[i]) ;
            }
        }

        System.out.println();
        System.out.println(leftBucket);
        System.out.println(rightBucket);
        for (int i = 1; i <= a.length; i++){
            if ((i & res) > 0){
                leftBucket.add(i) ;
            }else {
                rightBucket.add(i) ;
            }
        }

        int missingElementX =  0 ;
        int repeatedElementY = 0 ;
        for (int i = 0 ; i < leftBucket.size(); i++){
            missingElementX = missingElementX ^ leftBucket.get(i) ;

        }

        for (int i = 0 ; i < rightBucket.size(); i++){
            repeatedElementY = repeatedElementY ^ rightBucket.get(i) ;
        }
        System.out.println("missingElement: "+ missingElementX);
        System.out.println("repeatedElement: "+ repeatedElementY);
    }

    public static int calOneToNXor(int n) {
        int mod = n % 4;
        if (mod == 0) return n;

        if (mod == 1) return 1;

        if (mod == 2) return n + 1;

        return 0;
    }
}

/*
Missing element: 8 --- Approach 1
x - y = 8
x2 - y2 = 64
x + y=(24/4) 8
Missing number: 8   --- Approach 2
Repeating number: 0
 */
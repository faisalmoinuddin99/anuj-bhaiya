import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        // GAP Method
        int a1[] = {1, 4, 7, 8, 10};
        int a2[] = {2, 3, 9};

        int n = a1.length;
        int m = a2.length;

        // calculate gap
        int gap = (n + m + 1) / 2;

        while (gap > 0) {

            // now set the two pointers
            int first = 0;
            int last = first + gap;

            // 1. initial traversing array 1
            while (last < a1.length) {
                if (a1[first] > a1[last]) {
                    swap(a1, a1, first, last);
                }
                first++;
                last++;
            }
            // 2. first array exhausted
            last = last - a1.length ;
            while (first < a1.length && last < a2.length){
                if (a1[first] > a2[last]){
                    swap(a1,a2,first,last);
                }
                first++ ;
                last++ ;
            }


            // if only first array is exhausted ... but not second
            if (first == a1.length && last < a2.length) {
                first = 0;
                // 3. last traversing array 2
                while (last < a2.length) {
                    if (a2[first] > a2[last]) {
                        swap(a2, a2, first, last);
                    }
                    first++;
                    last++;
                }
            }

            if (gap == 1) {
                break;
            }
            // decrement gap by its window size
            gap = (gap + 1) / 2;
        }

        for (int i : a1) {
            System.out.print(i+" ");
        }
        System.out.println();
        for (int i : a2) {
            System.out.print(i + " ");
        }
    }

    public static void swap(int a1[], int a2[], int fist, int last) {
        int temp = 0;
        temp = a2[last];
        a2[last] = a1[fist];
        a1[fist] = temp;
    }
}
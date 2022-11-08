public class Main {
    public static void main(String[] args) {
        // Next Permutation
        int[] a = {1, 3, 5, 4, 2} ;

        nextPermutation(a);
        for(int i: a){
            System.out.print(i + " "); // 1 4 2 3 5
        }
    }
    public static void nextPermutation(int [] a){
        if (a == null || a.length <= 1) return;

        // check the break points
        int i = a.length - 2 ;

        while (i >= 0 && a[i] >= a[i+1]) i-- ;

        if (i >= 0){
            int j = a.length - 1;
            while (a[j] <= a[i]) j-- ;
            swap(a,i,j);
        }
        reverse(a,i+1,a.length - 1);
    }
    public static void swap(int [] a, int i, int j){
        int temp = a[i] ;
        a[i] = a[j] ;
        a[j] = temp ;
    }
    public static void reverse(int [] a, int i, int j){
        while (i < j) swap(a,i++,j--);
    }
}
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        long a[] = {1,3,5,7} ;
        long b[] = {0,2,6,8,9} ;
        int n = a.length ;
        int m = b.length ;

        System.out.println(m + " " + n);
        merge(a,b,m,n);

    }
    public static void merge(long a[], long b[], int m , int n ){
        long temp = 0 ;

            // which means b array is bigger
            for(int i = 0 ; i < a.length; i++){
                for (int j = 0 ; j < b.length ;j++){
                    if (a[i] > b[j] ){
                        temp = a[i] ;
                        a[i] = b[j] ;
                        b[j] = temp ;

                        Arrays.sort(b);
                    }
                }

        }
            for (long i : a){
                System.out.print(i + " ");
            }
        for (long i : b){
            System.out.print(i + " ");
        }
    }

}

/*
0 1 2 3 5 6 7 8 9
 */
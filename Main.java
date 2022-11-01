import java.util.*;


public class Main {
    public static void main(String[] args) {

        int[] a = {4, 3, 6, 2, 1, 1};
        findMissingElement(a);
    }

    public static void findMissingElement(int a[]) {
        int[] check = new int[a.length + 1];
        int n = a.length;

        int setIndex = 0;
        for (int i = 0; i < n; i++) {
            int count = 1 ;
            setIndex = a[i];
            if (check[setIndex] != count){
                check[setIndex] = count;
            }else{
                check[setIndex] = ++count ;
            }

        }

       for (int i = 0 ; i < check.length; i++){
           if (check[i] != 1){
               System.out.print("Missing: "+i+ " ");
           }


       }

    }
}
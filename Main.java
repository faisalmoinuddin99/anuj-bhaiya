import java.util.*;


public class Main {
    public static void main(String[] args) {
       int a[] = {2,3,1,2,3} ;
       int res = findDuplicate(a) ;
        System.out.println(res);
    }
    public static int findDuplicate(int [] a){
      // using tortoise and hare algorithm
        int tortoise = a[0] ;
        int hare = a[0] ;

        do{
            tortoise = a[tortoise] ;
            hare = a[a[hare]] ;
        }while (tortoise != hare) ;

        hare = a[0] ;
        while (tortoise != hare){
            tortoise = a[tortoise] ;
            hare = a[hare] ;
        }
        return hare ;
    }

}
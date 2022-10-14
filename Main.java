import java.util.*;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

    /*
    Bit manipulation: count the number of miss matching bits
     */
        ArrayList<Integer> arr = new ArrayList<>() ;
        arr.add(1) ;
        arr.add(3) ;
        arr.add(5) ;

      int result = cntBits(arr) ;
        System.out.println(result);
    }
    public static int missMatchingBits(int a, int b){
        int n ;
        int count = 0 ;
        n = a ^ b ;
        while (n != 0 ){
            n = (n & (n-1)) ;
            count ++ ;
        }
        return count ;
    }


    public static int cntBits(ArrayList<Integer> A) {
        List<Integer> arrayLists = new ArrayList<>() ;
        for(int i = 0 ; i < A.size(); i++) {
            for(int j = 0 ; j < A.size(); j++){
//                System.out.println("f("+A.get(i) +","+A.get(j)+")");
                arrayLists.add(missMatchingBits(A.get(i),A.get(j))) ;
            }
        }
        int sum = arrayLists.stream().reduce(0,((integer1, integer2) -> integer1 + integer2 )) ;
//        System.out.println(sum);
        return sum ;
    }


}

/*
OUTPUT: 5

 */